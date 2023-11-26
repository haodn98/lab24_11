import java.util.Scanner;

interface Salary {
    void salaryToPay(int hours, int rate);

    default void salaryForOvertime(int hours, int rate) {
        System.out.println("Salary to pay(dollars) of overtime = " + hours * rate);
    }

    static void isReceiveBonus(int yearsOfExperience) {
        if (yearsOfExperience >= 5) {
            System.out.println("Employee receive bonus");
        } else if (yearsOfExperience >= 0 && yearsOfExperience < 5) {
            System.out.println("Employee does`t have enough experience ");
        } else {
            System.out.println("Wrong number");
        }
    }
}

class Person {
    String surname;
    String firstName;
    String zipCode;
    String city;

    public void initialise() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your surname");
        this.surname = sc.nextLine();
        System.out.println("Enter first name");
        this.firstName = sc.nextLine();
        System.out.println("Enter your city");
        this.city = sc.nextLine();
        System.out.println("Enter your zip-code");
        this.zipCode = sc.nextLine();
    }


    public void print() {
        System.out.print("surname='" + surname + '\'' +
                ", firstName='" + firstName + '\'' +
                ", zipCode='" + zipCode + '\'' +
                ", city='" + city + '\'');
    }
}

class Staff extends Person implements Salary {
    String education;
    String position;

    public void initialize1() {
        Scanner sc = new Scanner(System.in);
        this.initialise();
        System.out.println("Enter your education");
        this.education = sc.nextLine();
        System.out.println("Enter your position");
        this.position = sc.nextLine();
    }

    public void print1() {
        this.print();
        System.out.print(' ' + "education='" + education + '\'' +
                ", position='" + position + '\n');
    }

    public void salaryToPay(int hours, int rate) {
        System.out.println("Salary to pay(dollars) = " + (hours * rate));
    }

}

public class People {
    public static void main(String[] args) {
        Staff man = new Staff();
        man.initialize1();
        man.print1();
        man.salaryToPay(40,15);
        man.salaryForOvertime(2,20);
        Salary.isReceiveBonus(4);
    }
}
