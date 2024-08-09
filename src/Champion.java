public class Champion {
    private String name;
    private int life;
    private int attack;
    private int armor;

    public Champion(String name, int life, int attack, int armor) {
        this.name = name;
        this.life = life;
        this.attack = attack;
        this.armor = armor;
    }

    public String getName() {
        return name;
    }

    public int getLife() {
        return life;
    }

    public int getAttack() {
        return attack;
    }

    public int getArmor() {
        return armor;
    }

    public void setLife(int life) {
        this.life = life;
    }

    public void takeDamage(int damage) {
        int damageTaken = damage - this.armor;
        if (damageTaken < 1) {
            damageTaken = 1;
        }
        this.life -= damageTaken;
        if (this.life < 0) {
            this.life = 0;
        }
    }

    public String status() {
        if (this.life == 0) {
            return this.name + ": " + this.life + " de vida (morreu)";
        } else {
            return this.name + ": " + this.life + " de vida";
        }
    }

}
