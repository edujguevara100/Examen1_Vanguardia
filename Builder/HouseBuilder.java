/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Builder;

import Builder.House;
import Factory.ProductBuilder;

/**
 *
 * @author edujg
 */
public class HouseBuilder implements ProductBuilder{
    private House _Producto = new House();


    @Override
    public void addLocation(String location) {
        this._Producto.houseLocation = location;
    }

    @Override
    public void addStyle(String style) {
        this._Producto.houseStyle = style;
    }

    @Override
    public void addPool(String pool) {
        this._Producto.pool = pool;
    }

    @Override
    public void addGarden(String garden) {
        this._Producto.garden = garden;
    }

    @Override
    public void addPlayground(String playground) {
        this._Producto.playground = playground;
    }

    @Override
    public void addGarage(String garage) {
        this._Producto.garage = garage;
    }

    @Override
    public House getHouse() {
        return this._Producto;
    }
}
