package desarrollo.web.bibliotecas.dto.biblioteca;

import java.util.List;

import desarrollo.web.bibliotecas.dto.libro.LibroResponse;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class BibliotecaResponse {
    private Integer id;
    private String nombre;
    private String direccion;
    private String ciudad;
    private List<LibroResponse> libros;
}
