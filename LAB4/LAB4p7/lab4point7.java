import java.util.Scanner;
public class lab4point7{

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        String id1 , id2 ,id3 ;

        System.out.println("Enter ID1: ");
        id1 = input.nextLine();

        System.out.println("Enter ID2: ");
        id2 = input.nextLine();

        System.out.println("Enter ID3: ");
        id3 = input.nextLine();

        Resource R1 = new Resource(id1) ;
        Resource R2 = new Resource(id2) ;
        Resource R3 = new Resource(id3) ;

        R1 = null ;
        R2 = null ;
        
        System.gc();

        R3 = null ;

        System.gc();


    }
}

class Resource {

    private String id ;

    public Resource(String id) {

        this.id = id ;
        System.out.println("esource " + this.id + " " +"created.");


    }

    public void finalize() throws Throwable {

        System.out.println("Resource " + this.id + " finalized (destroyed)" );
        
 

    }
}