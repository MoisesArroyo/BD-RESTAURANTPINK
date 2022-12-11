/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.emp.mx.entity;

/**
 *
 * @author Moise
 */
public class Ingredientes {
    private int ID_INGREDIENTES;
    private String NAME_INGREDIENTE;

    @Override
    public String toString() {
        return "Ingredientes{" + "ID_INGREDIENTES=" + ID_INGREDIENTES + ", NAME_INGREDIENTE=" + NAME_INGREDIENTE + '}';
    }

    public void setID_INGREDIENTES(int ID_INGREDIENTES) {
        this.ID_INGREDIENTES = ID_INGREDIENTES;
    }

    public void setNAME_INGREDIENTE(String NAME_INGREDIENTE) {
        this.NAME_INGREDIENTE = NAME_INGREDIENTE;
    }

    public int getID_INGREDIENTES() {
        return ID_INGREDIENTES;
    }

    public String getNAME_INGREDIENTE() {
        return NAME_INGREDIENTE;
    }

    public Ingredientes(int ID_INGREDIENTES, String NAME_INGREDIENTE) {
        this.ID_INGREDIENTES = ID_INGREDIENTES;
        this.NAME_INGREDIENTE = NAME_INGREDIENTE;
    }

    public Ingredientes() {
    }
}
