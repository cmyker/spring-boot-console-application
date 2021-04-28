package com.example.demo;

import com.example.demo.model.DemoModel;
import com.example.demo.repository.DemoModelRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Profile;

import java.util.Arrays;

@SpringBootApplication
@Profile("import") // run only under active profile "import"
public class ImportApplication implements CommandLineRunner {

    private static final Logger log = LoggerFactory.getLogger(ImportApplication.class);

    private final DemoModelRepository demoModelRepository;

    public ImportApplication(DemoModelRepository demoModelRepository) {
        this.demoModelRepository = demoModelRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        log.info("Importing data {}", Arrays.toString(args));
        for (String arg : args) {
            DemoModel demoModel = new DemoModel();
            demoModel.setDemoField(arg);
            demoModelRepository.save(demoModel);
            log.info("Imported {}", demoModel);
        }
    }
}
