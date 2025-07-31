package commerce.cafe_commerce.entities;

public class TipoCafe {
    
}
@Entity
@Table(name = "tipo_cafe")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class TipoCafe {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer tipoCafeId;

    private String nombre;
    private String descripcion;

    @OneToMany(mappedBy = "tipoCafe", cascade = CascadeType.ALL)
    private List<Presentacion> presentaciones;
}
