public class Godzilla extends Kaiju implements IKaijuAttack{
    public Godzilla(String name, int healthValue, int attackValue) {
        super(name, healthValue, attackValue);
    }

    @Override
    public String roar() {
        return "Godzilla Godzilla";
    }

    public String move(){
        return "I walk to Tokyo";
    }

    public void attack(Vehicle vehicle){
       vehicle.healthValue -= this.attackValue*2;
    }
}
