package dare.spring5recipe.app.spring5recipeapp.controllers;

import dare.spring5recipe.app.spring5recipeapp.services.RecipeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

   private final RecipeService recipeService;


    public IndexController(RecipeService recipeService) {
        this.recipeService = recipeService;
    }

    @RequestMapping({"", "/", "/index2"})
    public String getIndexPage(Model model){
        model.addAttribute("recipes", recipeService.getRecipe());
        return "index2";

    }


}
