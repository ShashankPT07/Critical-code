class RailwayStation{
	public static void main(String[] args){
	int platforms=5;
	int trains=20;
	int passengers=2000;
	int ticketCounters=4;
	int shops=3;
	int entryPoints=1;
	int exitPoints=2;
    	int displayBoards=13;
	int [] RailwayStation = {platforms,trains,passengers,ticketCounters,shops,entryPoints,exitPoints,displayBoards};
	System.out.println(RailwayStation[2]);
	System.out.println("------------------------");
	for(int number=0;number<=RailwayStation.length;number++){
		int value = RailwayStation[number];
     System.out.println(value);
}
		
		
		 
	}

}