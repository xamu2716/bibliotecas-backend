package desarrollo.web.bibliotecas.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import desarrollo.web.bibliotecas.dto.biblioteca.BibliotecaRequest;
import desarrollo.web.bibliotecas.dto.biblioteca.BibliotecaResponse;
import desarrollo.web.bibliotecas.service.BibliotecaService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
public class BibliotecaController {

    private final BibliotecaService bibliotecaService;

    @PostMapping("/bibliotecas")
    public ResponseEntity<BibliotecaResponse> crear(@Valid @RequestBody BibliotecaRequest datos) {
        return ResponseEntity.status(HttpStatus.CREATED).body(bibliotecaService.crear(datos));
    }

    @GetMapping("/bibliotecas")
    public ResponseEntity<List<BibliotecaResponse>> listar() {
        return ResponseEntity.ok(bibliotecaService.listar());
    }
}
