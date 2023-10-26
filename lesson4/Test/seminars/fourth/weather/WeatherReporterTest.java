package seminars.fourth.weather;


import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;
import static org.assertj.core.api.AssertionsForClassTypes.*;

class WeatherReporterTest {
    @Test
    void weatherTest() {
        WeatherService ws = mock(WeatherService.class);
        when(ws.getCurrentTemperature()).thenReturn(20);

        WeatherReporter wr = new WeatherReporter(ws);
        wr.generateReport();
        assertThat(wr.generateReport()).isEqualTo("Текущая температура: " + 20 + " градусов.");
    }

}