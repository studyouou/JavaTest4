FROM mysql:5.7
COPY ./my.cnf /etc/mysql/
COPY ./1-sakila-schema.sql ./docker-entrypoint-initdb.d/
COPY ./2-sakila-data.sql ./docker-entrypoint-initdb.d/
