package gyula.week08.zoo;

public class Animal {
    private String name;
    private String species;
    private int maxHealth;
    private int health;
    private int damage;
    private int attackChance;

    public Animal(Zoo zoo, String enclosureName, String name, String species, int health, int damage){
        this(zoo, enclosureName, name, species, health, damage, 30);
    }

    public Animal(Zoo zoo, String enclosureName, String name, String species, int health, int damage, int attackChance){
        this.name = name;
        this.species = species;
        this.health = health;
        this.maxHealth = health;
        this.damage = damage;
        this.attackChance = attackChance;
        Enclosure enc = zoo.searchEnclosureByName(enclosureName);
        enc.addAnimal(this);
    }

    public Animal(Enclosure enc, String name, String species){
        this.name = name;
        this.species = species;
        enc.addAnimal(this);
    }

    public void printStucture() {
        System.out.println("│       ├── " + name + ", " + species);
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getDamage() {
        return damage;
    }

    public String getName() {
        return name;
    }

    public int getMaxHealth() {
        return maxHealth;
    }

    public int getAttackChance() {
        return attackChance;
    }
}
