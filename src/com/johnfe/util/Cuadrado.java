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
public class Cuadrado extends Figura{

    public Cuadrado() {
    }
    
    public Cuadrado(float medida) {
        
        this.setMedida(medida);
    }
    
    
    
    

    @Override
    public void calcularArea() {
   
        float area= this.getMedida()*this.getMedida();
        System.out.println("area del cuadrado es : "+area);
    }

    @Override
    public void calcularPerimetro() {
   
        float perimetro = this.getMedida()*4;
        System.out.println("perimetro del cuadrado es "+perimetro);
     }
    
    
    
    
}
