package commerce.cafe_commerce.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import commerce.cafe_commerce.entities.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Integer> {
}
