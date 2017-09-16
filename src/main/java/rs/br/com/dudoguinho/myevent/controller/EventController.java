package rs.br.com.dudoguinho.myevent.controller;

import java.time.LocalDate;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import rs.br.com.dudoguinho.myevent.dto.EventDto;

@RestController
public class EventController {
	
	private static Logger log = LoggerFactory.getLogger(EventController.class);
	
	@RequestMapping(value = "/event/", method = RequestMethod.GET)
	public String home() {
		log.info("Event Controller");
	    return "Aqui !";
	}
	 
	@RequestMapping(value = "/event/{nome}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<EventDto> getEventoByNome(@PathVariable ("nome") String nome) {
		EventDto dto = new EventDto();
		dto.setName("Rick é demais2");
		dto.setDate(LocalDate.now());
		return new ResponseEntity<EventDto>(dto, HttpStatus.OK);
	}
	
	public ResponseEntity<EventDto> getEventos() {
		EventDto dto = new EventDto();
		return new ResponseEntity<EventDto>(dto, HttpStatus.OK);
	}

	public void updateEventoByNome(){}
	public void saveEvento(){}
	public void deleteEvento(){}
}
