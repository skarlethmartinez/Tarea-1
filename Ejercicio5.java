/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Usuario
 */
public class Ejercicio5 {
    public class DetallesCompaneros {
    public static void main(String[] args) {
        String[][] companeros = {
            {"Diana", "Selva", "Ing.computacion", "SPS"},
            {"Arnol", "Aguilar", "Electronica", "SPS"},
            {"Carlos", "Fernando", "Computacion", "Tegucigalpa"},
            {"Keysi", "Fuentes", "Compuutacion", "Cortes"},
            {"Luis", "Ayala", "Produccion Industrial", "Choluteca"}
        };
        
        for (String[] companero : companeros) {
            System.out.println(companero[0] + " " + companero[1] + " " + companero[2] + " " + companero[3]);
        }
    }
}

}
