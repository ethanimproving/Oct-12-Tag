package org.improving;

import org.improving.domain.Exit;
import org.improving.domain.Item;
import org.improving.domain.Location;
import org.springframework.stereotype.Component;

@Component
public class WorldFactory {
    public Location buildWorld() {
        var tf = new Location("The Forest");
        var tc = new Location("The Clearing");
        var af = new Location("The Applesauce Factory");
        var ts = new Location("The Toenail Shop");

        tf.getItems().add(new Item("The Golden Ring", 2, 1, 0));

        tf.getExits().add(new Exit("To " + tc.getName(), tc, "tc"));
        tf.getExits().add(new Exit("To " + af.getName(), af, "af"));
        tc.getExits().add(new Exit("To " + tf.getName(), tf, "tf"));
        tc.getExits().add(new Exit("To " + af.getName(), af, "af"));
        af.getExits().add(new Exit("To " + tc.getName(), tc, "tc"));
        af.getExits().add(new Exit("To " + ts.getName(), ts, "ts"));

        var startingLocation = tf;
        return startingLocation;
    }

}
