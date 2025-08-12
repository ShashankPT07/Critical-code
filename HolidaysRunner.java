class HolidaysRunner{
public static void main(String [] args){
int value = Holidays.days(233);
System.out.println(value);


long number = Holidays.cost(103828783888l);
System.out.println(number);


String np = Holidays.name("diwali");
System.out.println(np);

char bo = Holidays.rating('A');
System.out.println(bo);

boolean b = Holidays.isInternational(false);
System.out.println(b);

float va = Holidays.distance(23.34f);
System.out.println(va);

double v = Holidays.price(23.34788);
System.out.println(v);
}



}