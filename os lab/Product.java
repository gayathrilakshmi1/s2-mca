class product {

    int pcode;
    String pname;
    double price;

    public static void main(String[] args) {

        product p1 = new product();
        p1.pcode = 101;
        p1.pname = "Pen";
        p1.price = 10.50;

        product p2 = new product();
        p2.pcode = 102;
        p2.pname = "Pencil";
        p2.price = 5.00;

        product p3 = new product();
        p3.pcode = 103;
        p3.pname = "Notebook";
        p3.price = 40.00;

        product lowest = p1;

        if (p2.price < lowest.price) {
            lowest = p2;
        }
        if (p3.price < lowest.price) {
            lowest = p3;
        }

        // Display result
        System.out.println("Lowest Priced product:");
        System.out.println("product Code: " + lowest.pcode);
        System.out.println("product Name: " + lowest.pname);
        System.out.println("product Price: " + lowest.price);
    }
}
