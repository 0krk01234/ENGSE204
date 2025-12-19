import java.util.Scanner;
public class lab4point1 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in) ;

        String title , actor ;


        System.out.println("Enter Mode: ");
        int order = input.nextInt();
        input.nextLine();

        if(order == 1) {
            title = input.nextLine();
            Book B1 = new Book(title) ;
            B1.displayInfo();
        }
        else if (order == 2) {
            title = input.nextLine();
            actor = input.nextLine();
            Book B1 = new Book(title , actor);
            B1.displayInfo();
        }
        else {
            throw new IllegalArgumentException("error pls Enter just 1 and 2");
        }
        input.close();
    }
    
}

 class Book {
    private String title ;
    private String author ;

    public Book(String title) {
        this.title = title ;
        this.author = "unknow" ;
    }

    public Book(String title , String author) {
        this.title = title ;
        this.author = author ;
    }

    public void displayInfo() {
        System.out.printf("Title : %s , Author : %s" , this.title , this.author);
    }
 }