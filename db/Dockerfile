FROM mysql/mysql-server:8.0.32

MAINTAINER lengleng(wangiegie@gmail.com)

ENV TZ=Asia/Shanghai

RUN ln -sf /usr/share/zoneinfo/$TZ /etc/localtime && echo $TZ > /etc/timezone

COPY ./neomgcomm.sql /docker-entrypoint-initdb.d

COPY ./neomgcomm_codegen.sql /docker-entrypoint-initdb.d

COPY ./neomgcomm_config.sql /docker-entrypoint-initdb.d

COPY ./neomgcomm_job.sql /docker-entrypoint-initdb.d

EXPOSE 3306
