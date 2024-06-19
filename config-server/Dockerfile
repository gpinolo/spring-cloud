FROM bellsoft/liberica-openjdk-alpine:18

RUN mkdir "config-server"

COPY "target/config-server-0.0.1-SNAPSHOT.jar" ./config-server

RUN mkdir "/root/etc"

COPY etc /root/etc

RUN mv "/root/etc/git" "/root/etc/.git"

WORKDIR /config-server

#moved in docker-compose.yml
#EXPOSE 8888
#ENTRYPOINT ["java","-jar","config-server-0.0.1-SNAPSHOT.jar"]
