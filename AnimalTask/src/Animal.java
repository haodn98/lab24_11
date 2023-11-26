interface AnimalBehavior{
    void sleep();

}

interface AnimalMove{
    default void move(){
        System.out.println("Animal is moving");
    }
}

interface AnimalName{
    static void getName(String name){
        System.out.println(name);
    }
}
public abstract class Animal implements AnimalBehavior,AnimalMove,AnimalName {
    private String name;
    private int age;
    private double weight;

    public Animal(){}

    public Animal (String name){
        this.name = name;
    }
    public Animal(String name, int age, double weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    abstract void eat();
    abstract void getVoice();

    public void sleep(){
        System.out.println("I`m sleeping");
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                '}';
    }
}