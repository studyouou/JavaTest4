FROM 304489914/java:v1
ENV PORT=3306
ENV HOST=192.168.43.201
ENV SHEMAE=sakila
ENV USERNAME=root
ENV PASSWORD=mysql123
COPY ./startup.sh .
COPY ./wait-for-it.sh .
COPY ./exam1.jar .
RUN chmod 777 ./startup.sh
RUN chmod 777 ./wait-for-it.sh
#ENTRYPOINT ["/bin/bash"]
ENTRYPOINT ["/bin/bash","-c","./wait-for-it.sh ${HOST}:${PORT} -- ./startup.sh"]
