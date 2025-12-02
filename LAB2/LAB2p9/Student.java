class Student {
    String name ;
    Adress address ;

    Student(String namee , Adress address) {

        this.name = namee ;
        this.address = address;

    }

    public void displayProfile(){
        System.out.printf("name: %s " , this.name);
        System.out.println(address.getFullAdress());
    }
}