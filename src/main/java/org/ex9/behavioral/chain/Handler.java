package org.ex9.behavioral.chain;

/**
 *  Абстрактный узел цепочки «Цепочка обязанностей».
 *  <p>
 * Каждый обработчик хранит ссылку на следующий узел и
 * решает: передавать {@link Order} дальше или остановить цепочку.
 *  </p>
 * @author Краковцев Артём
 * @see HeightHandler
 * @see WeightHandler
 * @see WidthHandler
 */
public abstract class Handler {

    /**
     * Следующий обработчик в цепочке, может иметь значение {@code null}.
     */
    private Handler next;

    /**
     * Выполняет обработку {@link Order} и может передать его дальше
     * @param order объект заказа
     * @param logger сборщик сообщений для формирования результата работы цепочки
     */
    public void handle(Order order, StringBuilder logger) {
        if (next != null) {
            next.handle(order, logger);
        }
    }

    /**
     * Привязывает следующий узел и переходит к нему
     * @param next следующий узел цепочки
     * @return следующий узел цепочки
     */
    public Handler bind(Handler next) {
        this.next = next;
        return next;
    }

}
