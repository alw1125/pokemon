public class PokemonGenerator {

    private Pokemon[] pokemons;

    public static void main(String[] args) {
        PokemonGenerator pokemonGenerator = new PokemonGenerator();
        pokemonGenerator.start();
    }

    // TODO Step i. Create the generateRandomLevel() method.
    private int generateRandomLevel(){
        return (int) (Math.random() * 5 + 1);
    }

    // TODO Step iii a. Create the printPokemonGreetings() method.
    private void printPokemonGreeting(){
        System.out.println("I am " + );
    }

    // TODO Step iv a. Create the printWaterPokemon() method.

    public void start(){

        // TODO Step ii. Create 4 different types of Pokemon and add them to the pokemons array. Each one should have a random level.


        System.out.println("Greetings from Pokemon");
        System.out.println("====================");

        // TODO Step iii b. Appropriately call the printPokemonGreetings() method.

        System.out.println("====================");
        System.out.println();

        System.out.println("Water Pokemon show-off time");
        System.out.println("-------------------------------");

        // TODO Step iv b. Appropriately call the printWaterPokemon() method.

        System.out.println("-------------------------------");
        System.out.println();

        System.out.println("Random attack time!");
        System.out.println("-------------------");

        // TODO Step v. Randomly generate an display three attacks.




        System.out.println("-------------------");
        System.out.println();

        System.out.println("Pokemons' status after the attacks");
        System.out.println("==================================");
        // TODO Step iii b. Appropriately call the printPokemonGreetings() method.
        System.out.println("==================================");

    }

}
