/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package State;

/**
 *
 * @author edujg
 */
public class Legal implements TravelPersonState{

    @Override
    public void actividad(TravelPerson p) {
        p.AttendHospital();
        p.visitRestaurant();
        p.flyToOtherPlace();
        p.visitLandmarks();
        p.flyHome();
    }
    
}
