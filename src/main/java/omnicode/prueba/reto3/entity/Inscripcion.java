package omnicode.prueba.reto3.entity;

public class Inscripcion {

	private Long id;
	private String codigoEstudiante;
	private String nombreEstudiante;
	private String codigoMateria;
	private String nombreMateria;
	private String semestre;

	public Inscripcion() {
	}

	public Inscripcion(
		Long id,
		String codigoEstudiante,
		String nombreEstudiante,
		String codigoMateria,
		String nombreMateria,
		String semestre
	) {
		this.id = id;
		this.codigoEstudiante = codigoEstudiante;
		this.nombreEstudiante = nombreEstudiante;
		this.codigoMateria = codigoMateria;
		this.nombreMateria = nombreMateria;
		this.semestre = semestre;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCodigoEstudiante() {
		return codigoEstudiante;
	}

	public void setCodigoEstudiante(String codigoEstudiante) {
		this.codigoEstudiante = codigoEstudiante;
	}

	public String getNombreEstudiante() {
		return nombreEstudiante;
	}

	public void setNombreEstudiante(String nombreEstudiante) {
		this.nombreEstudiante = nombreEstudiante;
	}

	public String getCodigoMateria() {
		return codigoMateria;
	}

	public void setCodigoMateria(String codigoMateria) {
		this.codigoMateria = codigoMateria;
	}

	public String getNombreMateria() {
		return nombreMateria;
	}

	public void setNombreMateria(String nombreMateria) {
		this.nombreMateria = nombreMateria;
	}

	public String getSemestre() {
		return semestre;
	}

	public void setSemestre(String semestre) {
		this.semestre = semestre;
	}
}
