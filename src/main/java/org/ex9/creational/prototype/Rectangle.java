package org.ex9.creational.prototype;

/**
 * Реализация интерфейса {@link Figure} в виде прямоугольника.
 * Поддерживает операцию клонирования ({@link #copy()}).
 * @author Краковцев Артём
 */
public class Rectangle implements Figure {

    private final int width;
    private final int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    /**
     * Создает и возвращает копию текущего прямоугольника.
     * @return новый объект Rectangle с такими же параметрами.
     */
    @Override
    public Figure copy() {
        return new Rectangle(this.width, this.height);
    }

    /**
     * @return описание прямоугольника и его параметров.
     */
    @Override
    public String getName() {
        return "Прямоугольник с длинной %d и шириной %d".formatted(this.height, this.width);
    }

}
