package rs.br.com.dudoguinho.myevent.dao;

import java.util.List;

public interface BaseDao<T> {
	
	List<T> getListEntity();
	T getEntityById(Long id);
	void removeEntity(T entity);
	T updateEntity(T entity);

}
