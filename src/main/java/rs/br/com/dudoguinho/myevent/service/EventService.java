package rs.br.com.dudoguinho.myevent.service;

import java.util.List;

import rs.br.com.dudoguinho.myevent.dto.EventDto;

public interface EventService {
	void createEvent();
	List<EventDto> getEventos();
}
