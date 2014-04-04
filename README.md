spring-jms-tibco
================

Example(s) of configuring and using TIBCO EMS via the Spring Framework JmsTemplate

This is a simple example of using TIBCO EMS (com.tibco.tibjms) with Spring 
JMS. Most existing Spring JmsTemplate samples are either out of date (JMS 1.0.2),
or refer to ActiveMQ-specific extensions, or both. This can be confusing and/or 
distracting when trying to adapt those examples to a generic JMS 1.1 broker 
implementation such as TIBCO Enterprise Message Service (EMS). 

This example is provided mainly to demonstrate and help you verify:

1. A correct Spring JmsTemplate setup for both JNDI and non-JNDI EMS configuration 
2. That you can achieve basic connectivity with EMS and send and receive messages
   to/from EMS with this Spring configuration.

Please note that you will need to start your own licensed EMS broker (tibemsd) in 
order to run the contained JUnit tests.

About the dependencies
======================

This project was built using Maven 3, therefore all direct dependencies are explicitly
stated in the pom.xml. Also, all dependencies (other than the EMS jars) are available 
in the standard public maven repos. 

For the sake of simplicity, and to avoid any "system" dependencies and troubleshooting
that might distract from the purpose of this simple demo, the pom.xml assumes you have 
installed your own licensed copies of the following jars to your local maven repository 
(for EMS 7 and below):

tibjms.jar
tibcrypt.jar
jms.jar
 
Use "mvn install:install-file" to accomplish this, as follows (substituting the
correct pathnames and version numbers): 

mvn install:install-file -Dfile=/Users/larry/tibco/ems/7.0/lib/tibjms.jar \
	-DgroupId=com.tibco -DartifactId=tibjms -Dversion=7.0.1 -Dpackaging=jar
	
mvn install:install-file -Dfile=/Users/larry/tibco/ems/7.0/lib/tibcrypt.jar \
	-DgroupId=com.tibco -DartifactId=tibcrypt -Dversion=7.0.1 -Dpackaging=jars

mvn install:install-file -Dfile=/Users/larry/tibco/ems/7.0/lib/jms.jar \
	-DgroupId=com.tibco -DartifactId=jms -Dversion=7.0.1 -Dpackaging=jars

For EMS 8 and above, the same applies, but change "jms.jar" to "jms-2.0.jar" and 
update the POM accordingly.
