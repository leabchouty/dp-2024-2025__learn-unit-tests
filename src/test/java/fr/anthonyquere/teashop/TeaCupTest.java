package fr.anthonyquere.teashop;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;


class TeaCupTest {
    @Test
    void should_not_be_ready_when_empty() {
        TeaCup cup = new TeaCup();
        assertThat(cup.isReadyToDrink()).isFalse();
    }

    @Test
    void should_add_water_correctly() {
        TeaCup cup = new TeaCup();

        cup.addWater(85);
        assertThat(cup.isReadyToDrink()).isFalse();
    }

    @Test
    void should_prepare_tea_correctly() {
        TeaCup cup = new TeaCup();
        Tea tea = new Tea("Green Tea", 0, 85, true);

        cup.addWater(85);
        cup.addTea(tea);
        
        assertThat(cup.isReadyToDrink()).isTrue();
    }
} 