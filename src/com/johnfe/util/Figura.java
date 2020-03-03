/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.johnfe.util;

/**
 *
 * @author johnfe
 */
public class Figura {
    
    
   private float medida;
   
   public void calcularPerimetro(){
       
       System.out.println("se calcula el perimetro de la figura");
   
   }
   
   public void calcularArea(){
   
       System.out.println("se calcula el area de la figura");
   }

    /**
     * @return the medida
     */
    public float getMedida() {
        return medida;
    }

    /**
     * @param medida the medida to set
     */
    public void setMedida(float medida) {
        this.medida = medida;
    }
    
}
