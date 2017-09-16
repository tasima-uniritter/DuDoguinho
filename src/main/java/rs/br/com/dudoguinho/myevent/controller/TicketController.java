package rs.br.com.dudoguinho.myevent.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/ticket")
public class TicketController {
	private static Logger log = LoggerFactory.getLogger(TicketController.class);
	
	@GetMapping("/")
	public String home() {
		log.info("Ticket Controller");
	    return "Aqui !";
	}
}
