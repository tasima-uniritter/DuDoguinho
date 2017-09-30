package br.com.dudoguinho.myevent.test;

import static org.assertj.core.api.Assertions.assertThat;

import java.time.LocalDate;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import br.com.dudoguinho.myevent.converters.EventConverter;
import br.com.dudoguinho.myevent.model.Event;
import br.com.dudoguinho.myevent.service.EventService;
import br.com.dudoguinho.myevent.dto.EventDto;

@RunWith(SpringRunner.class)
@SpringBootTest
public class EventServiceTest {
	
	@Autowired
	private EventService service;
	
	@Autowired 
	private EventConverter converter;
	
	@Test
	@Transactional
	public void testEvent() {
		
		LocalDate eventDate = LocalDate.of(2017, 10, 1);
		String eventName = "DuDoguinho evento";
		Event event = new Event();
		event.setName(eventName);
		event.setDate(eventDate);
		
		EventDto eventCriado = service.save(converter.convertEventEntityToEventDto(event));
		
		assertThat(event.getDate()).isEqualTo(eventCriado.getDate());
		assertThat(event.getName()).isEqualTo(eventCriado.getName());
		assertThat(eventCriado.getId()).isNotNull();
		
		List<EventDto> eventos = service.getEventos();
		
		assertThat(eventos.size()).isEqualTo(1);
		assertThat(eventos.get(0).getName()).isEqualTo(eventCriado.getName());
		
	}

}
