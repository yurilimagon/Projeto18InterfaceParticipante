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
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Participante participante = new Participante("Yuri");
        
        System.out.println("Participante: \nNome: " + participante.getNome());
        participante.lendo();
        participante.programando();
    }
    
}
