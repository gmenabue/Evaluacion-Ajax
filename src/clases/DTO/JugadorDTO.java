package clases.DTO;

public class JugadorDTO {

	String nombre;
	int record;
	int minutos;
	int segundos;
	
	
	public JugadorDTO(String nombre, int record, int minutos, int segundos) {
		super();
		this.nombre = nombre;
		this.record = record;
		this.minutos = minutos;
		this.segundos = segundos;
	}


	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}


	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	/**
	 * @return the record
	 */
	public int getRecord() {
		return record;
	}


	/**
	 * @param record the record to set
	 */
	public void setRecord(int record) {
		this.record = record;
	}


	/**
	 * @return the minutos
	 */
	public int getMinutos() {
		return minutos;
	}


	/**
	 * @param minutos the minutos to set
	 */
	public void setMinutos(int minutos) {
		this.minutos = minutos;
	}


	/**
	 * @return the segundos
	 */
	public int getSegundos() {
		return segundos;
	}


	/**
	 * @param segundos the segundos to set
	 */
	public void setSegundos(int segundos) {
		this.segundos = segundos;
	}
	
	
}
