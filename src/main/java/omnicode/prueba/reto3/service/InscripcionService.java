package omnicode.prueba.reto3.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.stereotype.Service;

import omnicode.prueba.reto3.entity.Inscripcion;

@Service
public class InscripcionService {

	private final List<Inscripcion> inscripciones = new ArrayList<>();
	private final AtomicLong secuenciaId = new AtomicLong(1);

	public List<Inscripcion> listarTodas() {
		return inscripciones;
	}

	public Optional<Inscripcion> buscarPorId(Long id) {
		return inscripciones.stream()
			.filter(inscripcion -> inscripcion.getId().equals(id))
			.findFirst();
	}

	public Inscripcion crear(Inscripcion nuevaInscripcion) {
		nuevaInscripcion.setId(secuenciaId.getAndIncrement());
		inscripciones.add(nuevaInscripcion);
		return nuevaInscripcion;
	}

	public Optional<Inscripcion> actualizar(Long id, Inscripcion datosActualizados) {
		Optional<Inscripcion> inscripcionExistente = buscarPorId(id);

		if (inscripcionExistente.isEmpty()) {
			return Optional.empty();
		}

		Inscripcion inscripcion = inscripcionExistente.get();
		inscripcion.setCodigoEstudiante(datosActualizados.getCodigoEstudiante());
		inscripcion.setNombreEstudiante(datosActualizados.getNombreEstudiante());
		inscripcion.setCodigoMateria(datosActualizados.getCodigoMateria());
		inscripcion.setNombreMateria(datosActualizados.getNombreMateria());
		inscripcion.setSemestre(datosActualizados.getSemestre());

		return Optional.of(inscripcion);
	}

	public boolean eliminar(Long id) {
		return inscripciones.removeIf(inscripcion -> inscripcion.getId().equals(id));
	}
}
