package org.ex9.behavioral.memento;

import java.util.Stack;

/**
 * Caretaker паттерна "Снимок".
 * Предназначен для хранения состояний.
 * Все состояния хранятся в стеке.
 */
public class GameHistory {

    private final Stack<HeroMemento> stackStates;

    public GameHistory() {
        this.stackStates = new Stack<>();
    }

    /**
     * @return стек состояний.
     */
    public Stack<HeroMemento> getStackStates() {
        return stackStates;
    }

}
