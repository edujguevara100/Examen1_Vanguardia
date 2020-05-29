/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Adapter;

import Adapter.FahrenheitOven;
import Adapter.Adapter;

/**
 *
 * @author edujg
 */
public class TempAdapter implements Adapter{
    
    @Override
    public String Cook(double tempC) {
         double tempF = convert(tempC);
         FahrenheitOven ov = new FahrenheitOven();
         return ov.bake(tempF);
    }
    private double convert(double tempC){
        return (tempC * 9/5) + 32;
    } 
    
    
}
