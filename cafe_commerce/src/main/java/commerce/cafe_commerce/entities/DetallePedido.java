package commerce.cafe_commerce.entities;

public class DetallePedido {
    
}
@Entity
@Table(name = "detalle_pedido")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class DetallePedido {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer detalleId;

    @ManyToOne
    @JoinColumn(name = "pedido_id")
    private Pedido pedido;

    @ManyToOne
    @JoinColumn(name = "presentacion_id")
    private Presentacion presentacion;

    private Integer cantidad;
    private BigDecimal precioUnitario;
}
