package commerce.cafe_commerce.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import commerce.cafe_commerce.entities.Pedido;

public interface PedidoRepository extends JpaRepository<Pedido, Integer> {
}
