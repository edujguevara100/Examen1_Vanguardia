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
public class Travel {

    private TravelPersonState state = null;
    private TravelPerson p = new TravelPerson();

    public void setState(TravelPersonState state) {
        this.state = state;
    }

    public void Activities() {
        state.actividad(p);
    }
}
