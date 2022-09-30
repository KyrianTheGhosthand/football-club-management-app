package footballclub;

public class Skill {
    private int strength;
    private int speed;
    private int attack;
    private int reach;
    private int defense;
    private int stamina;
    private String strongfoot;

    public Skill(){}

    public Skill(int strength, int speed, int attack, int reach, int defense, int stamina, String strongfoot) {
        this.strength = strength;
        this.speed = speed;
        this.attack = attack;
        this.reach = reach;
        this.defense = defense;
        this.stamina = stamina;
        this.strongfoot = strongfoot;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getReach() {
        return reach;
    }

    public void setReach(int reach) {
        this.reach = reach;
    }

    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    public int getStamina() {
        return stamina;
    }

    public void setStamina(int stamina) {
        this.stamina = stamina;
    }

    public String getStrongfoot() {
        return strongfoot;
    }

    public void setStrongfoot(String strongfoot) {
        this.strongfoot = strongfoot;
    }

    @Override
    public String toString() {
        return "Skill{" +
                "strength=" + strength +
                ", speed=" + speed +
                ", attack=" + attack +
                ", reach=" + reach +
                ", defense=" + defense +
                ", stamina=" + stamina +
                ", strongfoot='" + strongfoot + '\'' +
                '}';
    }
}
