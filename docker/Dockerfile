FROM java:latest
VOLUME /tmp
RUN mkdir /app
ADD spring-cloud-eureka-serverA-1.3.5.RELEASE.zip /app/app.zip
RUN unzip /app/app.zip
EXPOSE 8761
ENTRYPOINT ["bash","start.sh"]