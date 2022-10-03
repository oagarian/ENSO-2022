package app;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;

public class SomaTest {

    Soma soma;

    @BeforeEach
    public void before() {
        soma = new Soma();
    }

    @Test
    public void verificarCasoBase(){
        double resultado = soma.calcula("5","9");
        assertEquals(1.0, resultado);
    }

    @Test
    public void verificarSomaDouble(){
        double resultado = soma.calcula("200", "300");
        assertEquals(500, resultado);
    }
}
