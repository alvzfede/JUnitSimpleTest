package com.junitsimpletest.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.junitsimpletest.main.Calculadora;

public class CalculadoraTest {
	
	Calculadora calculadora;

	@Before
	public void before(){
		calculadora = new Calculadora();
	}
	
	@After
	public void after(){}
	
	@Test
	public void testSuma(){
		int resultado = calculadora.suma(2, 3);
		int esperado = 5;
		
		assertEquals(esperado,resultado);
	}

	@Test
	public void testResta(){
		int resultado = calculadora.resta(3, 2);
		int esperado = 1;
		assertEquals(esperado,resultado);
	}
}
