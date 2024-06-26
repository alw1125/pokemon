public class Squirtle extends Pokemon implements INoise{
    public Squirtle(String name, int level) {
        super(name, level);
        type = new WaterType();
    }

    @Override
    public void attack(Pokemon other) {
        loseLifePoints(2 * level);
        lifePoint += 2;
        levelUp();
    }

    @Override
    public void levelUp() {
        if(lifePoint > 6 * level){
            level++;
            System.out.println("Squirtle levelled up!");
        } else {
            System.out.println("Not enough experience for Squirtle!");
        }
    }

    @Override
    public String makeNoise() {
        return "Squirtle squirt";
    }
}
