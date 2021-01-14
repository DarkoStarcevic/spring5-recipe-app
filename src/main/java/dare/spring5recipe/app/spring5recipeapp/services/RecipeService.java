package dare.spring5recipe.app.spring5recipeapp.services;

import dare.spring5recipe.app.spring5recipeapp.commands.RecipeCommand;
import dare.spring5recipe.app.spring5recipeapp.domain.Recipe;

import java.util.Set;


public interface RecipeService {

    Set<Recipe>getRecipe();
    Recipe findById(Long l);

    RecipeCommand saveRecipeCommand(RecipeCommand command);
}
