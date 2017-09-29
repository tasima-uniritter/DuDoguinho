package br.com.dudoguinho.myevent.repository;

import org.springframework.data.repository.CrudRepository;

import br.com.dudoguinho.myevent.model.Event;

public interface EventRepository extends CrudRepository<Event, Long>{
	
	Event findByName(String name);

}
