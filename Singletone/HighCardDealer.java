/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Singletone;

import java.util.ArrayList;

/**
 *
 * @author edujg
 */
public class HighCardDealer {

    private static volatile HighCardDealer instance = new HighCardDealer();
    private ArrayList<String> players = new ArrayList<String>();
    private int turn = 0;

    private HighCardDealer() {

    }

    private void turn_handler() {
        if (this.turn < players.size() - 1) {
            this.turn += 1;
        } else {
            this.turn = 0;
        }
    }

    public void addPlayer(String player) {
        players.add(player);
    }

    public void removePlayer(String player) {
        players.remove(player);
    }

    public void playHighCard() {
        if (players.size() >= 2) {
            String winning = "";
            int score = 0;
            boolean flag = true;
            while (flag) {
                int rand = (int) Math.floor((Math.random() * 13 + 1));
                if (rand <= 10 && rand > 1) {
                    System.out.println(players.get(turn) + " saco: " + rand);
                }else if(rand == 1){
                    System.out.println(players.get(turn) + " saco: " + "A");
                }else if(rand == 11){
                    System.out.println(players.get(turn) + " saco: " + "J");
                }else if(rand == 12){
                    System.out.println(players.get(turn) + " saco: " + "Q");
                }else{
                    System.out.println(players.get(turn) + " saco: " + "K");
                }
                if(rand > score){
                    score = rand;
                    winning = players.get(turn);
                }else if(rand == score){
                    winning += ", " + players.get(turn);
                }
                this.turn_handler();
                if(this.turn == 0){
                    flag = false;
                    System.out.println("Ganador(es): " + winning + " con un puntaje de: "+ score);
                    players.clear();
                }
            }
        } else {
            System.out.println("Se necesitan mas jugadores");
        }
    }

    public static HighCardDealer getInstance() {
        return instance;
    }
}
