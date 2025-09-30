class SugarRunner{

public static void main(String [] args){

Sugar sugar = new Sugar(3,"white");
Tea tea = new Tea(4,"black",sugar);
Coffee coffee = new Coffee(20,"brown",sugar);
tea.displayTeaDeatils();
coffee.displayCoffeeDetails();


}



}