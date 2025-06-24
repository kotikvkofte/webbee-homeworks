package org.ex9.behavioral.chainOfResponsibility;

/**
 * Узел цепочки обязанностей, который обеспечивает проверку
 * веса груза и фиксирует результат работы.
 * @author Краковцев Артём
 */
public class WeightHandler extends Handler {

    /**
     *  При успехе переходит к следующему узлу.
     *  При неудаче фиксирует результат и прерывает цепочку.
     * @param order объект заказа
     * @param logger сборщик сообщений для формирования результата работы цепочки
     */
    @Override
    public void handle(Order order, StringBuilder logger) {
        final int maxWeight = 100;

        if (order.getWeight() <= maxWeight) {
            logger.append("Вес в пределах нормы; ");
            super.handle(order, logger);
        } else {
            logger.append("Вес превышает %d кг; ".formatted(maxWeight));
        }
    }

}
