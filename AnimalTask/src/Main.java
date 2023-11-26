public class Main {
    public static void main(String[] args) {
        Animal[] animals = new Animal[6];
        animals[0] = new Bird("Mike", 2, 2.3, "Yellow");
        animals[1] = new Fish("Dan", 1, 2, "red");

        animals[2] = new Mammal("Sam", 10, 5, "black");
        animals[3] = new Pigeon("Samanta",2,2,"White","Emperor");
        animals[4] = new Dog("Layla",4,10,"Brown","Bulldog");
        animals[5] = new Blowfish("Dori",1,0.5,"Red","Yellow");
        Blowfish bob = new Blowfish("Nik", 1, 2, "red", "blue");
        animals[1].setName("Mike");
        bob.wop();
        bob.areFish();
        animals[0].sleep();
        animals[1].sleep();
        animals[3].sleep();
        if (animals[2] instanceof Dog) {
            ((Dog) animals[2]).myBread();
        }
        if (animals[3] instanceof Mammal) {
            ((Mammal) animals[3]).areMammal();
        }
        for (Animal animal : animals) {
            animal.move();
        }
        for (Animal animal : animals) {
            AnimalName.getName(animal.getName());
        }
        System.out.println(animals[3].toString());
        System.out.println(animals[2].toString());
        System.out.println(animals[1].toString());
    }
}

