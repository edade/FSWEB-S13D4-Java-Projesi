package model;

public class Player {
    private String name;
    private int healthPercentage;
    private Weapon weapon;

    public Player(String name, int healthPercentage, Weapon weapon) {
        this.name = name;
        this.healthPercentage = healthPercentage;
        checkHealth(healthPercentage);
        this.weapon = weapon;
    }

    private void checkHealth(int healthPercentage) {
        if (healthPercentage < 0) {
            this.healthPercentage = 0;
        }
        if (healthPercentage > 100) {
            this.healthPercentage = 100;
        }
    }


        public int healthRemaining(){
            return this.healthPercentage;
        }

    public void loseHealth(int damage){
        int healthRemain = healthPercentage - damage;
        if(healthRemain<=0){
            System.out.println(name + " player has been knocked out of game");
        }
        healthPercentage = healthRemain;
        checkHealth(healthPercentage);
    }

    public void restoreHealth(int healthPotion){
        this.healthPercentage += healthPotion;
        checkHealth(this.healthPercentage);
    }
}

