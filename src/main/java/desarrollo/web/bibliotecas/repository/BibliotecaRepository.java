package desarrollo.web.bibliotecas.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import desarrollo.web.bibliotecas.entities.Biblioteca;

public interface BibliotecaRepository extends JpaRepository<Biblioteca, Integer> {
}
