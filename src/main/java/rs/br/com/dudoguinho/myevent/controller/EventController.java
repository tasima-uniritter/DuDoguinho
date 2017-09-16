package rs.br.com.dudoguinho.myevent.controller;

import java.time.LocalDate;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import rs.br.com.dudoguinho.myevent.dto.EventDto;
import rs.br.com.dudoguinho.myevent.model.Event;

@RestController("/event")
public class EventController {

	private static Logger log = LoggerFactory.getLogger(EventController.class);

	@GetMapping("/")
	public String home() {
		log.info("Event Controller");
		return "Aqui !";
	}

	@GetMapping("/{nome}")
	public ResponseEntity<EventDto> getEventoByNome(@PathVariable("nome") String nome) {
		EventDto dto = new EventDto();
		dto.setName("Rick é demais2");
		dto.setDate(LocalDate.now());
		return new ResponseEntity<EventDto>(dto, HttpStatus.OK);
	}

	public ResponseEntity<EventDto> getEventos() {
		EventDto dto = new EventDto();
		return new ResponseEntity<EventDto>(dto, HttpStatus.OK);
	}

	public void updateEventoByNome() {
	}

	@PostMapping(value = "/saveEvent")
	public ResponseEntity<EventDto> saveEvento(@RequestBody EventDto eventDto) {
		Event eventEntity = new Event();
		eventDto.setId(eventEntity.getId());

		return new ResponseEntity<EventDto>(eventDto, HttpStatus.OK);
	}

	public void deleteEvento() {
	}
}
