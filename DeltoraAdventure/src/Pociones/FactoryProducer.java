/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pociones;

/**
 *
 * @author HugoJr. <Hugo Rivera at 00161417@uca.edu.sv>
 */
public class FactoryProducer {
    public static AbstractFactory getPocion(String type){
        switch(type){
            case "Pocion":
                return new FactoryPocion();
        }
        return null;
    }
}
