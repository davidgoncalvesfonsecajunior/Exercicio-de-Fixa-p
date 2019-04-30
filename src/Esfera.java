/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author david
 */
public class Esfera {

    double raio;

    double volume(double r) {
        double volume = 0;
        volume = (4 * 3.14 * (r * r * r)) / 3;
        return volume;

    }
}
