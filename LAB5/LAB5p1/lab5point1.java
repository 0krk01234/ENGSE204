import java.util.Scanner;
public class lab5point1 {

    public static void main (String[] args) {

        Scanner input = new Scanner(System.in) ;

        String name = input.nextLine();
        int age = input.nextInt();

        Dog Do = new Dog (name , age);

        Do.makeSound();
        Do.displayplayInfo();

    }
    
}

class Animal {
    protected String name ;
    protected int age ;

    public Animal(String name , int age) {
        this.name = name ;
        this.age = age ;
    }

    public void displayplayInfo(){
        System.out.println("Name: " + this.name + "," + " " + "Age: " + age);
    }
}

    class Dog extends Animal {

    public Dog (String name , int age){
    super(name , age);
    }

    public void makeSound() {
        System.out.println("Woof! Woof!");
    }
}
