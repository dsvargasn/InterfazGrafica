/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

/**
 * Clase que permite implementar un contador.
 * @author Estudiantes
 */
public class Contador {
    
    private int valor;

    /**
     * Método que retorna el valor del cronómetro
     * @return el valor del contador 
     */
    
    public int getValor() {
        return valor;
    }
    
    /**
     * Método que establece el valor del contador
     * @param valor: entero que se setea en el atributo de la clase
     */

    public void setValor(int valor) {
        this.valor = valor;
    }
    
    public Contador () {
        this.valor = 0;
    }
    
    /*
     * Método que avanza el valor del contador.
     */
    
    public void avanzar() {
        this.valor += 1;
    }
    
    /*
     * Método que retrocede el valor del contador.
     */
    
    public void retroceder() {
        this.valor -= 1;
    }
    
    /*
     * Método que reinicia el valor del contador.
     */
    
    public void borrar() {
        this.valor = 0;
    }
    
}
