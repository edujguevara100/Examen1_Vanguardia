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
public class TravelPerson {
    public void AttendHospital() {
		System.out.println("Accident Occured, went to Hospital");
	}

	public void visitLandmarks() {
		System.out.println("Visited the Ruins");
	}

	public void visitRestaurant() {
		System.out.println("Ate pizza at Famous Italian Restaurant");
	}

	public void flyToOtherPlace() {
		System.out.println("Traveled to Germany");
	}

	public void flyHome() {
		System.out.println("Got on an Airplane back to Honduras");
	}
        public void returnHome(){
            System.out.println("Was deported");
        }
}
