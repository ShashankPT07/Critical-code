package com.xworkz.Movies.bridge;

import com.xworkz.Movies.internal.*;

public interface Rating {
    MovieInfo MovieName(MovieInfo movieInfo);
    MovieActor Actor(MovieActor movieActor);
    MovieDirector Director(MovieDirector movieDirector);
    MovieBudget Budget(MovieBudget movieBudget);
    MovieRating Rating(MovieRating movieRating);
}
