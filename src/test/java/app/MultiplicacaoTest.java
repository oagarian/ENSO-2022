package app;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;

public class MultiplicacaoTest {
    
    Multiplicacao multiplicacao;
    @BeforeEach
    public void before() {
        multiplicacao = new Multiplicacao();
    }


    @Test
    public void verificaCasoBase() {
        double resultado = multiplicacao.calcula("10", "20");
        assertEquals(200, resultado);
    }

    @Test
    public void verificaMultiplicacaoDecimal() {
        double resultado = multiplicacao.calcula("422.23", "3");
        assertEquals(1266.69, resultado, 0.0001);
    }
    
    @Test
    public void verificaMultiplicacaoZero() {
        double resultado = multiplicacao.calcula("-2424", "0");
        assertEquals(0, resultado);
    }


}
