package creational;

import org.ex9.creational.prototype.Circle;
import org.ex9.creational.prototype.Figure;
import org.ex9.creational.prototype.Rectangle;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class PrototypeTest {

    @Test
    @DisplayName("Создание копии прямоугольника и его сравнение")
    void testRectanglePrototype() {
        Figure figure = new Rectangle(5, 5);
        Figure copy = figure.copy();

        Assertions.assertAll(
                () -> Assertions.assertNotEquals(figure, copy),
                () -> Assertions.assertEquals(figure.getName(), copy.getName())
        );
    }

    @Test
    @DisplayName("Создание копии окружности и его сравнение")
    void testCirclePrototype() {
        Figure figure = new Circle(5, 0, 0);
        Figure copy = figure.copy();

        Assertions.assertAll(
                () -> Assertions.assertNotEquals(figure, copy),
                () -> Assertions.assertEquals(figure.getName(), copy.getName())
        );
    }

}
