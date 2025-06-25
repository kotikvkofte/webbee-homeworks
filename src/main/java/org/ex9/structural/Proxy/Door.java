package org.ex9.structural.Proxy;

/**
 * Абстракция (subject) паттерна "Заместитель" на примере двери.
 * Является общим интерфейсом для класса {@link FlatDoor} и его заместителя {@link Intercom}
 * @author Краковцев Артём
 */
public interface Door {

    /**
     * @return открыта ли дверь.
     */
    boolean isOpen();

    /**
     * Метод, который переводит состояние двери в открытое.
     * @param info информация, необходимая для открытия двери(ключ, пин-код и т.д.).
     */
    void open(String info);

}
