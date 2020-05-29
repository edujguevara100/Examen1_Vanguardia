/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Builder;

/**
 *
 * @author edujg
 */
public class House {

    public String houseStyle;
    public String houseLocation;
    public String pool;
    public String garden;
    public String playground;
    public String garage;

    @Override
    public String toString() {
        return "Descripción de la Casa: \nHouse Style = " + houseStyle 
                + "\nHouse Location = " + houseLocation 
                + "\nPool = " + pool 
                + "\nGarden = " + garden 
                + "\nPlayground = " + playground 
                + "\nGarage = " + garage;
    }
}
