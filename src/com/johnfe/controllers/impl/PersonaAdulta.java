/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.johnfe.controllers.impl;

import com.johnfe.controllers.dao.IPersonaDAO;

/**
 *
 * @author johnfe
 */
public class PersonaAdulta  implements IPersonaDAO{

    @Override
    public void caminar() {
        System.out.println("camina con mucha frecuencia");
    }

    @Override
    public void comer() {
    
        System.out.println("la persona traga mucho");
    }

    @Override
    public void hablar() {
        System.out.println("poco habla");
    }
    
}
