package cuentas;

/**
 * @author hermo
 * Clase que albergará los datos y funciones necesarias para tratar las cuentas de los usuarios
 */

public class CCuenta {
     
    /**
     * Declaración de atributos de la clase CCuenta
     */

    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterés;

    /**
     * Constructor vacio de la clase CCuenta
     */
    
    public CCuenta() 
    {
    }

    /**
     * Constructor lleno de la clase CCuenta
     * @param nom Nombre, Alberga el nombre del/la usuario/a
     * @param cue Cuenta, Alberga el codigo de la cuenta
     * @param sal Saldo, Alberga la cantidad de dinero
     * @param tipo  Tipo de interes, Define los intereses de la transacción
     */
    
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
    }
    
    /**
     * Función que devuelve el saldo de la cuenta
     * @return Saldo, la cantidad de dinero que tiene la cuenta
     */
    
    public double estado()
    {
        return saldo;
    }
    /**
     * Función encargada de ingresar dinero
     * @param cantidad Cantidad a ingresar en la cuenta
     * @throws Exception Excepción que controla el no introducir una cantidad negativa
     */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        saldo = saldo + cantidad;
    }
    /**
     * Función encargada de retirar el dinero
     * @param cantidad Cantidad a ingresar en la cuenta
     * @throws Exception Por un lado se controla que cantidad no sea negativa y por oyto lado que exista el saldo necesario
     */
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No hay suficiente saldo");
        saldo = saldo - cantidad;
    }
    
    /**
     * Get de nombre
     */
    
    //Encapsulamiento de atributos
    public String getNombre() {
        return nombre;
    }
    /**
     * Set de nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    /**
     * Get de cuenta 
     */
    public String getCuenta() {
        return cuenta;
    }
    /**
     * Set de cuenta 
     */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }
    /**
     * Get de saldo
     */
    public double getSaldo() {
        return saldo;
    }
    /**
     * Set de saldo 
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    /**
     * Get de tipo 
     */
    public double getTipoInterés() {
        return tipoInterés;
    }
    /**
     * Set de tipo de interes
     */
    public void setTipoInterés(double tipoInterés) {
        this.tipoInterés = tipoInterés;
    }
    
}
