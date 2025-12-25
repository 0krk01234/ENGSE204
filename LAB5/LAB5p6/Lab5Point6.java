import java.util.Scanner;
public class Lab5Point6 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        int duration = input.nextInt();
        input.nextLine();
        String title = input.nextLine();
        String quality = input.nextLine();

        Video V = new Video(title, duration);
        Audio A = new Audio(title, quality);
        
        Processor.runProcesssor(V);
        Processor.runProcesssor(A);

        input.close();
    }
    
}

class Media {
    protected String title ;
    public Media(String title) {
        this.title = title ;
    }

    public void process() {
        System.out.println("Stating generic media processing.");
    }
}

class Video extends Media {
    protected int duration ;

    public Video (String title , int duration) {
        super(title);
        this.duration = duration ;
    }

    @Override

    public void process() {

        System.out.println("Video: " + this.title + " " + "for" + " " + this.duration + " " + "miutes.");

    }
}

class Audio extends Media {

    protected String quality ;

    public Audio(String title , String quality) {
        super(title);
        this.quality = quality ;
    }

    @Override
    public void process() {

        System.out.println("Processing audio: " + this.title + " " + "with" + " " + this.quality +" " + "quality.");

    }
}

class Processor {

    public static void runProcesssor(Media m) {
        m.process();
    }
}
