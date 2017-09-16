package rs.br.com.dudoguinho.myevent.controller;

import java.time.LocalDate;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.util.UriComponentsBuilder;

import rs.br.com.dudoguinho.myevent.dto.EventDto;
import rs.br.com.dudoguinho.myevent.service.Impl.EventServiceImpl;

@Controller
public class EventController {
	
	private static Logger log = LoggerFactory.getLogger(EventController.class);
	
	@Autowired
	private EventServiceImpl service;
	
	@RequestMapping(value = "/events/", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<EventDto>> getEvents() {
		log.info("GET ALL");
		List<EventDto> eventos = service.getEventos();
		return new ResponseEntity<List<EventDto>>(eventos, HttpStatus.OK);
	}
	 
	@RequestMapping(value = "/event/{name}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<EventDto> getEventByName(@PathVariable ("name") String name) {
		log.info("GET ONE");
		EventDto dto = new EventDto();
		dto.setName("Rick é demais2");
		dto.setDate(LocalDate.now());

		//service.findEvent(eventDto);
		
		return new ResponseEntity<EventDto>(dto, HttpStatus.OK);
	}
	
	@RequestMapping(value = "/event/", method = RequestMethod.POST)
	public ResponseEntity<Void> saveEvent(@RequestBody EventDto eventDto, UriComponentsBuilder ucBuilder) {
		log.info("SAVE");
        //service.createEvent(eventDto);
        
		HttpHeaders headers = new HttpHeaders();
        headers.setLocation(ucBuilder.path("/event/{name}").buildAndExpand(eventDto.getName()).toUri());
        return new ResponseEntity<Void>(headers, HttpStatus.CREATED);
	}
	
	@RequestMapping(value = "/event/{id}", method = RequestMethod.PUT)
	public ResponseEntity<EventDto> updateEventByNome(@PathVariable("id") long id, @RequestBody EventDto eventDto){
		log.info("UPDATE");
		//service.updateEvent(eventDto);
		return new ResponseEntity<EventDto>(eventDto, HttpStatus.OK);
	}
	
	@RequestMapping(value = "/event/{id}", method = RequestMethod.DELETE)
	public ResponseEntity<EventDto> deleteEvent(@PathVariable("id") long id) {
		log.info("DELETE");
		//service.deleteEvent(eventDto);
		return new ResponseEntity<EventDto>(HttpStatus.NO_CONTENT);
	}
}
