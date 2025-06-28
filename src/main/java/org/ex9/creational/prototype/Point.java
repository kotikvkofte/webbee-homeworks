package org.ex9.creational.prototype;

/**
 * Точка в двумерном пространстве.
 * Используется для определения центра окружности в классе {@link Circle}.
 * @author Краковцев Артём
 */
public class Point {

    private final int x;
    private final int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    /**
     * @return координата точки по оси X.
     */
    public int getX() {
        return x;
    }

    /**
     * @return координата точки по оси Y.
     */
    public int getY() {
        return y;
    }

}
