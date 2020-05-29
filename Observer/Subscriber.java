/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Observer;

import Observer.Subject;
import Observer.Observer;
import Observer.NewsChannel;

/**
 *
 * @author edujg
 */
public class Subscriber implements Observer{
    private String name;
    public Subscriber(String name){
        this.name = name;
    }
    @Override
    public void update(Subject s) {
        System.out.println(this.name+", " + ((NewsChannel)s).getName()+ " just uploaded a new article: "+ ((NewsChannel)s).getNews().get(((NewsChannel)s).getNews().size()-1)+", check it out: "+((NewsChannel)s).getLink());
    }
    
}
