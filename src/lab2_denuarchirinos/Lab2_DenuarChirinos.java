/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2_denuarchirinos;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Denuar
 */
public class Lab2_DenuarChirinos {

    /**
     * @param args the command line arguments
     */
    static String dueño, estCompra="", estado, ing, color; 
    static int nCasa,nBloque, nPisos, nBaños, nCuartos, ancho, largo;
    static ArrayList lista = new ArrayList();
    static Scanner ent = new Scanner (System.in);
    static int login=0;
    public static void main(String[] args) {
        // TODO code application logic here
        int opcion=0;
        while (opcion != 4) {
            System.out.println("1. Registro de casas\n" +
                "2. Manejo de estados\n" +
                "3. Log In\n" +
                "4. Salir");
            opcion=ent.nextInt();
            
            switch (opcion){
                case 1: //registro de casas
                    if (login==1){
                        int opregistro=0;
                        System.out.println("1. Crear Casa\n" +
                            "2. Listar Casas\n" +
                            "3. Modificar Casas\n" +
                            "4. Borrar Casas");
                        opregistro=ent.nextInt();
                        switch(opregistro){
                            case 1: // Crear casa
                                System.out.print("Ingrese Dueño de la casa: ");
                                dueño=ent.next();
                                System.out.print("Ingrese estado de compra de la casa: "
                                        + "\n1. Comprada"
                                        + "\n2. No Comprada:");
                                estCompra=ent.next();
                                switch (estCompra){
                                    case "1":
                                        estCompra="Comprada";
                                        break;
                                    case "2":
                                        estCompra="NoComprada";
                                }
                                System.out.print("Ingrese estado de la casa: \n1. lista"
                                        + "\n2. En construccion"
                                        + "\n3. Construccion en espera"
                                        + "\n4. En espera de demolición: ");                                
                                estado=ent.next();
                                switch (estado){
                                    case "1":
                                        estado="Lista";
                                        break;
                                    case "2":
                                        estado="EnConstruccion";
                                        break;
                                    case "3":
                                        estado="EsperaConstrucción";
                                        break;   
                                    case "4":
                                        estado="EsperaDemolicion";
                                        break;
                                }
                                System.out.print("Ingrese Nombre ing. a cargo: ");
                                ing=ent.next();
                                System.out.print("Ingrese # de pisos:");
                                nPisos=ent.nextInt();
                                System.out.print("Ingrese # de baños: ");
                                nBaños=ent.nextInt();
                                System.out.print("Ingrese # de Cuartos: ");
                                nCuartos=ent.nextInt();
                                System.out.print("Ingrese ancho: ");
                                ancho= ent.nextInt();
                                System.out.print("Ingrese largo: ");
                                largo=ent.nextInt();
                                System.out.print("Ingrese # de casa: ");
                                nCasa=ent.nextInt();
                                System.out.print("Ingrese # de bloque: ");
                                nBloque=ent.nextInt();
                                System.out.print("Ingrese color: ");
                                color=ent.next();                                
                                lista.add(new Casa(dueño, estCompra, estado, ing, color, nCasa, nBloque, nPisos, nBaños, nCuartos, ancho, largo));
                                estCompra="";
                                break;//fin crear casa
                                
                            case 2://Listar casas
                                String s = ""; 
                                for (Object t : lista) {
                                    if (t instanceof Casa) {
                                        s += "Posicion: " + lista.indexOf(t) + "- " + t + "\n";
                                    }
                                }
                                System.out.println(s);
                                break;//fin Listar casas
                                
                            case 3://modificar casa
                                int p;
                                System.out.print("Ingrese Posicion a modificar: ");
                                p=ent.nextInt();
                                if(lista.get(p) instanceof Casa){
                                    System.out.print("Ingrese Dueño de la casa: ");
                                    dueño=ent.next();
                                    ((Casa)lista.get(p)).setDueño(dueño);
                                    System.out.print("Ingrese estado de compra de la casa: "
                                                    + "\n1. Comprada"
                                                    + "\n2. No Comprada:");
                                    estCompra=ent.next();
                                    switch (estCompra){
                                        case "1":
                                            estCompra="Comprada";
                                            break;
                                        case "2":
                                            estCompra="NoComprada";
                                    }                                    
                                    System.out.print("Ingrese Nombre ing. a cargo: ");
                                    ing=ent.next();
                                    ((Casa)lista.get(p)).setIng(ing);
                                    System.out.print("Ingrese # de pisos:");
                                    nPisos=ent.nextInt();
                                    ((Casa)lista.get(p)).setNPisos (nPisos);
                                    System.out.print("Ingrese # de baños: ");
                                    nBaños=ent.nextInt();
                                    ((Casa)lista.get(p)).setNBaños (nBaños);                         
                                    System.out.print("Ingrese # de Cuartos: ");
                                    nCuartos=ent.nextInt();
                                    ((Casa)lista.get(p)).setNCuartos(nCuartos);                        
                                    System.out.print("Ingrese ancho: ");
                                    ancho= ent.nextInt();
                                    ((Casa)lista.get(p)).setAncho(ancho);                        
                                    System.out.print("Ingrese largo: ");
                                    largo=ent.nextInt();
                                    ((Casa)lista.get(p)).setLargo(largo);                        
                                    System.out.print("Ingrese # de casa: ");
                                    nCasa=ent.nextInt();
                                    ((Casa)lista.get(p)).setNCasa(nCasa);                        
                                    System.out.print("Ingrese # de bloque: ");
                                    nBloque=ent.nextInt();
                                    ((Casa)lista.get(p)).setNBloque(nBloque);                        
                                    System.out.print("Ingrese color: ");
                                    color=ent.next();   
                                    ((Casa)lista.get(p)).setColor(color);                      
                                                
                        
                                }
                                break;//fin modificar casa
                                
                            case 4://borrar casa
                                 int pl,r;
                                 System.out.println("Posicion a eliminar= ");
                                 pl=ent.nextInt();
                                r=JOptionPane.showConfirmDialog(null, "Esta seguro");
                                if(r==0){
                                lista.remove(pl);
                                }
                                break;//fin borrar casa
                                
                            default: 
                                System.out.println("Entrada invalida");
                        }                        
                    }
                    else{
                        System.out.println("Debe iniciar sesion primero");
                    }
                    break;//fin registro de casas
                    
                case 2: //                    
                    if (login==1){
                        int listas=0, construccion=0, esperaConstruccion=0, esperaDemolicion=0; 
                        ArrayList cListas = new ArrayList();
                        ArrayList cConstruccion = new ArrayList();
                        ArrayList cEsperaConstruccion = new ArrayList();
                        ArrayList cEsperaDemolicion = new ArrayList();
                        for (int i = 0; i < lista.size(); i++) {
                            if (((Casa)(lista.get(i))).getEstado().equals("Lista")){
                                listas++;
                                cListas.add(lista.get(i));
                            }
                            else if (((Casa)(lista.get(i))).getEstado().equals("EnConstruccion")){
                                construccion++;
                                cConstruccion.add(lista.get(i));
                            }
                            else if (((Casa)(lista.get(i))).getEstado().equals("EnConstruccion")){
                                esperaConstruccion++;
                                cEsperaConstruccion.add(lista.get(i));
                            }
                            else{
                                esperaDemolicion++;
                                cEsperaDemolicion.add(lista.get(i));
                            }                                
                        }
                        System.out.println("Casas Listas: ");
                        String s1 = ""; 
                        for (Object t : cListas) {
                            if (t instanceof Casa) {
                                s1 += "Posicion: " + lista.indexOf(t) + "- " + t + "\n";
                            }
                        }
                        System.out.println(s1);
                        
                        System.out.println("Casas en Construccion: ");
                        String s2 = ""; 
                        for (Object t : cConstruccion) {
                            if (t instanceof Casa) {
                                s2 += "Posicion: " + lista.indexOf(t) + "- " + t + "\n";
                            }
                        }
                        System.out.println(s2);
                        
                        System.out.println("Casas en Espera de Construccion: ");
                        String s3 = ""; 
                        for (Object t : cEsperaConstruccion) {
                            if (t instanceof Casa) {
                                s3 += "Posicion: " + lista.indexOf(t) + "- " + t + "\n";
                            }
                        }
                        System.out.println(s3);
                        
                        System.out.println("Casas en Espera de Demolicion: ");
                        String s4 = ""; 
                        for (Object t : cEsperaDemolicion) {
                            if (t instanceof Casa) {
                                s4 += "Posicion: " + lista.indexOf(t) + "- " + t + "\n";
                            }
                        }
                        System.out.println(s4);
                        
                       
                        int q;
                        System.out.print("Ingrese Posicion a modificar: ");
                        q=ent.nextInt();
                        if(lista.get(q) instanceof Casa){
                            
                            System.out.print("Ingrese nuevo estado de la casa: \n1. lista"
                                + "\n2. En construccion"
                                + "\n3. Construccion en espera"
                                + "\n4. En espera de demolición: ");                                
                            estado=ent.next();
                            switch (estado){
                                case "1":
                                    estado="Lista";
                                    break;
                                case "2":
                                    estado="EnConstruccion";
                                    break;
                                case "3":
                                    estado="EsperaConstrucción";
                                    break;   
                                case "4":
                                    estado="EsperaDemolicion";
                                    break;
                            }                                    
                            ((Casa)lista.get(q)).setEstado(estado);                   
                        }
                    }
                    else{
                        System.out.println("Debe iniciar sesion primero");
                    }
                    break; //
                    
                case 3:// 
                    String usuario="leobanegas", password="99", usuario2="", password2="";
                    while (!usuario.equals(usuario2)){
                        System.out.print("Ingrese Usuario: ");
                        usuario2=ent.next();
                    }
                    while(!password.equals(password2)){
                        System.out.print("Ingrese Contraseña: ");
                        password2=ent.next();
                    }
                    if (usuario.equals(usuario2) && password.equals(password2)){
                        login=1;
                        System.out.println("Inicio de sesion exitoso!");
                    }
                    break; //
                    
            }
            
        }
    }
    
}
