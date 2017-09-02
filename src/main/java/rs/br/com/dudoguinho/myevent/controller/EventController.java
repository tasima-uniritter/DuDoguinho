package rs.br.com.dudoguinho.myevent.controller;

import java.time.LocalDate;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import rs.br.com.dudoguinho.myevent.dto.EventDto;
import rs.br.com.dudoguinho.myevent.model.Event;

@RestController("/event")
public class EventController {
	
	  @GetMapping(value="/{nome}")
	  public ResponseEntity<EventDto> getEventoByNome(@RequestParam("nome") String nome) {
		  EventDto dto = new EventDto();
		  dto.setNome("Rick é demais2");
		  dto.setData(LocalDate.now());
		  return new ResponseEntity<EventDto>(dto, HttpStatus.OK);
	  }

	  public void updateEventoByNome(){}
	  
	  @PostMapping(value="/saveEvent")
	  public ResponseEntity<EventDto> saveEvento(@RequestBody EventDto eventDto){
		  Event eventEntity = new Event();
		  eventDto.setId(eventEntity.getId());
		  
		  return new ResponseEntity<EventDto>(eventDto, HttpStatus.OK);
	  }
	  
	  public void deleteEvento(){}
}
