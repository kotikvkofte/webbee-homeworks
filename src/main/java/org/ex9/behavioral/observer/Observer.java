package org.ex9.behavioral.observer;

/**
 * Интерфейс «наблюдателя» (Observer) — получает оповещения от {@link Channel}.
 *
 * @author Краковцев Артём
 * @see Channel
 */
public interface Observer {

    /**
     * Вызывается при публикации новой информации
     * @param news текст новости
     */
    void update(String news);

}
