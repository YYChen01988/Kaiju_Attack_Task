public class Godzilla extends Kaiju {
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
}
