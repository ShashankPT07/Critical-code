class FlightRunner{
    public static void main(String[] args){

        int[] flightNumber={101,202,303};
        int[] number=Flight.flightNumber(flightNumber);
        for(int value=0;value<number.length;value++){
            System.out.println(number[value]);
        }

        long[] flightDuration={180l,240l,150l};
        long[] duration=Flight.flightDuration(flightDuration);
        for(int value=0;value<duration.length;value++){
            System.out.println(duration[value]);
        }

        double[] ticketPrice={3500.5,4500.75,2999.99};
        double[] price=Flight.ticketPrice(ticketPrice);
        for(int value=0;value<price.length;value++){
            System.out.println(price[value]);
        }

        float[] fuelCapacity={5000.5f,7000.75f,4500.25f};
        float[] capacity=Flight.fuelCapacity(fuelCapacity);
        for(int value=0;value<capacity.length;value++){
            System.out.println(capacity[value]);
        }

        char[] airlineCode={'A','B','C'};
        char[] code=Flight.airlineCode(airlineCode);
        for(int value=0;value<code.length;value++){
            System.out.println(code[value]);
        }

        boolean[] isOnTime={true,false,true};
        boolean[] onTime=Flight.isOnTime(isOnTime);
        for(int value=0;value<onTime.length;value++){
            System.out.println(onTime[value]);
        }

        String[] destinationName={"New Delhi","Bangalore","Mumbai"};
        String[] name=Flight.destinationName(destinationName);
        for(int value=0;value<name.length;value++){
            System.out.println(name[value]);
        }
    }
}
