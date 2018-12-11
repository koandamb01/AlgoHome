package oop.reviews.oop.Pokemon;

public abstract class AbstractPokemon implements PokemonInterface {

    public Pokemon createPokemon(String nameParam, int healthParam, String typeParam){
        return new Pokemon( nameParam, healthParam, typeParam );
    }

    public String pokemonInfo(Pokemon pokemon){
        String response = "Pokemon's name: " + pokemon.getName() + " Health: " + pokemon.getHealth() + " Type: " + pokemon.getType();
        return response;
    }
}
