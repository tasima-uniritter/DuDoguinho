package rs.br.com.dudoguinho.myevent.controller;

import java.time.LocalDate;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import rs.br.com.dudoguinho.myevent.dto.EventDto;

@RestController("/event")
public class EventController {
	
	private static Logger log = LoggerFactory.getLogger(EventController.class);
	
	@RequestMapping("/")
	public String home() {
		log.info("Event Controller");
	    return "Aqui !";
	}
	 
	@GetMapping(value="/{nome}")
	public ResponseEntity<EventDto> getEventoByNome(@RequestParam("nome") String nome) {
		EventDto dto = new EventDto();
		dto.setNome("Rick é demais2");
		dto.setData(LocalDate.now());
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
