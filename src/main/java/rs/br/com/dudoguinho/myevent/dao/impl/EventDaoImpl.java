package rs.br.com.dudoguinho.myevent.dao.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import rs.br.com.dudoguinho.myevent.controller.EventController;
import rs.br.com.dudoguinho.myevent.dao.EventDao;

@Repository
public class EventDaoImpl implements EventDao {

	private static Logger log = LoggerFactory.getLogger(EventDaoImpl.class);
}
