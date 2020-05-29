/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Factory;

import Factory.Pc;
import Factory.Laptop;
import Factory.ComputerType;
import Factory.Computer;

/**
 *
 * @author edujg
 */
public class DellComputers {
    public Computer buildComputer(ComputerType model){
        if(model.equals(ComputerType.PC)){
            return new Pc();
         
        }else if (model.equals(ComputerType.LAPTOP)){
            return new Laptop();
        }
        return new Computer(model);
    }
}
