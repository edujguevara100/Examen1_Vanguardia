/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Builder;

import Factory.ProductBuilder;

/**
 *
 * @author edujg
 */
public class Albañil {

    public void makeHouse(ProductBuilder albañil) {
        albañil.addLocation("Lomas");
        albañil.addStyle("Rustica-Moderna");
        albañil.addGarage("10 Carros");
        albañil.addPool("Piscina Olímpica y Jacuzzi");
        albañil.addGarden("Jardín de 1 Manzana");
    }
}
