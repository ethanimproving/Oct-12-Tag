package org.improving.commands;

import org.improving.GameContext;
import org.springframework.stereotype.Component;

@Component
public class MoveCommand implements Command {
    private GameContext gameContext;

    public MoveCommand(GameContext gameContext) {
        this.gameContext = gameContext;
    }

    @Override
    public boolean isValid(String input) {
        if (input.split(" ").length < 2) return false;
        else return input.split(" ")[0].equalsIgnoreCase("move");
    }

    @Override
    public void execute(String input) {
        var dest = input.split(" ")[1];
        var newLocation = gameContext.getPlayer().getLocation().getExits().stream()
                .filter(e -> e.getName().equalsIgnoreCase(dest))
                .findFirst()
                .orElseThrow()
                .getDestination();
        gameContext.getPlayer().setLocation(newLocation);
        System.out.println("You move to " + newLocation.getName());
    }
}
