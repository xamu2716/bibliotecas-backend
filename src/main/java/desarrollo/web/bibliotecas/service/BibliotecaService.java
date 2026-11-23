package desarrollo.web.bibliotecas.service;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import desarrollo.web.bibliotecas.dto.biblioteca.BibliotecaRequest;
import desarrollo.web.bibliotecas.dto.biblioteca.BibliotecaResponse;
import desarrollo.web.bibliotecas.entities.Biblioteca;
import desarrollo.web.bibliotecas.repository.BibliotecaRepository;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
@Transactional
public class BibliotecaService {

    private final BibliotecaRepository bibliotecaRepository;
    private final ModelMapper modelMapper;

    public BibliotecaResponse crear(BibliotecaRequest datos) {
        Biblioteca biblioteca = new Biblioteca();
        biblioteca.setNombre(datos.getNombre().trim());
        biblioteca.setDireccion(datos.getDireccion().trim());
        biblioteca.setCiudad(datos.getCiudad().trim());
        return aResponse(bibliotecaRepository.save(biblioteca));
    }

    @Transactional(readOnly = true)
    public List<BibliotecaResponse> listar() {
        return bibliotecaRepository.findAll().stream().map(this::aResponse).toList();
    }

    private BibliotecaResponse aResponse(Biblioteca biblioteca) {
        return modelMapper.map(biblioteca, BibliotecaResponse.class);
    }
}
