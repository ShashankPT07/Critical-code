class CountryRunner{
    public static void main(String[] args){

        int[] countryCode={91,44,81};
        int[] code=Country.countryCode(countryCode);
        for(int value=0;value<code.length;value++){
            System.out.println(code[value]);
        }

        long[] population={1380004385L,67886011L,126476461L};
        long[] pop=Country.population(population);
        for(int value=0;value<pop.length;value++){
            System.out.println(pop[value]);
        }

        double[] area={3287263.045,243610.56,377975.686};
        double[] ar=Country.area(area);
        for(int value=0;value<ar.length;value++){
            System.out.println(ar[value]);
        }

        float[] gdp={2875.1f,282.5f,506.5f};
        float[] g=Country.gdp(gdp);
        for(int value=0;value<g.length;value++){
            System.out.println(g[value]);
        }

        char[] continentCode={'A','E','A'};
        char[] contCode=Country.continentCode(continentCode);
        for(int value=0;value<contCode.length;value++){
            System.out.println(contCode[value]);
        }

        boolean[] isDeveloped={false,true,true};
        boolean[] dev=Country.isDeveloped(isDeveloped);
        for(int value=0;value<dev.length;value++){
            System.out.println(dev[value]);
        }

        String[] countryName={"India","UK","Japan"};
        String[] name=Country.countryName(countryName);
        for(int value=0;value<name.length;value++){
            System.out.println(name[value]);
        }
    }
}
