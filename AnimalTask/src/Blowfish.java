public class Blowfish extends Fish{
    private String color;

    public Blowfish(){};

    public Blowfish(String color) {
        this.color = color;
    }

    public Blowfish(String name, int age, double weight, String featherColor, String color) {
        super(name, age, weight, featherColor);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "Blowfish{" +
                "color='" + color + '\'' +
                "} " + super.toString();
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    void areFish() {
        super.areFish();
        System.out.println("fish color " + this.getColor());
    }

    void wop(){
        System.out.println("I`m blowfish");
    }

    public void move(){
        System.out.println("Blowfish swim");
    }
}
