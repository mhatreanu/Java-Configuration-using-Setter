package com.capgemini.provider.implementer;
import com.capgemini.provider.MessageProvider;


	public class HelloMessageProvider implements MessageProvider{
		
		public String printMessage(){

			return "Hello";
		}
	}