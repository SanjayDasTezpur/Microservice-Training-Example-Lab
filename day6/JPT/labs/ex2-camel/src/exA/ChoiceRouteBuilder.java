package exA;

import java.util.ArrayList;
import java.util.List;

import org.apache.camel.builder.RouteBuilder;
import org.w3c.dom.Document;


/**
 * A Camel Java DSL Router
 */
public class ChoiceRouteBuilder extends RouteBuilder {

    /**
     * Let's configure the Camel routing rules using Java code...
     */
    public void configure() {

             
    from("file:src/data")
    .log("body is ${body}")
    .to("direct:process");
    
    from("direct:process")
    .transform()
    .simple("${body},message is processed")
    .to("file:src/data2");
    
    
    
    
    
    
    
    
    
    

    }

}
