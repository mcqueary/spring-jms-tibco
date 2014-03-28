spring-jms-tibco
================

Example(s) of configuring and using TIBCO EMS via the Spring JMS JmsTemplate


This is a simple example of using TIBCO EMS (tibjms) with Spring JMS
The TIBCO EMS jar file (tibjms.jar) should be copied to your local maven 
repository using the following command (substituting the correct pathnames
and version):

mvn install:install-file -Dfile=/home/larry/tibco/ems/7.0/lib/tibjms.jar \
	-DgroupId=com.tibco -DartifactId=tibjms -Dversion=7.0.1 -Dpackaging=jar
	
mvn install:install-file -Dfile=/home/larry/tibco/ems/7.0/lib/tibcrypt.jar \
	-DgroupId=com.tibco -DartifactId=tibcrypt -Dversion=7.0.1 -Dpackaging=jars
