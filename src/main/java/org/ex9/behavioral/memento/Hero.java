package org.ex9.behavioral.memento;

/**
 * Originator паттерна "Снимок".
 * Состояние описывается в виде количества патронов и жизней.
 * @author Краковцев Артём
 */
public class Hero {

    /**
     * Количество патрон.
     */
    private int patrons;
    /**
     * Количество жизней.
     */
    private int lives;

    /**
     * @return количество патронов.
     */
    public int getPatrons() {
        return patrons;
    }

    public Hero(int patrons, int lives) {
        this.patrons = patrons;
        this.lives = lives;
    }

    /**
     * Выстрел, после которого у героя на 1 уменьшается кол-во патрон.
     */
    public void shoot() {
        if (patrons > 0) {
            patrons--;
        }
    }

    /**
     * @return текущее состояние героя.
     */
    public HeroMemento saveState() {
        return new HeroMemento(patrons, lives);
    }

    /**
     * Восстанавливает состояние героя.
     * @param memento ранее сохраненное состояние героя.
     */
    public void restoreState(HeroMemento memento) {
        this.patrons = memento.getPatrons();
        this.lives = memento.getLives();
    }

}
