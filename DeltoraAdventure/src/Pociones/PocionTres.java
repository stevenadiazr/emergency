/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pociones;

import PersonajesPrincipales.PersonajePrincipal;

/**
 *
 * @author HugoJr. <Hugo Rivera at 00161417@uca.edu.sv>
 */
public class PocionTres implements Pocion{

    PersonajesPrincipales.PersonajePrincipal personajePrincipal = new PersonajePrincipal();
    public int sumaDanio = 10;
    public int sumaVida = 50;
    public int restaVida = 30;
    public int sumaFullVida = 100;
    public boolean suma;
    
    public boolean numeroAleatorio(){
        int aleatorio = (int)(Math.random()* 100)+1;
        if(aleatorio % 2 == 0){
            suma = true;
        }
        else{
            suma = false;
        }
        return suma;
    }

    @Override
    public void sumarDanio() {
//        System.out.println(sumaDanio); 
    }

    @Override
    public void sumarVida() {
//        numeroAleatorio();
        if(suma == true){
            System.out.println("Se ha sumado: " + sumaVida + " a la vida del personaje");
            personajePrincipal.sumarVida(sumaVida);
        } else{
            restarVida();
        }
    }

    @Override
    public void restarVida() {
        if (suma == false){
            System.out.println("Se ha restado: " + restaVida + " a la vida del personaje");
            personajePrincipal.restarVida(restaVida);
        }
    }

    @Override
    public void sumarFullVida() {
        //System.out.println(sumaFullVida);
    }

}
