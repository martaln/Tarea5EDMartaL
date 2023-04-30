/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package prácticaunidad3;

/**
 * Clase cuenta cuyos atributos son nombre, cuenta, saldo y tipo de interés 
 * @author Marta López  
 * 
 */
public class CCuenta {

    // Propiedades de la Clase Cuenta
    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterés;

    /* Constructor sin argumentos */
    public CCuenta() {
    }

    // Constructor con parámetro para iniciar todas las propiedades de la clase
    public CCuenta(String nom, String cue, double sal, double tipo) {
        nombre = nom;
        cuenta = cue;
        saldo = sal;
    }
    // Método para asignar el nombre del titular de la cuenta

    public void setNombre(String nom) {
        nombre = nom;
    }

    // Método que me devuelve el nombre del titular
    public String getNombre() {
        return nombre;
    }

    // Método que me devuelve el saldo disponible en cada momento
    public double getEstado() {
        return saldo;
    }

    /* Método para ingresar cantidades en la cuenta. Modifica el saldo.
     * Este método va a ser probado con Junit
     */
    public void ingresar(double cantidad) throws Exception {
        if (cantidad < 0) {
            throw new Exception("No se puede ingresar una cantidad negativa");
        }
        saldo = saldo + cantidad;
    }

    /* Método para retirar cantidades en la cuenta. Modifica el saldo.
     * Este método va a ser probado con Junit
     */
    public void retirar(double cantidad) throws Exception {
        if (cantidad <= 0) {
            throw new Exception("No se puede retirar una cantidad negativa");
        }
        if (getEstado() < cantidad) {
            throw new Exception("No se hay suficiente saldo");
        }
        saldo = saldo - cantidad;
    }

    // Método que me devuelve el número de cuenta
    public String getCuenta() {
        return cuenta;
    }
    
    // Método que me devuelve el saldo disponible en cada momento
    public double getSaldo() {
        return saldo;
    }
    
    // Método que establece el saldo
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    // Método que me devuelve el tipo de interés disponible en cada momento
    public double getTipoInterés() {
        return tipoInterés;
    }
    
    // Método que me establece el tipo de interés
    public void setTipoInterés(double tipoInterés) {
        this.tipoInterés = tipoInterés;
    }
}
