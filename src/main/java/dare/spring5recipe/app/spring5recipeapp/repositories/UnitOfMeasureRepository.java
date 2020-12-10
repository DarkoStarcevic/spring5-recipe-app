package dare.spring5recipe.app.spring5recipeapp.repositories;

import dare.spring5recipe.app.spring5recipeapp.domain.UnitOfMeasure;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface UnitOfMeasureRepository extends CrudRepository<UnitOfMeasure, Long> {

    Optional<UnitOfMeasure>findByDescription(String description);
}
