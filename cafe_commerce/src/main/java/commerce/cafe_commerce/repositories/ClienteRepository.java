package commerce.cafe_commerce.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import commerce.cafe_commerce.entities.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Integer> {
}
