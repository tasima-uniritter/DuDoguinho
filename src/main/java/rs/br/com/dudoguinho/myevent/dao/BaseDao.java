package rs.br.com.dudoguinho.myevent.dao;

import java.util.List;

import javax.persistence.PersistenceContext;

public abstract class BaseDao<T> {
	
	@PersistenceContext
    private EntityManager entityManager;
	
	public T getEntity() {
		
		return T;
	}
	public List<T> getListEntity();
	public T getEntityById(Long id);
	public void removeEntity(T entity);
	public T updateEntity(T entity);

}
