package rs.br.com.dudoguinho.myevent.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import rs.br.com.dudoguinho.myevent.dao.EventDao;
import rs.br.com.dudoguinho.myevent.model.Event;

@Repository
public class EventDaoImpl extends BaseDaoImpl<Event> implements EventDao {

	@Override
	public List<Event> getListEntity() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Event getEntityById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void removeEntity(Event entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Event updateEntity(Event entity) {
		// TODO Auto-generated method stub
		return null;
	}
}
