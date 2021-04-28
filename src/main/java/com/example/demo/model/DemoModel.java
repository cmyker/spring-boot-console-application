package com.example.demo.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document
public class DemoModel {

    @Id
    private String id;

    @Field
    private String demoField;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDemoField() {
        return demoField;
    }

    public void setDemoField(String demoField) {
        this.demoField = demoField;
    }

    @Override
    public String toString() {
        return "DemoModel{" +
            "id='" + id + '\'' +
            ", demoField='" + demoField + '\'' +
            '}';
    }
}
