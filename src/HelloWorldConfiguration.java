package com.capgemini.config;
import com.capgemini.provider.MessageProvider;
import com.capgemini.provider.implementer.HelloMessageProvider;
import com.capgemini.provider.GmMessageProvider;
import com.capgemini.renderer.MessageRenderer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HelloWorldConfiguration {
@Bean
public MessageProvider provider() {
return new HelloMessageProvider();
}
@Bean
public MessageRenderer renderer(){
MessageRenderer renderer = new MessageRenderer();
renderer.setMessageProvider(provider());
return renderer;
}}