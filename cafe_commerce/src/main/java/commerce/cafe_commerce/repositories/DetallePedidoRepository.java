package commerce.cafe_commerce.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import commerce.cafe_commerce.entities.DetallePedido;

public interface DetallePedidoRepository extends JpaRepository<DetallePedido, Integer> {
}
