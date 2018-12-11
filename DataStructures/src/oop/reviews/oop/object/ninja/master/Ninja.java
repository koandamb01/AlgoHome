package oop.reviews.oop.object.ninja.master;

public class Ninja extends Human {

    public Ninja(){
        super(3, 10, 3, 100);
    }

    // Ninja: Add a method steal(Human) that takes the amount of stealth the ninja has,
    // removes it from the other human's health, and adds it to the ninja's
    public void steal(Human victim){
        this.setHealth( this.getHealth() + this.getStealth() );
        victim.setHealth( victim.getHealth() - this.getStealth() );
    }
}
