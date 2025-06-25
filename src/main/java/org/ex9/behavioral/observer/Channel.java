package org.ex9.behavioral.observer;

/**
 * Базовый интерфейс «канала» (Subject) паттерна <i>Observer</i>.
 * Позволяет добавлять или удалять наблюдателей и уведомлять их об изменениях.
 *
 * @author Краковцев Артём
 * @see Observer
 */
public interface Channel {

    /**
     * Подписывает нового наблюдателя
     * @param observer объект, который подписывается на обновления
     */
    void addObserver(Observer observer);

    /**
     * Удаляет наблюдателя из списка подписчиков
     * @param observer объект, который подписывается на обновления
     */
    void removeObserver(Observer observer);

    /**
     * Уведомляет всех подписанных наблюдателей об новом состоянии
     */
    void notifyObservers();

}
