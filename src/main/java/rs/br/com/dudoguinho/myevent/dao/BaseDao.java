package rs.br.com.dudoguinho.myevent.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import rs.br.com.dudoguinho.myevent.dao.impl.BaseDaoImpl;

public abstract class BaseDao<T> implements BaseDaoImpl<T> {
	
	@PersistenceContext
    private EntityManager entityManager;
	
}
