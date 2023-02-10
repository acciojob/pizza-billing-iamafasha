package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;
    private int cheese = 0;
    private int toppings = 0 ;
    private int takeAway = 0;


    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here 
        this.price = (isVeg ? 300 : 400);
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        this.cheese = 80;
    }

    public void addExtraToppings(){
        this.toppings = ((this.isVeg) ? 70 : 120);
    }

    public void addTakeaway(){
        this.takeAway = 20;
    }

    public String getBill(){
        this.bill = "Base Price Of The Pizza: "+this.price+"\n";
        if(this.cheese > 0){
            this.bill+="Extra Cheese Added: "+this.cheese+"\n";
        }
        if(this.toppings > 0){
            this.bill+="Extra Toppings Added: "+this.toppings+"\n";
        }
        if(this.takeAway > 0){
            this.bill+="Paperbag Added: "+this.takeAway+"\n";
        }
        this.bill+="Total Price: "+(this.price + this.cheese + this.toppings + this.takeAway)+"\n";
        return this.bill;
    }
}
