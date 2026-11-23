package desarrollo.web.bibliotecas.config;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import desarrollo.web.bibliotecas.entities.Biblioteca;
import desarrollo.web.bibliotecas.entities.Libro;
import desarrollo.web.bibliotecas.repository.BibliotecaRepository;
import desarrollo.web.bibliotecas.repository.LibroRepository;

@Configuration
public class DatosIniciales {

    @Bean
    public CommandLineRunner cargarDatos(BibliotecaRepository bibliotecaRepository, LibroRepository libroRepository) {
        return args -> {
            Biblioteca central = biblioteca("Biblioteca Central", "Carrera 7 # 12-30", "Bogotá");
            Biblioteca norte = biblioteca("Biblioteca Norte", "Calle 100 # 15-20", "Bogotá");
            central = bibliotecaRepository.save(central);
            norte = bibliotecaRepository.save(norte);

            libroRepository.save(libro("Cien años de soledad", "Gabriel García Márquez", 1967, central));
            libroRepository.save(libro("El coronel no tiene quien le escriba", "Gabriel García Márquez", 1961, norte));
        };
    }

    private Biblioteca biblioteca(String nombre, String direccion, String ciudad) {
        Biblioteca biblioteca = new Biblioteca();
        biblioteca.setNombre(nombre);
        biblioteca.setDireccion(direccion);
        biblioteca.setCiudad(ciudad);
        return biblioteca;
    }

    private Libro libro(String titulo, String autor, int anioPublicacion, Biblioteca biblioteca) {
        Libro libro = new Libro();
        libro.setTitulo(titulo);
        libro.setAutor(autor);
        libro.setAnioPublicacion(anioPublicacion);
        libro.setBiblioteca(biblioteca);
        return libro;
    }
}
