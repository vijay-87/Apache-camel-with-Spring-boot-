package com.camelservicesample.converting;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

//@Component
public class XmlIntoJson extends RouteBuilder {

	@Override
	public void configure() throws Exception {

		
		// converting multiple xml objects into json
		
		from("file:files/input")

				.unmarshal().jacksonXml()

				.marshal().json()

				.log("${body}")
				
				.to("activemq:myactivemq-json-from-xml-queue");
		
		
		// reciving converted json objects from active mq
		
//		from("activemq:myactivemq-json-from-xml-queue")
//		
//		.log("${body}")
//		
//		.to("log:message received from activemq");
		
		
		
		
		

	}

}
