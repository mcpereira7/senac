/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade03;

import java.util.Random;

/**
 *
 * @author Rerum
 */
public class Numero {

    int numero;
    int contador;

    void numerooculto() {
        Random rd = new Random();
        this.numero = rd.nextInt(11);
    }

}
