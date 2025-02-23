public class Hero {
    private int health;
    private int damage;
    private String superPower;

    public Hero(int damage, String superPower, int health) {
        this.damage = damage;
        this.superPower = superPower;
        this.health = health;
    }
    public Hero(int damage, int health) {
        this.damage = damage;
        this.health = health;
    }

    public int getHealth() {
        return health;
    }

    public int getDamage() {
        return damage;
    }

    public String getSuperPower() {
        return superPower;
    }
}
