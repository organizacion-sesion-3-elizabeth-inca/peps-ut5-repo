package es.gva.edu.sanchezgarcia.jg.mavenproject54;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Clase que implementa las pruebas para la clase Cuadrado.java
 * @author José Gaspar Sánchez García
 */
public class CuadradoTest {

    private static Cuadrado c0;
    private static Cuadrado c1;
    private static Cuadrado c8;
    private static Cuadrado cn5;
    private static String s = "";

    public CuadradoTest() {
    }

    @BeforeAll
    public static void setUpClass() {
        c0 = new Cuadrado(0);
        c1 = new Cuadrado(1);
        c8 = new Cuadrado(8);
        cn5 = new Cuadrado(-5);
        s = c8.toString();
    }

    @AfterAll
    public static void tearDownClass() {
    }

    @BeforeEach
    public void setUp() {
    }

    @AfterEach
    public void tearDown() {
    }

    @Test
    public void testGetLado() {
        Cuadrado instance = c0;
        assertEquals(0, instance.getLado());

        assertEquals(1, c1.getLado());
        assertEquals(8, c8.getLado());
        assertEquals(0, cn5.getLado());
    }

    @Test
    public void testSetLado() {
        int lado = 10;
        Cuadrado instance = new Cuadrado(10);
        instance.setLado(lado);
        int r = instance.getLado();
        assertEquals(r, 10);
    }

    @Test
    public void testToString() {
        Cuadrado instance = c8;
        String expResult = s;
        String result = instance.toString();
        assertEquals(expResult, result);
    }

    @Test
    public void testCalcularArea() {
        Cuadrado instance = c0;
        double expResult = 0.0;
        double result = instance.calcularArea();
        assertEquals(expResult, result, 0);

        result = cn5.calcularArea();
        assertEquals(expResult, result, 0);

        expResult = 1.0;
        result = c1.calcularArea();
        assertEquals(expResult, result, 0);

        expResult = 64.0;
        result = c8.calcularArea();
        assertEquals(expResult, result, 0);
    }

    @Test
    public void testCalcularPerimetro() {
        Cuadrado instance = c0;
        double expResult = 0.0;
        double result = instance.calcularPerimetro();
        assertEquals(expResult, result, 0);

        result = cn5.calcularPerimetro();
        assertEquals(expResult, result, 0);

        expResult = 4.0;
        result = c1.calcularPerimetro();
        assertEquals(expResult, result, 0);

        expResult = 32.0;
        result = c8.calcularPerimetro();
        assertEquals(expResult, result, 0);
    }
}
