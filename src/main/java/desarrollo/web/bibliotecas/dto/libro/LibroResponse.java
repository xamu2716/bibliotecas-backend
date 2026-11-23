package desarrollo.web.bibliotecas.dto.libro;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class LibroResponse {
    private Integer id;
    private String titulo;
    private String autor;
    private Integer anioPublicacion;
}
