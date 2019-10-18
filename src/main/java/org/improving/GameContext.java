package org.improving;

import org.improving.domain.Location;
import org.improving.domain.Player;
import org.springframework.stereotype.Component;

@Component
public class GameContext {
    private Player player;
    private Location startingLocation;

    public GameContext(WorldFactory factory) {
        this.player = new Player("Ethan", 10, 5, 5);
        this.startingLocation = factory.buildWorld();
        this.player.setLocation(this.startingLocation);
    }

    public Player getPlayer() {
        return player;
    }
}
