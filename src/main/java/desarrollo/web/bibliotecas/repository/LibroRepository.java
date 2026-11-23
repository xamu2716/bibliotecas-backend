package desarrollo.web.bibliotecas.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import desarrollo.web.bibliotecas.entities.Libro;

public interface LibroRepository extends JpaRepository<Libro, Integer> {
}
