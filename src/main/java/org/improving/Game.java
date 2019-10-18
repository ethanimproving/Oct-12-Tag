package org.improving;

import org.improving.commands.Command;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Scanner;

@Component
public class Game {
    private GameContext gameContext;
    private List<Command> commands;

    public Game(GameContext gameContext, List<Command> commands) {
        this.gameContext = gameContext;
        this.commands = commands;
    }

    public void run() {
        var scanner = new Scanner(System.in);

        while(true) {
            System.out.print("> ");
            var input = scanner.nextLine();
            var cmd = commands.stream().filter(c -> c.isValid(input)).findFirst();
            if (cmd.isPresent()) {
                cmd.get().execute(input);
            } else {
                System.out.println(input);
            }
        }
    }
}
