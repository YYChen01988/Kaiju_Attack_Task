public class Vehicle {

    String type;
    int healthValue;
    int attackValue;

    public Vehicle(String type, int healthValue, int attackValue) {
        this.type = type;
        this.healthValue = healthValue;
        this.attackValue = attackValue;
    }

    public String getType() {
        return type;
    }

    public int getHealthValue() {
        return healthValue;
    }

    public int getAttackValue() {
        return attackValue;
    }

    public void demageHealth(Kaiju kaiju){
        healthValue -= kaiju.getAttackValue();
    }

    public void attack(Kaiju kaiju){
        kaiju.healthValue -= attackValue;
    }
}
