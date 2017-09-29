package br.com.dudoguinho.myevent.converters;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import br.com.dudoguinho.myevent.dto.EventDto;
import br.com.dudoguinho.myevent.model.Event;


@Component
public class EventConverter {

	public List<EventDto> convertListEventEntityToListEventDto(final List<Event> eventosEntity) {
		List<EventDto> eventosDto = new ArrayList<EventDto>();
		for (Event event : eventosEntity) {
			EventDto eventoDto = convertEventEntityToEventDto(event);
			eventosDto.add(eventoDto);
		}
		
		return eventosDto;
	}
	
	public EventDto convertEventEntityToEventDto(final Event eventEntity) {
		EventDto eventoDto = new EventDto();
		eventoDto.setId(eventEntity.getId());
		eventoDto.setName(eventEntity.getName());
		eventoDto.setDate(eventEntity.getDate());
		return eventoDto;
	}
	
	public Event convertEventDtoToEventEntity(final EventDto eventDto) {
		Event evento = new Event();
		evento.setId(eventDto.getId());
		evento.setName(eventDto.getName());
		evento.setDate(eventDto.getDate());
		return evento;
	}
	
}
