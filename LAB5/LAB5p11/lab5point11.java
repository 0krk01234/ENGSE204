import java.util.Scanner;
public class lab5point11 {

    public static void main(String[] args) {

    Scanner input = new Scanner(System.in) ;

    String title ;
    int wordCount , pageCount ;

    title = input.nextLine();
    wordCount = input.nextInt();
    input.nextLine();
    TextDocument T1 = new TextDocument(title , wordCount);

   
    title = input.nextLine();
    wordCount = input.nextInt();
    input.nextLine();
    TextDocument T2 = new TextDocument(title , wordCount);
    
    
    //clear buff
    title = input.nextLine();
    pageCount = input.nextInt();
    input.nextLine();
    PDFDocument PDF1 = new PDFDocument(title, pageCount);

    title = input.nextLine();
    pageCount = input.nextInt();
    PDFDocument PDF2 = new PDFDocument(title, pageCount);

    Document[] Doc = {T1 , T2 , PDF1 ,PDF2} ;

    int totalCount = 0;

    for (int i = 0 ; i < Doc.length ; i ++) {

        if(Doc[i] instanceof PDFDocument ) {
            PDFDocument PD1 = (PDFDocument) Doc[i] ;
            totalCount += PD1.pageCount; 
            PD1.displayDetails();
        }
    }

    System.out.println("Total Pages: " + totalCount);



    }
    
}

class Document {

    protected String title ;

    public Document (String title) {
        this.title = title ;
    }

    public void displayDetails() {
        System.out.println("Document: " + this.title);
    }
}

class TextDocument extends Document {
    protected int wordCount ;
    
    public TextDocument(String title , int wordCount) {

        super(title);
        this.wordCount = wordCount ;

    }

    @Override
    public void displayDetails() {

    System.out.println("Text: " + this.title + "," + " " + "Word: " + this.wordCount);
    
    }
}

class PDFDocument extends Document {

    protected int pageCount;

    public PDFDocument(String title , int pageCount) {

        super(title);
        this.pageCount = pageCount ;
    }

    @Override
    public void displayDetails() {

        System.out.println("PDF: " + this.title +"," + " " + "Pages: " + this.pageCount);
        
    }
}
