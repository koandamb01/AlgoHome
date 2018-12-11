package oop.reviews.oop.Pokemon;

import java.util.ArrayList;

public class Pokedex extends AbstractPokemon {
    private ArrayList<Pokemon> pokemons = new ArrayList<Pokemon>();


    public void listPokemon(){
        for(Pokemon p : this.pokemons){
            System.out.println( "Name: " + p.getName());
        }
    }
}
