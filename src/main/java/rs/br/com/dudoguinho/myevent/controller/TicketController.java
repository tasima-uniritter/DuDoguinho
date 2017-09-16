package rs.br.com.dudoguinho.myevent.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TicketController {
	private static Logger log = LoggerFactory.getLogger(TicketController.class);
	
	@RequestMapping(value = "/ticket/", method = RequestMethod.GET)
	public String home() {
		log.info("Ticket Controller");
	    return "Aqui !";
	}
}
