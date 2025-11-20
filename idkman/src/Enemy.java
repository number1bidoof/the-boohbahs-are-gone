public abstract class Enemy{
    protected int damage;
    protected int health;
    protected String name;

    public Enemy(int damage, int health, String name){
        this.damage = damage;
        this.health = health;
        this.name = name;
    }

    public abstract void update();
    public abstract void attack();

    public void takeDamage(int amount){
        health -= amount;
        System.out.println(name + " gets hit for " + amount + " points! Its health is now: " + health);
    }

    public String getString(String rando){
        return rando;
    }
}