public class Pigeon extends Bird {
    private String pigeonType;

    public Pigeon(){};

    public Pigeon(String pigeonType){
        this.pigeonType=pigeonType;
    };

    public Pigeon(String name, int age, double weight, String colorWings, String pigeonType) {
        super(name, age, weight, colorWings);
        this.pigeonType = pigeonType;
    }

    public String getPigeonType() {
        return pigeonType;
    }

    public void setPigeonType(String pigeonType) {
        this.pigeonType = pigeonType;
    }
    @Override
    void areBird() {
        super.areBird();
        System.out.println("Pigeon type is" + this.getPigeonType());
    }

    @Override
    public String toString() {
        return "Pigeon{" +
                "type='" + pigeonType + '\'' +
                "} " + super.toString();
    }

    void arePigeon(){
        System.out.println("i`m pigeon");
    }

    public void move(){
        System.out.println("Pigeon fly");
    }
}
