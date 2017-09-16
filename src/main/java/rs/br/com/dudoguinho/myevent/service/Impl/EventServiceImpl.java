package rs.br.com.dudoguinho.myevent.service.Impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import rs.br.com.dudoguinho.myevent.dao.impl.EventDaoImpl;
import rs.br.com.dudoguinho.myevent.service.EventService;
import rs.br.com.dudoguinho.myevent.validator.EventValidator;

@Service
public class EventServiceImpl implements EventService {
	private static Logger log = LoggerFactory.getLogger(EventServiceImpl.class);

	@Autowired private EventValidator validator;
	@Autowired private EventDaoImpl repository;
	
	@Override
	public void createEvent() {
		// TODO Auto-generated method stub
		validator.validateDate(null);
	}

}
