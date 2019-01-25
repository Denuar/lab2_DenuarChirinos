/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2_denuarchirinos;

import java.awt.Color;

/**
 *
 * @author Denuar
 */
public class Casa {
    //atributos
    private String dueño, estCompra, estado, ing, color; 
    private int nCasa,nBloque, nPisos, nBaños, nCuartos, ancho, largo;

    //constructores
    //constructor vacio
    public Casa() {        
    }
    //constructor2
    public Casa(String dueño, String estCompra, String estado, String ing, String color, //4
            int nCasa, int nBloque, int nPisos, int nBaños, int nCuartos, int ancho, int largo)//7
            {
        this.dueño= dueño;
        this.estCompra=estCompra;
        this.estado=estado;
        this.ing=ing;
        this.nCasa=nCasa;
        this.nBaños=nBaños;
        this.nBloque=nBloque;
        this.nCuartos=nCuartos;
        this.nPisos=nPisos;
        this.ancho=ancho;
        this.largo=largo;
        this.color=color;
    }   

    //Accesadores
    public String getDueño(){
        return this.dueño;
    }
    public String getEstCompra(){
        return this.estCompra;
    }
    public String getEstado(){
        return this.estado;
    }
    public String getIng(){
        return this.ing;
    }
    public int getNCasa(){
        return this.nCasa;
    }
    public int getNBaños(){
        return this.nBaños;
    }
    public int getNBloque(){
        return this.nBloque;
    }
    public int getNCuartos(){
        return this.nCuartos;
    }
    public int getNPisos(){
        return this.nPisos;
    }
    public int getAncho(){
        return this.nCasa;
    }
    public int getLargo(){
        return this.nCasa;
    }
    public String getColor(){
        return this.color;
    }
    
    
    //Mutadores
    public void setDueño(String nuevoDueño){
        this.dueño=nuevoDueño;
    }
    public void setNCasa(int nuevonCasa){
        this.nCasa=nuevonCasa;
    }
    public void setNBloque(int nuevonBloque){
        this.nBloque=nuevonBloque;
    }
    public void setColor(String nuevoColor){
        this.color=nuevoColor;
    }
    public void setAncho(int nuevoAncho){
        this.ancho=nuevoAncho;
    }
    public void setLargo(int nuevoLargo){
        this.largo=nuevoLargo;
    }
    public void setEstCompra(String nuevoEstCompra){
        this.estCompra=nuevoEstCompra;
    }
    public void setNPisos(int nuevonPisos){
        this.nPisos=nuevonPisos;
    }
    public void setNBaños(int nuevonBaños){
        this.nBaños=nuevonBaños;
    }
    public void setNCuartos(int nuevonCuartos){
        this.nCuartos=nuevonCuartos;
    }
    public void setEstado(String nuevoEstado){
        this.estado=nuevoEstado;
    }public void setIng(String nuevoIng){
        this.ing=nuevoIng;
    }
    
    

    //MA
    public String toString(){
        return "Estado de compra: " + estCompra + ", Dueño: " + dueño + ", estado: " + estado + ", Ing. a Cargo: " + ing + 
                ", \n# de casa:" + nCasa + ", # de Baños: " + nBaños + ", # de Bloque: " + nBloque + ", # de cuartos: " + nCuartos + 
                ", # de pisos: " + nPisos + ", Ancho: " + ancho + ", Largo: " + largo + 
                ", \nColor: " + color;
    }
}
