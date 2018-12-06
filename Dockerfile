FROM tomcat:9.0.0.M25
MAINTAINER yasaka "1145041715@qq.com"
#设置Java环境变量
ENV JAVA_OPTS -server -Duser.timezone="Asia/Shanghai"
COPY docker.war ${CATALINA_HOME}/webapps/dockerdemo1-0.0.1-SNAPSHOT.war
EXPOSE 8080