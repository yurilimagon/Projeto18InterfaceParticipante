/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author yuril
 */
public class Participante implements ILeitor, IProgramador {
    //ATRIBUTO
    private String nome;
    
    //CONSTRUTORES
    //VAZIO
    public Participante() {
    }
    //CHEIO
    public Participante(String nome) {
        this.nome = nome;
    }
    
    //GETTER E SETTER
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    //MÉTODOS
    @Override
    public void lendo() {
        System.out.println("Lendo...");
    }

    @Override
    public void programando() {
        System.out.println("Programando...");
    }
    
}
