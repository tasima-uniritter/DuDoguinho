package br.com.dudoguinho.myevent.api;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.dudoguinho.myevent.dto.TicketDto;

@RestController
public class TicketRest {
	private static Logger log = LoggerFactory.getLogger(TicketRest.class);
	
	@RequestMapping(value = "/ticket/", method = RequestMethod.GET)
	public ResponseEntity<List<TicketDto>> getEvents() {
		//service.findAllEvents();
		List<TicketDto> tickets = null; 
		return new ResponseEntity<List<TicketDto>>(tickets, HttpStatus.OK);
	}
}
