public class Main {
    public static void main(String[] args) {
        Boss boss = new Boss();
        boss.setHealth(700);
        boss.setDamage(40);
        boss.setDefenseType("");
        System.out.println("Boss health: " + boss.getHealth() + " Damage: "
                + boss.getDamage() + " Defense type: " + boss.getDefenseType());
        System.out.println("----------------------------------------");
        Hero[] heroes=createHeroes();

        for(Hero hero: heroes){
            System.out.println("Hero - Health: " + hero.getHealth() +
                    ", Damage: " + hero.getDamage() +
                    ", Super power: " + hero.getSuperPower());
        }

    }
    public static Hero[] createHeroes(){
        Hero hero1 = new Hero(40,"Fire",60);
        Hero hero2 = new Hero(30, 70);
        Hero hero3 = new Hero(60, "Magic", 40);
        Hero[] heroes = {hero1, hero2, hero3};
        return heroes;
    }
}
