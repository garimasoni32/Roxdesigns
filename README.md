# Roxdesigns

Roxdesigns is a web application to create wireframes using Cacoo API.



#####
# Development environment of this sample.

- Java 6 or newer
- Apache Tomcat
- Eclipse 3.6 and WTP Plug-in

#####
# If you don't have Cacoo account yet, please sign-up to create Cacoo account.

#####
# Register Your Application at "https://cacoo.com/profile/apps" and get key strings.

#####
# Replace with your "Consumer Key" and "Consumer Secret" into src/com/cacoo/apisample/cacoo/CacooUtils.java

	private static final String CONSUMER_KEY = "-- Consumer Key --";
	private static final String CONSUMER_SECRET = "-- Consumer Secret --";


#####
# Add login users to your Apache Tomcat.

You can specify users to write $TOMCAT_HOME/conf/tomcat-users.xml, like below (adding user "testuser / pass" as "myapp" role).
===
<?xml version="1.0" encoding="UTF-8"?>
<tomcat-users>
  <role rolename="myapp"/>
  <user username="testuser" password="pass" roles="myapp"/>
</tomcat-users>
===

#####
# Build this sample and deploy into Apache Tomcat, then start it.

If you can not build sample, please fix build path for libraries, (JDK, Web Application Runtime).


