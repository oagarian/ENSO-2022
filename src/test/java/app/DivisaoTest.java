package app;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;

public class DivisaoTest {

    Divisao divisao;

    @BeforeEach
    public void before() {
        divisao = new Divisao();
    }

    @Test
    public void verificarCasoBase(){
        double resultado = divisao.calcula("4","2");
        assertEquals(2.0, resultado);
    }

    @Test
    public void verificarDivisaoDouble(){
        double resultado = divisao.calcula("7", "2");
        assertEquals(3.5, resultado);
    }

    @Test
    public void verificarDivisaoZero(){
        double resultado = divisao.calcula("0", "4");
        assertEquals(0.0, resultado);
    }

    @Test
    public void verificarDivisaoNegativo(){
        double resultado = divisao.calcula("25", "-5");
        assertEquals(-5.0, resultado);
    }
}