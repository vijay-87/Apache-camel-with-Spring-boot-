package com.camelservicesample.activemqsender;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

//@Component
public class ActiveMqSender extends RouteBuilder {

	@Override
	public void configure() throws Exception {

		// Normal Json format file sending to activemq
//		
//		from("file:files/input")
//
//				.log("${body}")
//
//				.to("activemq:myactivemq-normaljson-queue");

		// Json file receiving from active mq with content

//		from("activemq:myactivemq-normaljson-queue")
//		
//		.to("log:received-message-from-activemq");

		// Normal format xml send to activemq

		from("file:files/input")

				.log("${body}")

				.to("activemq:myactivemq-normal xml-queue");

		// xml file receiving from active mq

//		from("activemq:myactivemq-normal xml-queue")
//		
//		.log("${body}")
//		
//		.to("log:received-message-from-activemq");

	}

}
