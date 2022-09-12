# SpringBoot-HelloWorld
Demonstration of how to create a Spring Boot "Hello World" Application with IntelliJ IDEA and Spring Initializr.

Apache Tomcat by default is set to port 8080. When you have the HelloWorld application running, navigate on your browser to: http://localhost:8080. The additional classes that we added after the spring initializer were the HelloWorldController which is our RestController class and then a test class to test for the controller response.

## Spring Initializr
* Project: Maven Project
* Language: Java
* Spring Boot: 2.7.3
* Group: com.springdemo
* Artifact: demo
* Name: HelloWorld
* Description: Demo project for Spring Boot
* Package Name: com.springdemo.demo
* Packaging: jar
* Java: 11

## Dependencies pom.xml
* Spring Web: Build web, including RESTful, applications using Spring MVC. Uses Apache Tomcat as the default embedded container.
* NOTE: (Command + N) on Mac when hovering over the pom.xml file allows you to search and add more dependencies whenever you want.
