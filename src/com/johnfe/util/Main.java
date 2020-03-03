/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.johnfe.util;

import com.johnfe.controllers.dao.IPersonaDAO;
import com.johnfe.controllers.impl.PersonaAdulta;
import com.johnfe.controllers.impl.PersonaAnciana;
import com.johnfe.controllers.impl.PersonaBebe;

/**
 *
 * @author johnfe
 */
public class Main {
    
    
    public static void main(String[] args) {
        
        
        IPersonaDAO matias = new PersonaBebe();
        
        IPersonaDAO carlos = new PersonaAdulta();
        
        IPersonaDAO teresa = new PersonaAnciana();
        
        matias.caminar();
        matias.comer();
        matias.hablar();
        
        carlos.caminar();
        carlos.comer();
        carlos.hablar();
        
        teresa.comer();
        teresa.caminar();
        teresa.hablar();
               
        
    }
    
}
