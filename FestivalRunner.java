class FestivalRunner{
public static void main(String [] args){
int value = Festival.days(23);
System.out.println(value);


long number = Festival.types(103828783888l);
System.out.println(number);


String np = Festival.names("diwali");
System.out.println(np);

char bo = Festival.grade('A');
System.out.println(bo);

boolean b = Festival.ishappen(true);
System.out.println(b);

float va = Festival.price(23.34f);
System.out.println(va);

double v = Festival.budget(23.34788);
System.out.println(v);
}



}