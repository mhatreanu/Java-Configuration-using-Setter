package com.capgemini.renderer;
import com.capgemini.provider.MessageProvider;
import com.capgemini.provider.implementer.HelloMessageProvider;
import com.capgemini.provider.GmMessageProvider;

	public class MessageRenderer{

		private MessageProvider provider;

		public void setMessageProvider(MessageProvider provider){
			
			this.provider=provider;
		}
		public void render(){
		
			System.out.println(provider.printMessage());
		}
}