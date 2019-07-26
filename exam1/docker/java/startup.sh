#!/bin/bash
java -jar ./exam1/target/exam1.jar --spring.datasource.port=${PORT} --spring.datasource.host=${HOST} --spring.datasource.shemae=${SHEMAE} --spring.datasource.username=${USERNAME} --spring.datasource.password=${PASSWORD}

