package produk;

public class product {
    String name;
    private double price;
    private double subtotal, discount_amount, tax_amount, grandTotal;
    public product(String name){
        this.name = name;
    }

    public void setPrice(double price){
        this.price = price;
    }
    public void setSubtotal(double subtotal){
        this.subtotal = subtotal;
    }
    public void settax_amount(double tax_amount){
        this.tax_amount = tax_amount;
    }
    public void setdiscount_amount(double discount_amount){
        this.discount_amount= discount_amount;
    }
    public void setgrandTotal(double grandTotal){
        this.grandTotal= grandTotal;
    }

    public double getPrice(){
        return this.price;
    }
    public double getDiscount_amount(){
        return this.discount_amount;
    }
        public double getgrandTotal(){
        return this.grandTotal;
    }
    public double gettax_amount(){
        return this.tax_amount;
        }
    
    public double getSubtotal(){
    return this.subtotal;
    }



    public void getProductListing(int qty, double tax, double discount){
        
        // contoh:
        //     qty = 4
        //     price = 100.000
        //     tax = 10
        //     discount = 25
        // maka:
        //     subtotal = 4 * 100.000 (400.000)
        //     discount_amount = 25/100 * 400.000 (100.000)
        //     tax_amount = 10/100 * (400.000 - 100.000) (30.000)

        //     grandTotal = subtotal - discount + tax

        

        setPrice(100000);
        setSubtotal(qty * price);
        setdiscount_amount((discount /100)*subtotal);
        settax_amount((tax /100)*subtotal);
        setgrandTotal(subtotal - discount_amount + tax_amount);

        System.out.println("Nama : Muhammad Nasofi");
        System.out.println("NIM  : 191011401265");
        System.out.println("Kelas: 05TPLE018
        System.out.println("UTS  : Pemrograman 2");
        System.out.println("==========ProductListing========");
        System.out.println(String.format("Harga dalam Rupiah: Rp%,.2f", price));
        System.out.println(String.format("Subtotal: Rp%,.2f", subtotal));
        System.out.println(String.format("potongan: Rp%,.2f", discount_amount));
        System.out.println(String.format("pajak: Rp%,.2f", tax_amount));
        System.out.println(String.format("grand total: Rp%,.2f", grandTotal));
        System.out.println("==================");
    }

    public void tampil(){
        System.out.println(price);
    }
