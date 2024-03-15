FROM alibabadragonwell/dragonwell:21-anolis

WORKDIR /neomgcomm-codegen

ARG JAR_FILE=target/neomgcomm-codegen.jar

COPY ${JAR_FILE} app.jar

EXPOSE 5002

ENV TZ=Asia/Shanghai JAVA_OPTS="-Xms128m -Xmx256m -Djava.security.egd=file:/dev/./urandom"

CMD sleep 60; java $JAVA_OPTS -jar app.jar
