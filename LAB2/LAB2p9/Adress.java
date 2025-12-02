class Adress {
    String street ;
    String city ;
    String zipCode;

    Adress(String Strees , String City , String code){

        this.street = Strees ;
        this.city = City ;
        this.zipCode = code;
    }

    public String getFullAdress() {

            return this.street + ", " + this.city + ", " + this.zipCode;
    }
}