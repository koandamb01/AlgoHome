package oop.reviews.oop.Pokemon;

public interface PokemonInterface {

    // This method creates and returns Pokemon
    Pokemon createPokemon(String name, int health, String type);

    // This method returns a String with the name, health, and type of the pokemon.
    String pokemonInfo(Pokemon pokemon);

    // List all the pokemon names that you have in your pokedex.
    void listPokemon();
}
