public class Mammal extends Animal{
    private String hairColor;
    public Mammal(){};

    public Mammal(String hairColor) {
        this.hairColor = hairColor;
    }

    public Mammal(String name, int age, double weight, String hairColor) {
        super(name, age, weight);
        this.hairColor = hairColor;
    }

    public String getHairColor() {
        return hairColor;
    }

    public void setHairColor(String hairColor) {
        this.hairColor = hairColor;
    }

    @Override
    void eat(){
        System.out.println("Mammal can eats");
    }

    @Override
    void getVoice() {
        System.out.println("Mammal got noisy voice");
    }


    void areMammal(){
        System.out.println("Hair color " + this.hairColor);
    }
}
