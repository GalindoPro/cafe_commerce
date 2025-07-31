package commerce.cafe_commerce.entities;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;

@Entity
@Table(name = "presentacion")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Presentacion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "presentacion_id")
    private Integer presentacionId;

    @Column(name = "sku", nullable = false, length = 20)
    private String sku;

    @Column(name = "formato", nullable = false, length = 50)
    private String formato;

    @Column(name = "precio_actual", nullable = false, precision = 10, scale = 2)
    private BigDecimal precioActual;

    @Column(name = "stock", nullable = false)
    private Integer stock;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "tipo_cafe_id", nullable = false)
    private TipoCafe tipoCafe;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "categoria_id", nullable = false)
    private Categoria categoria;
}
