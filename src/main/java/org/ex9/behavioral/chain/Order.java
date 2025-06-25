package org.ex9.behavioral.chain;

/**
 * Заказ (груз), который будет проходить через цепочку зависимостей.
 * Хранит размер и вес, которые проверяются в цепочке.
 * @author Краковцев Артём
 */
public class Order {

    private final String id;
    private final String name;
    private int weight;
    private int height;
    private int width;

    /**
     * @param id идентификатор заказа
     * @param name название заказа
     */
    public Order(String id, String name) {
        this.id = id;
        this.name = name;
    }

    /** @return идентификатор заказа */
    public String getId() {
        return id;
    }

    /**
     * @return название заказа
     */
    public String getName() {
        return name;
    }

    /**
     * @return вес заказа, кг
     */
    public int getWeight() {
        return weight;
    }

    /**
     * @return высота заказа, см
     */
    public int getHeight() {
        return height;
    }

    /**
     * @return ширина заказа, см
     */
    public int getWidth() {
        return width;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setWidth(int width) {
        this.width = width;
    }

}
