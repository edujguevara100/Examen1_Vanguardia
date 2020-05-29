/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Observer;

import java.util.ArrayList;

/**
 *
 * @author edujg
 */
public class NewsChannel implements Subject{
    private String name;
    private String link;
    private ArrayList<String> news = new ArrayList();
    private ArrayList<Observer> subscriberlist = new ArrayList();
    public NewsChannel(String name, String link){
        this.name = name;
        this.link = link;
    }

    @Override
    public void registerObserver(Observer o) {
        subscriberlist.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        subscriberlist.remove(o);
    }

    @Override
    public void notifyAllObservers() {
        for (int i = 0; i < subscriberlist.size(); i++) {
            subscriberlist.get(i).update(this);
        }
        
    }

    public String getName() {
        return name;
    }

    public String getLink() {
        return link;
    }
    public void addNews(String n){
        news.add(n);
        this.notifyAllObservers();
    }
    
    public ArrayList<String> getNews(){
        return this.news;
    }
    
    @Override
    public String toString(){
        return this.name;
    }
}
