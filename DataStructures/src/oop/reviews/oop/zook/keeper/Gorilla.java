package oop.reviews.oop.zook.keeper;

public class Gorilla extends Mammal {

    public Gorilla(){
        super(100);
    }

    public void throwSomething(){
        this.energyLevel -= 5;
        System.out.println( "Gorilla has thrown something," );
    }

    public void eatBananas(){
        this.energyLevel += 10;
        System.out.println( "Gorilla just ate a bananas!" );
    }

    public void climb(){
        this.energyLevel -= 10;
        System.out.println( "Gorilla has climbed a tree" );
    }
}
