package org.ex9.creational.prototype;

/**
 * Интерфейс, который используется в качестве прототипа.
 * Реализуется классами {@link Circle} и {@link Rectangle}.
 * @author Краковцев Артём
 */
public interface Figure {

    /**
     * Создает и возвращает копию текущего объекта.
     *
     * @return новый объект, являющийся копией текущего.
     */
    Figure copy();

    /**
     * @return название фигуры.
     */
    String getName();

}
