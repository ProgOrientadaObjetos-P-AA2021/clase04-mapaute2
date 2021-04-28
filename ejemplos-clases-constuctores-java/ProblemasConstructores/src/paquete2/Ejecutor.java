/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;

/**
 *
 * @author reroes
 */
public class Ejecutor {
    public static void main(String[] args) {
        
        /*Crear un objeto y presentar los datos
        Ingresar la información por teclado.
        */
        String nombre = "Isidro Ayora";
        String ciudad = "Loja";
        int numeroDoctores = 100;
        int numeroEnfermeros = 200;
        
        Hospital hospital = new Hospital(nombre,ciudad,numeroDoctores,numeroEnfermeros);
        
        System.out.printf("Los datos son:\nNombre: %s\nCiudad: %s\n"
                + "Número Doctores: %d\nNúmero enfermeros: %d\n", hospital.obtenerNombre(),
                hospital.obtenerCiudad(),hospital.obtenerNumeroDoctores(),hospital.obtenerNumeroEnfermeros());
 
    }
}
