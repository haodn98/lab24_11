public class Fish extends Animal {
    private String featherColor;

    public Fish(){}

    public Fish(String featherColor) {
        this.featherColor = featherColor;
    }

    public Fish(String name, int age, double weight, String featherColor) {
        super(name, age, weight);
        this.featherColor = featherColor;
    }

    public String getFeatherColor() {
        return featherColor;
    }

    public void setFeatherColor(String featherColor) {
        this.featherColor = featherColor;
    }

    @Override
    void eat(){
        System.out.println("Fish eats");
    };


    @Override
    void getVoice(){
        System.out.println("Fish got no voice");
    }
    void areFish(){
        System.out.println("Fish feather color " + this.featherColor);
    }

    @Override
    public String toString() {
        return "Fish{" +
                "featherColor='" + featherColor + '\'' +
                "} " + super.toString();
    }
}
