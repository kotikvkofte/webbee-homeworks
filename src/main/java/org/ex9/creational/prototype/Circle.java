package org.ex9.creational.prototype;

/**
 * Реализация интерфейса {@link Figure} в виде окружности.
 * Поддерживает операцию клонирования ({@link #copy()}).
 * @author Краковцев Артём
 */
public class Circle implements Figure {

    private final int radius;
    private final Point center;

    public Circle(int radius, int x, int y) {
        this.radius = radius;
        this.center = new Point(x, y);
    }

    /**
     * Создает и возвращает копию текущей окружности.
     * @return новый объект Circle с такими же параметрами.
     */
    @Override
    public Figure copy() {
        return new Circle(this.radius, center.getX(), center.getY());
    }

    /**
     * @return описание окружности и его параметров
     */
    @Override
    public String getName() {
        return "Окружность радиусом %d и центром в точке (%d, %d))".formatted(this.radius, this.center.getX(), this.center.getY());
    }

}
