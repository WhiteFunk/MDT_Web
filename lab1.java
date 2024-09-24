class Lab1 {     
    public static void main(String[] args) { 

        stock d1 = new stock(); 
        stock d2 = new stock("Kravira", false, 2000);  
        StockWriterInfo w = new StockWriterInfo();

        d1.setName("Nordin");
        d1.setLicense(true);
        d1.setProfit(1000);  
        String s = d1.getName();
        System.out.println("Информация о sklade " + s);
        d1.Print();
             
        w.printStockInfo(d2);
    }
}

class StockWriterInfo {

public void printStockInfo(stock s){
    System.out.println("Информация о sklade " + s.getName());
    s.Print();
}

}

class stock {
    private String name;  
    private boolean availability;   
    private int price; 

    public void setName(String name){
        this.name = name;
    }

    public void setLicense(boolean license) {
        this.availability = license;
    }

    public void setProfit(int profit) {
        this.price = profit;
    }

    public stock() {    
    }                        
      
    public stock(String name, boolean license, int profit) {  
        this.name = name;
        this.availability = license;
        this.price = profit;
    } 

    public stock(String name, int profit) {   
        this.name = name;
        this.availability = false;
        this.price = profit; 
    } 

    public String getName() { 
        return name;          
    }

    public boolean getAvailability() {
        return availability;
    }

    public int getPrice() {
        return price;
    }
      
    public void Print() {
       System.out.println("Название товара: " + name);
        if(availability){
            System.out.println("Товар есть на складе.");
        }else{
            System.out.println("Товара нет на складе");
        }
        System.out.println("ЦЕна товара: " + price);
    }
    public void Print2() {
        System.out.println("Название товара: " + name);
        System.out.println("ЦЕна товара: " + price);
     }
    
    
}

