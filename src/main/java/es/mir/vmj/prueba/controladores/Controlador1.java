package es.mir.vmj.prueba.controladores;

import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import es.mir.vmj.prueba.entidades.Coche;
import es.mir.vmj.prueba.servicios.Servicio1;

@Controller
public class Controlador1 {


	// Inyectamos el DAO dentro del Controller
	@Autowired
	private Servicio1 servicio1;

	/**
	 * 
	 * Crea un nuevo usuario con un Id autogenerado, y con los datos recibidos
	 * por la URL 
	 * 
	 * /create?name=...&message=....
	 * 
	 */
	@RequestMapping(value = "/create")
	@ResponseBody
	public String create(String name, String message) {
		
		Coche coche = new Coche();
		// Estas líneas de código generan un Id aleatorio.
		// En las próximas lecciones veremos como delegar esto en la base de
		// datos
		Random r = new Random();
		int randomId = r.nextInt(Integer.MAX_VALUE);
		// Asignamos los datos
		coche.setId(randomId);
		coche.setMarca("seat");
		coche.setColor("ibiza");

		servicio1.insertarcoche(coche);
		return "Usuariosss creado correctamente";
	}

	
}