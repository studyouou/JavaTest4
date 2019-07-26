#!/bin/bash
echo "$HOST $PORT"
while ! nc -z $HOST $PORT
do
sleep 3
done
echo "连接就绪，准备启动"
java -jar ./exam1.jar --spring.datasource.port=${PORT} --spring.datasource.host=${HOST} --spring.datasource.shemae=${SHEMAE} --spring.datasource.username=${USERNAME} --spring.datasource.password=${PASSWORD}

