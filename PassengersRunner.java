class PassengersRunner{
public static void main(String [] args){

int [] noOfAge={23,12,34,34};
int [] age=Passengers.passengersAge(noOfAge);
for(int value=0;value<age.length;value++){
System.out.println(age[value]);
}

long [] numberOfId={13l,26l,86l};
long [] ids=Passengers.passengersId(numberOfId);
for(int value=0;value<ids.length;value++){
	System.out.println(ids[value]);
}
double[] numberOfPrice={87.45,77.54,66.78};
double[] price=Passengers.passengersPrice(numberOfPrice);
for(int value=0;value<price.length;value++){
	System.out.println(price[value]);
}
float[] numberofWeight={4556.733f,5277.867f,5722.67367f};
float[] weight=Passengers.luggageWeight(numberofWeight);
for(int value=0;value<weight.length;value++){
	System.out.println(weight[value]);
}
char[] numberofCategory={'A','B','C'};
char[] category=Passengers.seatCategory(numberofCategory);
for(int value=0;value<category.length;value++){
	System.out.println(category[value]);
}
boolean[] numberOfTicket={true,false,true};
boolean[] ticket=Passengers.hasTicket(numberOfTicket);
for(int value=0;value<ticket.length;value++){
	System.out.println(ticket[value]);
}
String[] nameOfThePassengers={"msd","raina"};
String[] name=Passengers.passengersName(nameOfThePassengers);
for(int value=0;value<name.length;value++){
	System.out.println(name[value]);
}

}




}