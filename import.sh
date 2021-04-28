#!/bin/bash

mvn -q spring-boot:run -Dspring-boot.run.jvmArguments="-Dspring.profiles.active=import" -Dspring-boot.run.arguments="$*"