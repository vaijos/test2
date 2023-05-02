package com.visible.nw.ticketing;


import com.visible.nw.ticketing.constants.TicketConstants;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.scheduling.annotation.EnableScheduling;

@ComponentScan(basePackages={"com.visible.nw.ticketing"})
@SpringBootApplication(scanBasePackages = {"com.visible.nw.ticketing"})
@EnableScheduling
@OpenAPIDefinition(info = @Info (
		title = TicketConstants.API_TITLE,
		version = TicketConstants.API_VERSION,
		description = TicketConstants.API_DESCRIPTION,
		contact = @Contact(email = TicketConstants.API_CONTACT,
		name = TicketConstants.API_NAME,
		url = TicketConstants.API_CONF_URL)
		))
public class NetworkTicketingSystem {
    public static void main(final String[] args) {
        SpringApplication.run(NetworkTicketingSystem.class, args);
    }
}
