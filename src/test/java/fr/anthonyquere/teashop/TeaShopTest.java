package fr.anthonyquere.teashop;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

class TeaShopTest {
    @Test
    void should_create_shop_with_default_temperature() {
        int defaultTemp = 85;
        
        TeaShop shop = new TeaShop(defaultTemp);
        
        assertThat(shop).isNotNull();
    }

    @Test
    void should_throw_exception_for_invalid_temperature() {
        TeaShop shop = new TeaShop(85);

        assertThatThrownBy(() -> shop.setWaterTemperature(-1))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("Water temperature must be between 0 and 100°C");

        assertThatThrownBy(() -> shop.setWaterTemperature(101))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("Water temperature must be between 0 and 100°C");
    }

    @Test
    void should_throw_exception_when_tea_not_available() {
        TeaShop shop = new TeaShop(85);

        assertThatThrownBy(() -> shop.prepareTea("Green Tea"))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("Tea not available: Green Tea");
    }

    @Test
    void should_prepare_tea_correctly() {
        TeaShop shop = new TeaShop(85);
        Tea tea = new Tea("Green Tea", 180, 85, true);
        
        shop.addTea(tea);
        TeaCup cup = shop.prepareTea("Green Tea");
        
        assertThat(cup).isNotNull();
    }

    @Test
    void should_be_case_insensitive_for_tea_names() {
        TeaShop shop = new TeaShop(85);
        Tea tea = new Tea("Green Tea", 180, 85, true);
        
        shop.addTea(tea);
        TeaCup cup = shop.prepareTea("green TEA");
        
        assertThat(cup).isNotNull();
    }
} 