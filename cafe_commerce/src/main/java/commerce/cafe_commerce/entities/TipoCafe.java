package commerce.cafe_commerce.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Table(name = "tipo_cafe")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class TipoCafe {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "tipo_cafe_id")
    private Integer tipoCafeId;

    @Column(name = "nombre", nullable = false, length = 50)
    private String nombre;

    @Column(name = "descripcion", columnDefinition = "TEXT")
    private String descripcion;

    @OneToMany(mappedBy = "tipoCafe", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Presentacion> presentaciones;
}
