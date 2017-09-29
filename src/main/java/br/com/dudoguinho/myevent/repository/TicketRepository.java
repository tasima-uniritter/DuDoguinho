package br.com.dudoguinho.myevent.repository;

import org.springframework.data.repository.CrudRepository;

import br.com.dudoguinho.myevent.model.Ticket;

public interface TicketRepository extends CrudRepository<Ticket, Long>{

}
