package commerce.cafe_commerce.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import commerce.cafe_commerce.entities.TipoCafe;

public interface TipoCafeRepository extends JpaRepository<TipoCafe, Integer> {
}
