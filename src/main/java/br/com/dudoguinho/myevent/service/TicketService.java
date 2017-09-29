package br.com.dudoguinho.myevent.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.dudoguinho.myevent.model.Ticket;
import br.com.dudoguinho.myevent.repository.TicketRepository;

@Service
public class TicketService {
	private static Logger log = LoggerFactory.getLogger(TicketService.class);
	
	@Autowired TicketRepository repository;

	public Iterable<Ticket> findAll() {
		log.info("Finding all tickets...");
		return repository.findAll();
	}
	
}
