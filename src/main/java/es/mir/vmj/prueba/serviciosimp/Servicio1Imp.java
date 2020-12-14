package es.mir.vmj.prueba.serviciosimp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import es.mir.vmj.prueba.entidades.Coche;
import es.mir.vmj.prueba.repositorios.CocheDao;
import es.mir.vmj.prueba.servicios.Servicio1;

@Service
public class Servicio1Imp implements Servicio1 {

	@Autowired
	private CocheDao cochedao;
		
	@Override
	public String insertarcoche(Coche coche) {
		// TODO Auto-generated method stub
		
		cochedao.insertarcoche(coche);
		
		return null;
	}

}
