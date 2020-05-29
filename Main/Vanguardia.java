/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import State.Legal;
import State.Illegal;
import State.Travel;
import Adapter.TempAdapter;
import Builder.HouseBuilder;
import Builder.House;
import Builder.Albañil;
import Observer.Subscriber;
import Observer.NewsChannel;
import Factory.DellComputers;
import Factory.ProductBuilder;
import Factory.ComputerType;
import Factory.Computer;
import Singletone.HighCardDealer;

/**
 *
 * @author edujg
 */
public class Vanguardia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Singletone:");
        singletone();
        System.out.println("");
        System.out.println("Factory:");
        factory();
        System.out.println("");
        System.out.println("Observer:");
        observer();
        System.out.println("");
        System.out.println("Builder:");
        builder();
        System.out.println("");
        System.out.println("Adapter:");
        adapter();
        System.out.println("");
        System.out.println("State:");
        state();
    }

    public static void singletone() {
        //Involved Classes HighCardDealer
        //Juego de Carta Alta, el singletone es el dealer de las cartas
        HighCardDealer dealer = HighCardDealer.getInstance();
        String player1 = "Player1";
        String player2 = "Player2";
        String player3 = "Player3";
        dealer.addPlayer(player1);
        dealer.addPlayer(player2);
        dealer.addPlayer(player3);
        dealer.playHighCard();
    }

    public static void factory() {
        //Involved Classes DellComputers, Computer, Laptop, Pc, ComputerType
        //Fábrica de computadoras Dell, tienen dos líneas: Pc y Laptops
        DellComputers Dell = new DellComputers();
        Computer computer = Dell.buildComputer(ComputerType.PC);
        System.out.println("Computer is of type: " + computer.getModel());
        Computer computer2 = Dell.buildComputer(ComputerType.LAPTOP);
        System.out.println("Computer 2 is of type: " + computer2.getModel());
    }

    public static void observer() {
        //Involved Classes NewsChannel, Subscriber, Observer, Subject
        //Un canal de noticias con suscriptores les notifica cada que suben una nueva noticia
        NewsChannel h = new NewsChannel("MVC", "www.mvc.com");
        Subscriber s = new Subscriber("Subscriber1");
        Subscriber s1 = new Subscriber("Subscriber2");
        h.registerObserver(s);
        h.registerObserver(s1);
        h.addNews("Breaking news: No more staying home!");
    }

    public static void builder() {
        //Involved Classes ProductBuilder, HouseBuilder, Albañil, House
        //Un constructor de casas con patios modulares, opciones de: piscina, jardín, area de juegos, garaje.
        ProductBuilder Maistro_de_Obra = new HouseBuilder();
        Albañil albañil = new Albañil();
        albañil.makeHouse(Maistro_de_Obra);
        House casa = Maistro_de_Obra.getHouse();
        System.out.println(casa.toString());
    }
    
    public static void adapter(){
        //Involved Classes TempAdapter, Adapter, FahrenheitOven
        //Un adaptador cuya funcion es atender a un cliente que desea hornear algo en un Horno que trabaja
        //en Fahrenheit, pero el cliente solo tiene la temperatura en celsius
        TempAdapter adaptador = new TempAdapter();
        System.out.println(adaptador.Cook(200));
    }
    
    public static void state(){
        //Involved Classes TravelPersonState, TravelPerson, Travel, Legal, Illegal
        //Simulación de Viaje con un persona con status migratorio en orden(legal) o ilegal
        Travel trip = new Travel();
        trip.setState(new Legal());
        trip.Activities();
        System.out.println("Second State:");
        trip.setState(new Illegal());
        trip.Activities();
    }
}
