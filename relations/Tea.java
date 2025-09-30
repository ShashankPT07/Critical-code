class Tea{

public int price;
public String teaName;
public Sugar sugar;


public Tea(int price,String teaName,Sugar sugar){

this.price=price;
this.teaName=teaName;
this.sugar=sugar;

}
public void displayTeaDeatils(){
System.out.println("price of the Tea"+price);
System.out.println("name of the tea"+teaName);

}



}