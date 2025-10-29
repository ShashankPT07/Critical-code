package com.xworkz.Movies.external;

import com.xworkz.Movies.bridge.*;
import com.xworkz.Movies.internal.*;
import com.xworkz.Movies.internal.*;
import com.xworkz.Movies.internal.*;
import com.xworkz.Movies.internal.*;

public class MovieRunner {
    public static void main(String[] args) {
        Movie movie = new MovieImpl();
        movie.MovieName(new MovieInfo("Inception", 2010));
        movie.Actor(new MovieActor(101, "Leonardo DiCaprio"));
        movie.Director(new MovieDirector("Christopher Nolan", 25));
        movie.Budget(new MovieBudget("Inception", 160000000));
        movie.Rating(new MovieRating("Inception", 8.8));
        System.out.println("---------------------------------");

        Actor actor = new ActorImpl();
        actor.MovieName(new MovieInfo("Titanic", 1997));
        actor.Actor(new MovieActor(102, "Kate Winslet"));
        actor.Director(new MovieDirector("James Cameron", 30));
        actor.Budget(new MovieBudget("Titanic", 200000000));
        actor.Rating(new MovieRating("Titanic", 9.0));
        System.out.println("---------------------------------");

        Director director = new DirectorImpl();
        director.MovieName(new MovieInfo("Avatar", 2009));
        director.Actor(new MovieActor(103, "Sam Worthington"));
        director.Director(new MovieDirector("James Cameron", 35));
        director.Budget(new MovieBudget("Avatar", 237000000));
        director.Rating(new MovieRating("Avatar", 8.5));
        System.out.println("---------------------------------");

        Budget budget = new BudgetImpl();
        budget.MovieName(new MovieInfo("Interstellar", 2014));
        budget.Actor(new MovieActor(104, "Matthew McConaughey"));
        budget.Director(new MovieDirector("Christopher Nolan", 25));
        budget.Budget(new MovieBudget("Interstellar", 165000000));
        budget.Rating(new MovieRating("Interstellar", 8.7));
        System.out.println("---------------------------------");

        Rating rating = new RatingImpl();
        rating.MovieName(new MovieInfo("The Dark Knight", 2008));
        rating.Actor(new MovieActor(105, "Christian Bale"));
        rating.Director(new MovieDirector("Christopher Nolan", 25));
        rating.Budget(new MovieBudget("The Dark Knight", 185000000));
        rating.Rating(new MovieRating("The Dark Knight", 9.0));
        System.out.println("---------------------------------");
    }
}

