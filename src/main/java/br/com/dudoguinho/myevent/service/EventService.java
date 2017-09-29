package br.com.dudoguinho.myevent.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.dudoguinho.myevent.converters.EventConverter;
import br.com.dudoguinho.myevent.dto.EventDto;
import br.com.dudoguinho.myevent.model.Event;
import br.com.dudoguinho.myevent.repository.EventRepository;

@Service
public class EventService {
	private static Logger log = LoggerFactory.getLogger(EventService.class);

	@Autowired EventRepository eventRepository;
	@Autowired EventConverter converter;
	
	public List<EventDto> getEventos() {
		List<Event> events = StreamSupport.stream(eventRepository.findAll().spliterator(), false).collect(Collectors.toList());
		return converter.convertListEventEntityToListEventDto(events);
	}
	
	public void save(EventDto event) {
		log.info("Saving entity "+ event);
		eventRepository.save(converter.convertEventDtoToEventEntity(event));
	}
	
	public void findById(Long id) {
		log.info("Searching event with ID "+ id);
		eventRepository.findOne(id);
	}
	
	public Optional<Event> findByName(String name) {
		return Optional.of(eventRepository.findByName(name));
	}

	public void deleteEvent(long id) {
		eventRepository.delete(id);
	}
	

	
}
