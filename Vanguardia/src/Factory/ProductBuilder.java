/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Factory;

import Builder.House;

/**
 *
 * @author edujg
 */
public interface ProductBuilder {

    public abstract void addLocation(String location);

    public abstract void addStyle(String style);

    public abstract void addPool(String pool);

    public abstract void addGarden(String garden);

    public abstract void addPlayground(String playground);

    public abstract void addGarage(String garage);

    public abstract House getHouse();
}
