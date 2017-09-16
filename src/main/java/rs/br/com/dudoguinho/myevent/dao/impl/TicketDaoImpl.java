package rs.br.com.dudoguinho.myevent.dao.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import rs.br.com.dudoguinho.myevent.dao.TicketDao;
import rs.br.com.dudoguinho.myevent.model.Ticket;

@Repository
public class TicketDaoImpl extends BaseDaoImpl<Ticket> implements TicketDao {
	private static Logger log = LoggerFactory.getLogger(TicketDaoImpl.class);

	@Override
	public List<Ticket> getListEntity() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Ticket getEntityById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void removeEntity(Ticket entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Ticket updateEntity(Ticket entity) {
		// TODO Auto-generated method stub
		return null;
	}

}
