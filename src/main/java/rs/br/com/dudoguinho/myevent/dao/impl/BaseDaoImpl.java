package rs.br.com.dudoguinho.myevent.dao.impl;

import java.util.List;

public interface BaseDaoImpl<T> {
	
	List<T> getListEntity();
	T getEntityById(Long id);
	void removeEntity(T entity);
	T updateEntity(T entity);

}
