class KabaddiRunner{
    public static void main(String[] args){

        int[] playerNumber={7,12,23,34};
        int[] number=Kabaddi.playerNumber(playerNumber);
        for(int value=0;value<number.length;value++){
            System.out.println(number[value]);
        }

        long[] matchDuration={40l,45l,50l};
        long[] duration=Kabaddi.matchDuration(matchDuration);
        for(int value=0;value<duration.length;value++){
            System.out.println(duration[value]);
        }

        double[] raidPoints={12.5,18.7,22.3};
        double[] point=Kabaddi.raidPoints(raidPoints);
        for(int value=0;value<point.length;value++){
            System.out.println(point[value]);
        }

        float[] tackleSuccessRate={75.5f,82.3f,90.0f};
        float[] rate=Kabaddi.tackleSuccessRate(tackleSuccessRate);
        for(int value=0;value<rate.length;value++){
            System.out.println(rate[value]);
        }

        char[] teamCode={'A','B','C'};
        char[] code=Kabaddi.teamCode(teamCode);
        for(int value=0;value<code.length;value++){
            System.out.println(code[value]);
        }

        boolean[] isCaptain={true,false,true};
        boolean[] captain=Kabaddi.isCaptain(isCaptain);
        for(int value=0;value<captain.length;value++){
            System.out.println(captain[value]);
        }

        String[] playerName={"Pradeep","Arjun","Devank"};
        String[] name=Kabaddi.playerName(playerName);
        for(int value=0;value<name.length;value++){
            System.out.println(name[value]);
        }
    }
}
