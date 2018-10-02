public class Mothra extends Kaiju implements IKaijuAttack {

    public Mothra(String name, int healthValue, int attackValue) {
        super(name, healthValue, attackValue);
    }

    @Override
    public String roar() {
        return "Mothra Mothra";
    }

    public String fly(){
        return "I fly to Tokyo";
    }

    public void attack(Vehicle vehicle){
        vehicle.healthValue -= this.attackValue;
    }
}
