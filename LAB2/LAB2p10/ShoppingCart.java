
class ShoppingCart {
    product[] product = new product[10];
    int itemCount = 0 ;

    public void addProduct(product p) {
        if (itemCount < product.length){
            product[itemCount] = p;
            itemCount ++;
        }
    }

    double calculateTotalPrice() {

        double raka = 0 ;
        for(int i = 0 ; i < itemCount ; i++){
            raka += product[i].price() ;
        }
        return raka ;
    }
}