package rs.br.com.dudoguinho.myevent.service.Impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import rs.br.com.dudoguinho.myevent.controller.EventController;
import rs.br.com.dudoguinho.myevent.service.TicketService;
import rs.br.com.dudoguinho.myevent.validator.TicketValidator;

@Service
public class TicketServiceImpl implements TicketService {
	private static Logger log = LoggerFactory.getLogger(TicketServiceImpl.class);
	
	@Autowired private TicketValidator validator;

	@Override
	public void createTicket() {
		// TODO Auto-generated method stub
		
	}

}
