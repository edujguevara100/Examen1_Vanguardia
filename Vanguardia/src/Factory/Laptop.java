/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Factory;

import Factory.ComputerType;
import Factory.Computer;

/**
 *
 * @author edujg
 */
public class Laptop extends Computer{
    public Laptop(){
        super(ComputerType.LAPTOP);
    }
}
