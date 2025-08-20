class MovieRunner {
    public static void main(String[] args) {

        int[] movieIds={101,102,103,104};
        int[] id=Movie.movieId(movieIds);
        for(int value=0;value<id.length;value++){
            System.out.println(id[value]);
        }

        long[] boxOfficeCollections={1508676l,230665l,186687l};
        long[] collections=Movie.boxOfficeCollection(boxOfficeCollections);
        for(int value=0;value<collections.length;value++){
            System.out.println(collections[value]);
        }

        double[] movieRatings={8.2,7.5,9.1};
        double[] ratings=Movie.movieRating(movieRatings);
        for(int value=0;value<ratings.length;value++){
            System.out.println(ratings[value]);
        }

        float[] durations={2.5f,1.75f,3.0f};
        float[] times=Movie.duration(durations);
        for(int value=0;value<times.length;value++){
            System.out.println(times[value]);
        }

        char[] movieGrades={'U','A','U'};
        char[] grades=Movie.movieGrade(movieGrades);
        for(int value=0;value<grades.length;value++){
            System.out.println(grades[value]);
        }

        boolean[] isReleased={true,false,true};
        boolean[] released=Movie.isReleased(isReleased);
        for(int value=0;value<released.length;value++){
            System.out.println(released[value]);
        }

        String[] movieTitles={"RRR","Max","BRB"};
        String[] titles=Movie.movieTitle(movieTitles);
        for(int value=0;value<titles.length;value++){
            System.out.println(titles[value]);
        }
    }
}
