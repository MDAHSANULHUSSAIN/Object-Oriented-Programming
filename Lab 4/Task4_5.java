/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ahsan.lav_4;

/**
 *
 * @author ASUS
 */

abstract class Movie{
    final String  title ;
    final String director;
   static  int totalMovies = 0;
  Movie(String title,String director){
      this.title = title;
      this.director=director;
      totalMovies++;
  }
    static int getMovieCount() {
        return totalMovies;
    }
   abstract double calculateRating();
   
   abstract void displayInfo();

   
    String getTitle() {
        return title;
    }
   String getDirector() {
        return director;
    }
    
    
}


class ActionMovie extends Movie {
     final String stuntsCoordinator;
    static int dangerLevel = 9;

    public ActionMovie(String title, String director, String stuntsCoordinator) {
        super(title, director);
        this.stuntsCoordinator = stuntsCoordinator;
    }

    @Override
    public double calculateRating() {
        return 8.5;
    }
    @Override
    public void displayInfo() {
        System.out.println("Action Movie: \"" + getTitle() + "\" directed by " + getDirector() + ".");
        System.out.println("Stunt Coordinator: " + stuntsCoordinator);
        System.out.println("Danger Level:" + dangerLevel + "/10");
        System.out.println("Calculated Rating: " + calculateRating() + "/10\n");
    }
}
class ComedyMovie extends Movie {
    private final String humorStyle;

    public ComedyMovie(String title, String director, String humorStyle) {
        super(title, director);
        this.humorStyle =humorStyle;
    }

    @Override
    public double calculateRating() {
        return 7.5;
    }

    public static double getLaughterRating() {
        return 7.8;
    }

    @Override
    public void displayInfo() {
        System.out.println("Comedy Movie: \"" + getTitle() + "\" directed by " + getDirector() + ".");
        System.out.println("Humor Style: " + humorStyle);
        System.out.println("Laughter Rating: " + getLaughterRating() + "/10");
        System.out.println("Calculated Rating: " + calculateRating() + "/10\n");
    }
}


public class Task4_5 {
    public static void main(String[] args) {
       ActionMovie actionMovie = new ActionMovie("Mad Max: Fury Road", "George Miller", "Tom Hardy");
        ComedyMovie comedyMovie = new ComedyMovie("Superbad", "Greg Mottola", "Teen Comedy");

        actionMovie.displayInfo();
        comedyMovie.displayInfo();
      System.out.println("Total movies created: " + Movie.getMovieCount());
    }
}
 
    
