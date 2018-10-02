public abstract class Kaiju {
    String name;
    int healthValue;
    int attackValue;

    public Kaiju(String name, int healthValue, int attackValue) {
        this.name = name;
        this.healthValue = healthValue;
        this.attackValue = attackValue;
    }

    public String getName() {
        return name;
    }

    public int getHealthValue() {
        return healthValue;
    }

    public int getAttackValue() {
        return attackValue;
    }

    public String roar(){
        return "Arrrgh, I am kaiju";
    }

    public void gotAttacked(Vehicle vehicle){
        this.healthValue -= vehicle.getAttackValue();
    }

    public void attack(Vehicle vehicle){
        vehicle.healthValue -= this.attackValue;
    }
}
