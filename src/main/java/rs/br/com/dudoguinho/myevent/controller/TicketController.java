package rs.br.com.dudoguinho.myevent.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import rs.br.com.dudoguinho.myevent.dto.TicketDto;

@Controller
public class TicketController {
	private static Logger log = LoggerFactory.getLogger(TicketController.class);
	
	@RequestMapping(value = "/ticket/", method = RequestMethod.GET)
	public ResponseEntity<List<TicketDto>> getEvents() {
		//service.findAllEvents();
		List<TicketDto> tickets = null; 
		return new ResponseEntity<List<TicketDto>>(tickets, HttpStatus.OK);
	}
}
