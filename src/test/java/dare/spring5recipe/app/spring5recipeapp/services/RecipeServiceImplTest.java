package dare.spring5recipe.app.spring5recipeapp.services;

import dare.spring5recipe.app.spring5recipeapp.domain.Recipe;
import dare.spring5recipe.app.spring5recipeapp.repositories.RecipeRepository;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

public class RecipeServiceImplTest {


    RecipeServiceImpl recipeService;

    @Mock
    RecipeRepository recipeRepository;

    @Before
    public void setUp() throws Exception {
        MockitoAnnotations.openMocks(this);

        recipeService =new RecipeServiceImpl(recipeRepository);
    }

    @Test
    public void getRecipe() {

        Recipe recipe = new Recipe();
        HashSet recipesData = new HashSet();
        recipesData.add(recipe);

        when(recipeService.getRecipe()).thenReturn(recipesData);

        Set<Recipe> recipes = recipeService.getRecipe();

        assertEquals(recipes.size(),1);

        verify(recipeRepository,times(1)).findAll();
    }
}