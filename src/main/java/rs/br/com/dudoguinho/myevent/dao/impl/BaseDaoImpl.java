package rs.br.com.dudoguinho.myevent.dao.impl;

import javax.persistence.PersistenceContext;
import javax.persistence.EntityManager;

import rs.br.com.dudoguinho.myevent.dao.BaseDao;

public abstract class BaseDaoImpl<T> implements BaseDao<T> {
	
	@PersistenceContext
    private EntityManager entityManager;
	
}
