class CelebretiesRunner{
public static void main(String [] args){
int value = Celebreties.movies(23653);
System.out.println(value);


long number = Celebreties.fans(103827888l);
System.out.println(number);


String np = Celebreties.name("Dhoni");
System.out.println(np);

char bo = Celebreties.category('A');
System.out.println(bo);

boolean b = Celebreties.isMarried(false);
System.out.println(b);

float va = Celebreties.height(23.34f);
System.out.println(va);

double v = Celebreties.netWorth(23.34788);
System.out.println(v);
}



}