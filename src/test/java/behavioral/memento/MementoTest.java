package behavioral.memento;

import org.ex9.behavioral.memento.GameHistory;
import org.ex9.behavioral.memento.Hero;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class MementoTest {

    @Test
    @DisplayName("Восстановление одного состояния")
    public void restoreOneMemento() {
        Hero hero = new Hero(10, 5);
        hero.shoot();
        var memento = hero.saveState();
        hero.shoot();
        hero.shoot();

        Assertions.assertEquals(7, hero.getPatrons());

        hero.restoreState(memento);
        Assertions.assertEquals(9, hero.getPatrons());

    }

    @Test
    @DisplayName("Восстановление последнего сохраненного состояния")
    public void restoreLastSaveMemento() {
        Hero hero = new Hero(10, 5);
        GameHistory gameHistory = new GameHistory();
        hero.shoot();
        gameHistory.getStackStates().push(hero.saveState());
        hero.shoot();
        gameHistory.getStackStates().push(hero.saveState());
        hero.shoot();
        hero.shoot();

        Assertions.assertEquals(6, hero.getPatrons());

        hero.restoreState(gameHistory.getStackStates().pop());
        Assertions.assertEquals(8, hero.getPatrons());

    }

}
