package app;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;

public class SubtracaoTest {

    Subtracao subtracao;

    @BeforeEach
    public void before() {
        subtracao = new Subtracao();
    }

    @Test
    public void verificarCasoBase(){
        double resultado = subtracao.calcula("4","3");
        assertEquals(1.0, resultado);
    }

    @Test
    public void verificarSubtracaoDouble(){
        double resultado = subtracao.calcula("6.5", "2.7");
        assertEquals(3.8, resultado);
    }

}