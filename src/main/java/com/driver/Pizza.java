package com.driver;

public class Pizza {
        private int price;
    private Boolean isVeg;
    private String bill;

    private boolean cheese, topping, bag;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
        this.cheese = false;
        this.topping = false;
        this.bag = false;
        if(this.isVeg==true){
            price += 300;
        }
        else
            price += 400;
        bill = "Base Price Of The Pizza: " + price + "\n";
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        if(this.cheese==false){
            this.price += 80;
            bill += "Extra Cheese Added: 80\n";
            this.cheese = true;
        }
    }

    public void addExtraToppings(){
        if(this.topping==false){
            if(isVeg==true){
                this.price += 70;
                bill += "Extra Toppings Added: 70\n";
            }
            else{
                this.price += 120;
                bill += "Extra Toppings Added: 120\n";
            }
            this.topping = true;
        }
        // your code goes here
    }

    public void addTakeaway(){
        // your code goes here
        if(this.bag==false){
            this.price += 20;
            bill += "Paperbag Added: 20\n";
            this.bag = true;
        }
    }

    public String getBill(){
        // your code goes here
        this.bill = ("Base Price Of The Pizza: " + (isVeg==true ? 300 : 400) +
                (cheese==true ? "\nExtra Cheese Added: 80" : "") +
                (topping==true ? "\nExtra Toppings Added: " + (isVeg==true ? 70 : 120): "") +
                (bag==true ? "\nPaperbag Added: 20" : "")+
                "\nTotal Price: " + this.price + "\n"
                );
        return this.bill;
    }
}
