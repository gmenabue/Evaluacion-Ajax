package clases.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import clases.DTO.JugadorDTO;

@Controller
public class ServicioWebController {
	
	/**
	 * Método de la clase ServicioWebController que recibe minutos y segundos
	 * 
	 * @param minutos
	 * @param segundos
	 * @return Un objeto de PersonaDTO en formato JSON
	 */
	@RequestMapping(path = "/tiempo" , produces = "application/json")
	@ResponseBody
	public ResponseEntity<JugadorDTO> tiempoJuego(@RequestParam(value="minutos", defaultValue= "-1") int minutos, @RequestParam(value="segundos", defaultValue="-1")int segundos){
		
		//Creo un objeto JugadorDTO y le doy los valores de las variables recibidas.
		JugadorDTO jugador = new JugadorDTO("Giordano", 12, minutos, segundos);
		
		System.out.println("Minutos " + jugador.getMinutos());
		System.out.println("Segundos " + jugador.getSegundos());
		return new ResponseEntity<JugadorDTO>(jugador, HttpStatus.OK);
	}

}
