package fr.anthonyquere.teashop;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class TeaTest {
    @Test
    void should_create_tea_with_correct_parameters() {
        String name = "Green Tea";
        int steepingTime = 180;
        int idealTemp = 80;
        boolean isLoose = true;

        Tea tea = new Tea(name, steepingTime, idealTemp, isLoose);

        assertThat(tea.getName()).isEqualTo(name);
        assertThat(tea.getSteepingTimeSeconds()).isEqualTo(steepingTime);
        assertThat(tea.getIdealTemperatureCelsius()).isEqualTo(idealTemp);
        assertThat(tea.isLoose()).isEqualTo(isLoose);
    }

    @Test
    void should_update_tea_properties() {
        Tea tea = new Tea("Green Tea", 180, 80, true);

        tea.setName("Black Tea");
        tea.setSteepingTimeSeconds(240);
        tea.setIdealTemperatureCelsius(90);
        tea.setLoose(false);

        assertThat(tea.getName()).isEqualTo("Black Tea");
        assertThat(tea.getSteepingTimeSeconds()).isEqualTo(240);
        assertThat(tea.getIdealTemperatureCelsius()).isEqualTo(90);
        assertThat(tea.isLoose()).isFalse();
    }
} 