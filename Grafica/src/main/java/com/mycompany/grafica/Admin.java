/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.grafica;

/**
 *
 * @author User
 */
public class Admin implements Imprimable {

    private String usuario, pass;

    public Admin(String usuario, String pass) {
        this.pass = pass;
        this.usuario = usuario;

    }

    public String getPass() {
        return pass;
    }

    public String setPass() {
        return pass;

    }

    public String getUsuario() {
        return usuario;
    }

    public String setUsuario() {
        return usuario;

    }

    @Override
    public String imprimir() {
        return this.pass + "- " + this.usuario;

    }
}
