>> Create Dynamice Web project.
	Note:: Dont Forget to generate the web.xml 
	
>> Convert to MAVEN Project.
	Note :: Add Required Librarries :: For refere pom.xml (SANTOSH)
	
>>  Add Servlet Mapping to your web.xml file.
	<servlet>
		<servlet-name>springmvc</servlet-name>
		<servlet-class>org.springframework.web.servlet.DispatcherServlet</servlet-class>
	</servlet>
	
	<servlet-mapping>
		<servlet-name>springmvc</servlet-name>
		<url-pattern>/spring/*</url-pattern>
	</servlet-mapping>
	
	
>> Creaate Spring Configuration File. 
	Note :: Nameing Convention :: ${servletname}-servlet.xml
	
	

>> Practical Usage of Configuration File
	>> context:component-scan (base-package)
	>> mvc:annotation-driven
	
	
>> Add View/JSP Configuration (View Binding)
	>> Note :: Create appropriate folders.
	

>> Create your First COntroller
	Note :: Class must be in appropriate package
	NOte :: Apply Annotation


