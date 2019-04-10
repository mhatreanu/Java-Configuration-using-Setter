package com.capgemini.test;
import com.capgemini.config.HelloWorldConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.capgemini.renderer.*;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test{

	public static void main (String[] args)

		{

			ApplicationContext context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);
			MessageRenderer renderer = context.getBean("renderer",MessageRenderer.class);
			renderer.render();

		}
}