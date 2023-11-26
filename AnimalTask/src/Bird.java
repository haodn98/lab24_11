public class Bird extends Animal{
    private String colorWings;

    public Bird(){}

    public Bird(String colorWings){
        this.colorWings = colorWings;
    }

    public Bird(String name, int age, double weight, String colorWings) {
        super(name, age, weight);
        this.colorWings = colorWings;
    }

    public String getColorWings() {
        return colorWings;
    }

    public void setColorWings(String colorWings) {
        this.colorWings = colorWings;
    }

    @Override
    void eat(){
        System.out.println("Bird eats");
    }
    @Override
    void getVoice(){
        System.out.println("Birds can sing");
    }
    void areBird(){
        System.out.println("wings color" + this.colorWings);
    }

    @Override
    public String toString() {
        return "Bird{" +
                "colorWings='" + colorWings + '\'' +
                "} " + super.toString();
    }
}
