package com.kyawzayar.config;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

public class ApplicationInitializer implements WebApplicationInitializer {

	public void onStartup(ServletContext servletContext) throws ServletException {
		
		  // Component Scan and Register ApplicationConfig class
		  AnnotationConfigWebApplicationContext webApplicationContext = new AnnotationConfigWebApplicationContext();
		  webApplicationContext.register(ApplicationConfig.class);

		  // Create Dispatcher Servlet Object
		  DispatcherServlet servlet = new DispatcherServlet(webApplicationContext);
		  
		  // Register Dispatcher Servlet with servlet context
		  ServletRegistration.Dynamic myCustomDispatcherServlet = servletContext.addServlet("myDispatcherServlet",
		      servlet);
		  
		  // Configure load on startup
		  myCustomDispatcherServlet.setLoadOnStartup(1);
		  
		  // URL Mapping for dispatcher servlet
		  myCustomDispatcherServlet.addMapping("/");    


	}

}
