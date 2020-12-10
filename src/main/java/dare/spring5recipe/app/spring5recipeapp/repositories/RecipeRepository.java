package dare.spring5recipe.app.spring5recipeapp.repositories;

import dare.spring5recipe.app.spring5recipeapp.domain.Recipe;
import org.springframework.data.repository.CrudRepository;


public interface RecipeRepository extends CrudRepository<Recipe, Long> {


}
