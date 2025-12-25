import java.util.Scanner;
public class lab5point2 {

    public static void main (String[] args) {

        Scanner input = new Scanner(System.in) ;

        String name = input.nextLine();
        int age = input.nextInt();

        Cat Co = new Cat (name , age);

        Co.displayplayInfo();
        Co.makeSound();

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

    protected void makeSound() {
        System.out.print("Some...Sound");
    }

}

class Cat extends Animal {

    public Cat (String name , int age) {

        super(name, age);

    }

    @Override
    public void makeSound() {
        System.out.println("Meow! Meow!");
    }
}
