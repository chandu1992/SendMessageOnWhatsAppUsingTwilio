package com.bsl.WhatsAppMessagingService;

import com.twilio.Twilio;
import com.twilio.converter.Promoter;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;

import java.net.URI;
import java.math.BigDecimal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class WhatsAppMessagingServiceApplication {

  
  public static final String ACCOUNT_SID = "AC6e3dc424f3fb5c4bb325d187ca8c80fc";
  public static final String AUTH_TOKEN = "2486ed9a6233fde98977b8cfbd6b5791";
  
  static String msg ="Dear Chandrashekhar Pande,\n \n" + "You are mark as a absent on 9 MAY 2023 kindly fill up on duty ASAP \n\n"
  +"Path: Myworld >> Quick Access Function >> Onduty \n \n" + "Regards, \n"+"Myworld Team"
		  ;


	public static void main(String[] args) {
		SpringApplication.run(WhatsAppMessagingServiceApplication.class, args);
		
		Twilio.init(ACCOUNT_SID, AUTH_TOKEN);
	    Message message = Message.creator(
	      new com.twilio.type.PhoneNumber("whatsapp:+918975030214"),
	      new com.twilio.type.PhoneNumber("whatsapp:+14155238886"),
	      msg)

	    .create();

	    System.out.println(message.getSid());
	}

}
