package dare.spring5recipe.app.spring5recipeapp.services;

import dare.spring5recipe.app.spring5recipeapp.commands.UnitOfMeasureCommand;

import java.util.Set;

public interface UnitOfMeasureService {

    Set<UnitOfMeasureCommand> listAllUoms();
}
