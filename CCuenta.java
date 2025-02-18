package cuentas;


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author Eudaldo Alvaro Cal Saul
 */
public class CCuenta {

    /**
     * Obtiene el nombre del titular de la cuenta.
     * 
     * @return El nombre del titular.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre del titular de la cuenta.
     * 
     * @param nombre El nombre del titular.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene el número de cuenta.
     * 
     * @return El número de cuenta.
     */
    public String getCuenta() {
        return cuenta;
    }

    /**
     * Establece el número de cuenta.
     * 
     * @param cuenta El número de cuenta.
     */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    /**
     * Obtiene el saldo de la cuenta.
     * 
     * @return El saldo de la cuenta.
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * Establece el saldo de la cuenta.
     * 
     * @param saldo El saldo de la cuenta.
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

   /**
     * Obtiene el tipo de interés de la cuenta.
     * 
     * @return El tipo de interés de la cuenta.
     */
    public double getTipoInterés() {
        return tipoInterés;
    }

    /**
     * Establece el tipo de interés de la cuenta.
     * 
     * @param tipoInterés El tipo de interés de la cuenta.
     */
    public void setTipoInterés(double tipoInterés) {
        this.tipoInterés = tipoInterés;
    }
    
    /**
     * Constructor con parámetros.
     * 
     * @param nom Nombre del titular de la cuenta.
     * @param cue Número de cuenta.
     * @param sal Saldo inicial de la cuenta.
     * @param tipo Tipo de interés de la cuenta.
     */
    
    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterés;

    public CCuenta(){    
    }

    public CCuenta(String nom, String cue, double sal, double tipo){
        nombre =nom;
        cuenta=cue;
        saldo=sal;
    }
    
    /**
     * Método que devuelve el estado de la cuenta.
     * 
     * @return El saldo actual de la cuenta.
     */
    public double estado(){
        return getSaldo();
    }

    /**
     * Método para retirar una cantidad de la cuenta.
     * 
     * @param cantidad La cantidad a retirar.
     */
    public void retirar(double cantidad){
        try {
            System.out.println("Retiro en cuenta:" + cantidad);
            if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
            if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
            setSaldo(getSaldo() - cantidad);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    /**
     * Método para ingresar una cantidad en la cuenta.
     * 
     * @param cantidad La cantidad a ingresar.
     */
    public void ingresar(double cantidad){
        try {
            System.out.println("Ingreso en cuenta:" + cantidad);
            if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
            setSaldo(getSaldo() + cantidad);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    /**
     * Método principal para probar las operaciones de la cuenta.
     * 
     * @param args Argumentos de la línea de comandos.
     */
    public static void main(String[] args) {
    CCuenta cuenta1;
    double saldoActual;
    cuenta1 = new CCuenta("Eudaldo Cal Saul","1000-2365-85-1230456789",3000,0);
    saldoActual = cuenta1.estado();
    System.out.println("El saldo actual es "+ saldoActual );
    operaciones(cuenta1);

    saldoActual = cuenta1.estado();
        System.out.println(cuenta1);
    System.out.println("El saldo actual es "+ saldoActual );
    }

    /**
     * Método que realiza operaciones de ingreso y retiro en la cuenta.
     * 
     * @param cuenta1 La cuenta en la que se realizan las operaciones.
     */
    private static void operaciones(CCuenta cuenta1) {
        // Operaciones de ingreso y retiro
        cuenta1.retirar(2000);
        cuenta1.ingresar(1000);
    }
}
