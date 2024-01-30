package com.camelservicesample.converting;


import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.util.json.JsonArray;

import com.camelservicesample.Products;

//@Component
public class JsonIntoXml extends RouteBuilder {

	@Override
	public void configure() throws Exception {

// Converting multiple json objects into xml objects 

		from("file:files/input")

				.unmarshal().json(JsonArray.class, Products.class)

// Converting single json objects into xml objects

				// .unmarshal().json(JsonLibrary.Jackson,Products.class)

				.marshal().jacksonXml()

				.log("${body}");

//	   .to("activemq:myactivemq-xml-from-json-queue");

	}

}
