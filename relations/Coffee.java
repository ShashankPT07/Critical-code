class Coffee{

public int price;
public String coffeeName;
public Sugar sugar;


public Coffee(int price,String coffeeName,Sugar sugar){
this.price=price;
this.coffeeName=coffeeName;
this.sugar=sugar;

}
public void displayCoffeeDetails(){

System.out.println("price of the Coffee"+price+","+"name of the Coffee"+coffeeName);


}
}