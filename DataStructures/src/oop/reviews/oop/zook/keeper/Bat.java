package oop.reviews.oop.zook.keeper;

public class Bat extends Mammal{
    public Bat(){
        super(300);
    }

    // For the fly() method, print the sound a bat taking off and decrease its energy by 50.
    public void fly(){
        this.energyLevel -= 50;
        System.out.println( "Bat is taking off" );
    }

    // For the eatHumans() method, print the so- well, never mind, just increase its energy by 25.
    public void eatHumans(){
        this.energyLevel += 25;
        System.out.println( "So well, never mind" );
    }

    // For the attackTown() method, print the sound of a town on fire and decrease its energy by 100.
    public void attactTown(){
        this.energyLevel -= 100;
        System.out.println( "Fireeeeeee" );
    }
}
