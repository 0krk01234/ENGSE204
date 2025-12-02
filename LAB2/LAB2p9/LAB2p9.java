import java.util.Scanner;
public class LAB2p9 {

    public static void main(String[] citytowneiei) {
        Scanner input = new Scanner(System.in);

        String name = input.nextLine();
        
        String road = input.nextLine();

        String city = input.nextLine();

        String num = input.nextLine();

        Adress A1 = new Adress(road ,  city , num);
        Student S1 = new Student(name , A1);

        S1.displayProfile();

        input.close();
    }
}
