package behavioral.chain;

import org.ex9.behavioral.chain.Handler;
import org.ex9.behavioral.chain.HeightHandler;
import org.ex9.behavioral.chain.Order;
import org.ex9.behavioral.chain.WidthHandler;
import org.ex9.behavioral.chain.WeightHandler;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ChainOfResponsibility {

    @Test
    @DisplayName("Все параметры в пределах нормы — цепочка проходит до конца")
    void allParamsValid() {
        Order order = new Order("1", "нормальный груз");
        order.setHeight(170);
        order.setWidth(90);
        order.setWeight(80);

        StringBuilder log = new StringBuilder();
        Handler chain = new HeightHandler();
        chain.bind(new WidthHandler()).bind(new WeightHandler());
        chain.handle(order, log);

        Assertions.assertEquals(
                "Высота в пределах нормы; Ширина в пределах нормы; Вес в пределах нормы; ",
                log.toString()
        );
    }

    @Test
    @DisplayName("Превышена высота — цепочка обрывается на первом этапе")
    void exceedHeightStopsChain() {
        Order order = new Order("2", "Высокий груз");
        order.setHeight(200);
        order.setWidth(90);
        order.setWeight(80);

        StringBuilder log = new StringBuilder();
        Handler chain = new HeightHandler();
        chain.bind(new WidthHandler()).bind(new WeightHandler());
        chain.handle(order, log);

        Assertions.assertEquals("Высота превышает 180 см; ", log.toString());
        Assertions.assertFalse(log.toString().contains("Ширина")); // убеждаемся, что дальше не пошло
    }

    @Test
    @DisplayName("Превышена ширина — проверка высоты пройдена, цепочка обрывается на втором этапе")
    void exceedWidthStopsChain() {
        Order order = new Order("3", "Широкий груз");
        order.setHeight(170);
        order.setWidth(120);
        order.setWeight(80);

        StringBuilder log = new StringBuilder();
        Handler chain = new HeightHandler();
        chain.bind(new WidthHandler()).bind(new WeightHandler());
        chain.handle(order, log);

        Assertions.assertEquals(
                "Высота в пределах нормы; Ширина превышает 100 см; ",
                log.toString()
        );
        Assertions.assertFalse(log.toString().contains("Вес"));
    }

    @Test
    @DisplayName("Превышен вес — высота и ширина пройдены, цепочка обрывается на последнем этапе")
    void exceedWeightStopsChain() {
        Order order = new Order("4", "Тяжёлый груз");
        order.setHeight(170);
        order.setWidth(90);
        order.setWeight(150);

        StringBuilder log = new StringBuilder();
        Handler chain = new HeightHandler();
        chain.bind(new WidthHandler()).bind(new WeightHandler());
        chain.handle(order, log);

        Assertions.assertEquals(
                "Высота в пределах нормы; Ширина в пределах нормы; Вес превышает 100 кг; ",
                log.toString()
        );
    }

}
