package com.xworkz.Movies.bridge;


import com.xworkz.Movies.internal.*;

public class BudgetImpl implements Budget {
    @Override
    public MovieInfo MovieName(MovieInfo movieInfo) {
        System.out.println("This is subclass: " + MovieInfo.name + " - " + MovieInfo.year);
        return movieInfo;
    }

    @Override
    public MovieActor Actor(MovieActor movieActor) {
        System.out.println("This is 2nd subclass: " + MovieActor.actorId + " - " + MovieActor.actorName);
        return movieActor;
    }

    @Override
    public MovieDirector Director(MovieDirector movieDirector) {
        System.out.println("This is 3rd subclass: " + MovieDirector.directorName + " - " + MovieDirector.experience);
        return movieDirector;
    }

    @Override
    public MovieBudget Budget(MovieBudget movieBudget) {
        System.out.println("This is 4th subclass: " + MovieBudget.name + " - " + MovieBudget.amount);
        return movieBudget;
    }

    @Override
    public MovieRating Rating(MovieRating movieRating) {
        System.out.println("This is 5th subclass: " + MovieRating.name + " - Rating: " + MovieRating.rating);
        return movieRating;
    }
}
