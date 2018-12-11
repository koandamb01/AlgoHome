package oop.reviews.oop.Pokemon;

public class Pokemon {
    private String name;
    private int health;
    private String type;
    private static int numberOfPokemons = 0;

    public Pokemon(String nameParam, int healthParam, String typeParam) {
        this.name = nameParam;
        this.health = healthParam;
        this.type = typeParam;
        Pokemon.numberOfPokemons += 1;
    }

    public void attackPokemon(Pokemon pokemon){
        int health = pokemon.getHealth();
        pokemon.setHealth( health - 10 );
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
