package es.mir.vmj.prueba.repositoriosimp;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import es.mir.vmj.prueba.entidades.Coche;
import es.mir.vmj.prueba.repositorios.CocheDao;

@Repository
@Transactional
public class CocheDaoImp implements CocheDao {

		
	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public void insertarcoche(Coche coche) {
		// TODO Auto-generated method stub
		
		entityManager.persist(coche);
		return;

	}

}
