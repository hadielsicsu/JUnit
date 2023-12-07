/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projetoteste1;

/**
 *
 * @author hadielsicsu
 */
import org.junit.Test;
import static org.junit.Assert.*;

public class CalculadoraTest {

    @Test
    public void testAdicao() {
        Calculadora calculadora = new Calculadora();
        assertEquals(5, calculadora.adicao(2, 3));
        assertEquals(-1, calculadora.adicao(-2, 1));
    }

    @Test
    public void testSubtracao() {
        Calculadora calculadora = new Calculadora();
        assertEquals(1, calculadora.subtracao(4, 3));
        assertEquals(5, calculadora.subtracao(8, 3));
    }

    @Test
    public void testMultiplicacao() {
        Calculadora calculadora = new Calculadora();
        assertEquals(6, calculadora.multiplicacao(2, 3));
        assertEquals(-15, calculadora.multiplicacao(5, -3));
    }

    @Test
    public void testDivisao() {
        Calculadora calculadora = new Calculadora();
        assertEquals(2.0, calculadora.divisao(6, 3), 0.0001);
        assertEquals(-2.5, calculadora.divisao(-5, 2), 0.0001);
        
        // Teste para divisão por zero
        try {
            calculadora.divisao(1, 0);
            fail("Exceção esperada para divisão por zero não foi lançada.");
        } catch (IllegalArgumentException e) {
            // Exceção esperada
        }
    }
}

