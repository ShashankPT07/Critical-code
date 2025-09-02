class Politics{
public Politics(){

System.out.println("there is a politicans");
}
public Politics(int number){
	number=12;
	System.out.println("Number of politicans"+number);
}
public Politics(int number,String name){
	name="sidda";
	System.out.println("name of the Politicans-"+name);
}
public Politics(int number,String name,long votes){
	votes=38827789L;
	System.out.println("votes gotten-"+votes);
}
public Politics(int number,String name,long votes,double funds){
	funds=272728.77677777;
	System.out.println("funds for election"+funds);
}
public Politics(int number,String name,long votes,double funds,float votesPercentage){
	votesPercentage=68.565656666F;
	System.out.println("win Percentage"+votesPercentage);
	
}
public Politics(int number,String name,long votes,double funds,float votesPercentage,char code){
	code='M';
	System.out.println("village code-"+code);
}
public Politics(int number,String name,long votes,double funds,float votesPercentage,char code,boolean inPower){
	inPower=true;
	System.out.println("has in a power"+inPower);
	
}

}