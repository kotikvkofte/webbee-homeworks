package org.ex9.structural.proxy;

/**
 * Реализация обычной двери.
 * @author Краковцев Артём
 */
public class FlatDoor implements Door {

    /**
     * Состояние открытости двери.
     */
    private boolean isOpen = false;

    /**
     * @return открыта ли дверь.
     */
    @Override
    public boolean isOpen() {
        return isOpen;
    }

    /**
     * Любой вызов открывает дверь.
     * @param info информация, необходимая для открытия двери(ключ, пин-код и т.д.).
     */
    @Override
    public void open(String info) {
        isOpen = true;
    }

}
