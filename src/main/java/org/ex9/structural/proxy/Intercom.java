package org.ex9.structural.proxy;

/**
 * Прокси-объект - "домофон", который проверяет введенный пин-код,
 * прежде чем открыть дверь
 * @see FlatDoor
 * @author Краковцев Артём
 */
public class Intercom implements Door {

    /**
     * Ссылка на дверь, к которой прокси делегирует дальнейший функционал.
     */
    private final Door door;
    /**
     * Правильный пин-код.
     */
    private final String pin;

    public Intercom(Door door, String pin) {
        this.door = door;
        this.pin = pin;
    }

    /**
     * @return открыта ли дверь.
     */
    @Override
    public boolean isOpen() {
        return door.isOpen();
    }

    /**
     * Открывает дверь, если пин-код совпадает.
     * @param pin информация, необходимая для открытия двери(ключ, пин-код и т.д.).
     */
    @Override
    public void open(String pin) {
        if (pin.equals(this.pin)) {
            door.open(pin);
        }
    }

}
