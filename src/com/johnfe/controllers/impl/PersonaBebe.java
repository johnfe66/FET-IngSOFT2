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
public class PersonaBebe implements IPersonaDAO{

    @Override
    public void caminar() {
        System.out.println("este bebe no camina");
    }

    @Override
    public void comer() {
        System.out.println("el bebe come con ayuda");
    }

    @Override
    public void hablar() {
        System.out.println("el bebe balbucea");
    }
    
}
