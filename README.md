# config-client
config-client integration with config-server for spring cloud bus using kafka MQ
# config-client
config-client to create multiple instances to check spring cloud &amp; bus feature with kafka as MQ

#commands to up zookeper and kafka when you're in kafka folder

.\bin\windows\zookeeper-server-start.bat .\config\zookeeper.properties
.\bin\windows\kafka-server-start.bat .\config\server.properties

#command to run spring boot instance on particular port using gradlew
./gradlew bootRun --args='--server.port=8082'
