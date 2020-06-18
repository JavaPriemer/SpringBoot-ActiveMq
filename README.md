# SpringBoot-ActiveMq
activemq example

@SpringBootApplication is an annotation that adds all of the following:

@Configuration makes the class as a source of bean definitions for the application context.
@EnableAutoConfiguration enables Spring boot to add beans presents in classpath setting and various property setting.
This flags the application as a web application and activates key behaviors such as setting up a DispatcherServlet.
@ComponentScan tells Spring to look for other components, configurations, and services in the default package, allowing it to find the controllers.
If specific packages are not defined, scanning will occur from the package of the class that declares this annotation.
@EnableJMS annotation is used to trigger search for method annotated with @JMSListener, hence to create JMS listener in the background.
