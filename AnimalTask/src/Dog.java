public class Dog extends Mammal{
    private String breed;

    public Dog(){};

    public Dog(String breed){
        this.breed = breed;
    };

    public Dog(String name, int age, double weight, String hairColor, String breed) {
        super(name, age, weight, hairColor);
        this.breed = breed;
    }
    @Override
    void getVoice() {
        super.getVoice();
        System.out.println("Its dog");
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    @Override
    void areMammal() {
        super.areMammal();
        System.out.println("i`m dog");
    }

    void myBread(){
        System.out.println("my breed is " + this.getBreed());
    }

    public void move(){
        System.out.println("Dog run");
    }
}
