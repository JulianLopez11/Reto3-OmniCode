package omnicode.prueba.reto3.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import omnicode.prueba.reto3.entity.Inscripcion;
import omnicode.prueba.reto3.service.InscripcionService;

@RestController
@RequestMapping("/api/inscripciones")
@Tag(name = "Inscripciones", description = "API para gestionar inscripciones de materias")
public class InscripcionController {

	private final InscripcionService inscripcionService;

	public InscripcionController(InscripcionService inscripcionService) {
		this.inscripcionService = inscripcionService;
	}

	@GetMapping
	@Operation(summary = "Listar todas las inscripciones")
	public List<Inscripcion> listarTodas() {
		return inscripcionService.listarTodas();
	}

	@GetMapping("/{id}")
	@Operation(summary = "Buscar inscripción por ID")
	public ResponseEntity<Inscripcion> buscarPorId(@PathVariable Long id) {
		return inscripcionService.buscarPorId(id)
			.map(ResponseEntity::ok)
			.orElse(ResponseEntity.notFound().build());
	}

	@PostMapping
	@Operation(summary = "Crear una nueva inscripción")
	public ResponseEntity<Inscripcion> crear(@RequestBody Inscripcion inscripcion) {
		Inscripcion creada = inscripcionService.crear(inscripcion);
		return ResponseEntity.status(HttpStatus.CREATED).body(creada);
	}

	@PutMapping("/{id}")
	@Operation(summary = "Actualizar una inscripción existente")
	public ResponseEntity<Inscripcion> actualizar(@PathVariable Long id, @RequestBody Inscripcion inscripcion) {
		return inscripcionService.actualizar(id, inscripcion)
			.map(ResponseEntity::ok)
			.orElse(ResponseEntity.notFound().build());
	}

	@DeleteMapping("/{id}")
	@Operation(summary = "Eliminar inscripción por ID")
	public ResponseEntity<Void> eliminar(@PathVariable Long id) {
		boolean eliminado = inscripcionService.eliminar(id);
		if (!eliminado) {
			return ResponseEntity.notFound().build();
		}
		return ResponseEntity.noContent().build();
	}
}
