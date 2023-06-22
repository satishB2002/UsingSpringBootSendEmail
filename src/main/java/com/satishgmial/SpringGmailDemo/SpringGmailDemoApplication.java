package com.satishgmial.SpringGmailDemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

@SpringBootApplication
public class SpringGmailDemoApplication {
	@Autowired
	private EmailSenderService emailSenderService;

	public static void main(String[] args) {
		SpringApplication.run(SpringGmailDemoApplication.class, args);
	}
	@EventListener(ApplicationReadyEvent.class)
	public void  sendEmail()
	{
		emailSenderService.sendEmail("gorakh.shewale@anemoisoftware.com.au", "Task Completed",  "Using Spring Boot To Send Mail ");
		
		
		
		//(toEmail:"baratesatish098@gmail.com",
							//		subject :"This is Subject",
								//	body: "This is Body Email");
	}

}
