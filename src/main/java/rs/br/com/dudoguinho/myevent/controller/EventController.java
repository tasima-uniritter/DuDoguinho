package rs.br.com.dudoguinho.myevent.controller;

import java.time.LocalDate;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import rs.br.com.dudoguinho.myevent.dto.EventDto;
import rs.br.com.dudoguinho.myevent.model.Event;
import rs.br.com.dudoguinho.myevent.service.Impl.EventServiceImpl;

@Controller
public class EventController {
	
	private static Logger log = LoggerFactory.getLogger(EventController.class);
	
	@Autowired
	private EventServiceImpl service;
	
//	@RequestMapping(value = "/event/", method = RequestMethod.GET)
//	public String home() {
//		log.info("Event Controller");
//	    return "Aqui !";
//	}
	
	@RequestMapping(value = "events", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<EventDto>> getEventos() {
		List<EventDto> eventos = service.getEventos();
		return new ResponseEntity<List<EventDto>>(eventos, HttpStatus.OK);
	}
	 
	@RequestMapping(value = "event/{nome}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<EventDto> getEventoByNome(@PathVariable ("nome") String nome) {
		EventDto dto = new EventDto();
		dto.setName("Rick é demais2");
		dto.setDate(LocalDate.now());
		return new ResponseEntity<EventDto>(dto, HttpStatus.OK);
	}
	
	@PostMapping(value = "saveEvent")
	public ResponseEntity<EventDto> saveEvento(@RequestBody EventDto eventDto) {
		Event eventEntity = new Event();
		eventDto.setId(eventEntity.getId());

		return new ResponseEntity<EventDto>(eventDto, HttpStatus.OK);
	}
	
	public void updateEventoByNome(){}
	public void saveEvento(){}
	public void deleteEvento(){}
}
