package es.gva.edu.sanchezgarcia.jg.mavenproject54;

/**
 * Implementación de una figura geométrica tipo Cuadrado.
 * @author José Gaspar Sánchez García
 */
public class Cuadrado implements Figura {

    private int lado;

    /**
     * Constructor
     * @param lado
     */
    public Cuadrado(int lado) {
        this.lado = lado;
    }

    /* Getters and Setters */
    public int getLado() {
        return lado;
    }

    public void setLado(int lado) {
        this.lado = lado;
    }

    @Override
    public String toString() {
        return "Cuadrado{" + "lado=" + lado + '}';
    }

    /* Implementación de la interfaz */
    @Override
    public double calcularArea() {
        return lado * lado;
    }

    @Override
    public double calcularPerimetro() {
        return 4 * lado;
    }
}
