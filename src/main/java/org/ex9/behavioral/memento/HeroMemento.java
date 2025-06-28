package org.ex9.behavioral.memento;

/**
 * Реализация memento паттерна "Снимок".
 * Класс-хранитель состояния игрового персонажа.
 * @author Краковцев Артём
 */
public class HeroMemento {

    private final int patrons;
    private final int lives;

    public HeroMemento(int patrons, int lives) {
        this.patrons = patrons;
        this.lives = lives;
    }

    /**
     * @return количество патрон.
     */
    public int getPatrons() {
        return patrons;
    }

    /**
     * @return количество жизней.
     */
    public int getLives() {
        return lives;
    }

}
