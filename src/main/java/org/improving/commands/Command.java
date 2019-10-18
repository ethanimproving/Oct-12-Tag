package org.improving.commands;

public interface Command {
    boolean isValid(String input);
    void execute(String input);
}
