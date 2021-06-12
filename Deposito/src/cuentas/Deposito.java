/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cuentas;

/**
 *
 * @author hermo
 */
public class Deposito {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CCuenta cuenta1 = null;//Cambiamos miCuenta por cuenta1
        double saldoActual = 0;
        
        operativa_cuenta(cuenta1, saldoActual);

    }
    public static void operativa_cuenta(CCuenta cuenta1, double saldoActual){
        cuenta1 = new CCuenta("Antonio López","1000-2365-85-1230456789",2500,0);//Cambiamos miCuenta por cuenta1
        saldoActual = cuenta1.estado();//Cambiamos miCuenta por cuenta1
        System.out.println("El saldo actual es"+ saldoActual );

        try {
            cuenta1.retirar(2300);//Cambiamos miCuenta por cuenta1
        } catch (Exception e) {
            System.out.print("Fallo al retirar");
        }
        try {
            System.out.println("Ingreso en cuenta");
            cuenta1.ingresar(695);//Cambiamos miCuenta por cuenta1
        } catch (Exception e) {
            System.out.print("Fallo al ingresar");
        }
    }
    
}
