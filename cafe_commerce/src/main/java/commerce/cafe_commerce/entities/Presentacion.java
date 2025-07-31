package commerce.cafe_commerce.entities;

public class Presentacion {
    
}
@Entity
@Table(name = "presentacion")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Presentacion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer presentacionId;

    private String sku;
    private String formato;
    private BigDecimal precioActual;
    private Integer stock;

    @ManyToOne
    @JoinColumn(name = "tipo_cafe_id")
    private TipoCafe tipoCafe;

    @ManyToOne
    @JoinColumn(name = "categoria_id")
    private Categoria categoria;

    @OneToMany(mappedBy = "presentacion", cascade = CascadeType.ALL)
    private List<DetallePedido> detalles;
}
