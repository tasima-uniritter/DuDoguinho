package rs.br.com.dudoguinho.myevent.service.Impl;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import rs.br.com.dudoguinho.myevent.dao.impl.EventDaoImpl;
import rs.br.com.dudoguinho.myevent.dto.EventDto;
import rs.br.com.dudoguinho.myevent.model.Event;
import rs.br.com.dudoguinho.myevent.service.EventService;
import rs.br.com.dudoguinho.myevent.validator.EventValidator;

@Service
@Transactional
public class EventServiceImpl implements EventService {
	private static Logger log = LoggerFactory.getLogger(EventServiceImpl.class);

	@Autowired EventValidator validator;
	@Autowired EventDaoImpl repository;
	
	@Override
	public void createEvent() {
		validator.validateDate(null);
	}

	@Override
	public List<EventDto> getEventos() {
		List<Event> eventosEntity = repository.getListEntity();
		List<EventDto> eventosDto = convertEventEntityToDto(eventosEntity);
		return eventosDto;
	}
	
	private List<EventDto> convertEventEntityToDto(final List<Event> eventosEntity) {
		List<EventDto> eventosDto = new ArrayList<EventDto>();
		for (Event event : eventosEntity) {
			EventDto eventoDto = new EventDto();
			eventoDto.setId(event.getId());
			eventoDto.setName(event.getName());
			eventoDto.setDate(event.getDate());
			eventosDto.add(eventoDto);
		}
		
		return eventosDto;
	}
	
	

}
