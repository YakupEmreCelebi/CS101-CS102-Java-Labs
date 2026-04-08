package lab7;
import java.util.ArrayList;
import java.util.Scanner;

public class Lab07_Q3 {
    public static void addMovie(ArrayList<String> movies){
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter the movie title: ");
        String movie = sc.nextLine();
        movies.add(movie);
    }

    public static void removeMovie(ArrayList<String> movies){
        Scanner input = new Scanner(System.in);
        System.out.println("Select a movie to remove: ");
        for(int i=0; i < movies.size(); i++)
        {
            System.out.println((i+1) + ". " + movies.get(i));
        }
        System.out.print("Enter movie number: ");
        int removeNumber = input.nextInt();
        if(removeNumber > movies.size())
        {
            System.out.println("The entered number is wrong.");
        }
        else
        {
            movies.remove(removeNumber-1);
            System.out.println("Selected movie is removed");
        }
        
    }

    public static void reviewAndRatings(ArrayList<String> movies, ArrayList<String> reviews,  ArrayList<Integer> ratings, ArrayList<Integer> noOfRatings){
        Scanner sc = new Scanner(System.in);
        Scanner in = new Scanner(System.in);
        Scanner input = new Scanner(System.in);
        System.out.println("Select a movie to review: ");
        for(int i=0; i < movies.size(); i++)
        {
            System.out.println((i+1) + ". " + movies.get(i));
        }
        System.out.print("Enter movie number: ");
        int movieNumber = sc.nextInt();
        if(movieNumber > movies.size())
        {
            System.out.println("The entered number is wrong.");
        }
        else
        {
            System.out.print("Enter your review: ");
            String review = in.nextLine();
            String reviewWithNumber = movieNumber + review;
            reviews.add(reviewWithNumber);
           

            
            System.out.print("\nEnter your rating (1-5): ");
            int rating = input.nextInt();
           
            if(ratings.size() == 0)
            {
                for(int i=ratings.size(); i<movieNumber+1; i++)
                {
                    ratings.add(i, 0);
                    noOfRatings.add(i,0);
                }
            }
            else
            {
                for(int i=ratings.size()-1; i<movieNumber+1; i++)
                {
                    ratings.add(i,0);
                    noOfRatings.add(i,0);
                }
            }
            int newRating = ratings.get(movieNumber - 1) + rating;
            ratings.set(movieNumber - 1, newRating);
            int a = noOfRatings.get(movieNumber - 1);
            a++;
            noOfRatings.add(movieNumber - 1, a);
            System.out.println("Review and rating submitted!");
        }
       

    }
    public static void viewAll(ArrayList<String> movies, ArrayList<String> reviews, ArrayList<Integer> ratings, ArrayList<Integer> noOfRatings){
        System.out.println("Movie List:");
        for(int i=0; i < movies.size(); i++)
        {
            System.out.println((i+1) + ". " + movies.get(i));
            if( noOfRatings.get(i) != 0)
            {
                System.out.println("Average Rating: " + (ratings.get(i) / noOfRatings.get(i)));
            }
            else
            {
                System.out.println("Average Rating: 0");
            }
            
            for(int j=0; j<reviews.size(); j++)
            {
                if(reviews.get(j).contains( Integer.toString(i+1)))
                {
                    System.out.println("-" + reviews.get(j).replaceAll( Integer.toString(i+1),""));
                    System.out.println("");
                }

            }
            

        }

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        ArrayList<String> movies = new ArrayList<String>();
        ArrayList<String> reviews = new ArrayList<String>();
        ArrayList<Integer> ratings = new ArrayList<Integer>();
        ArrayList<Integer> noOfRatings = new ArrayList<Integer>();
        int option = 1;
        
        while(option != 5)
        {
            System.out.println("Movie Review System:");
            System.out.println("1. Add a new movie");
            System.out.println("2. Remove a movie");
            System.out.println("3. Submit a review and rating for a movie");
            System.out.println("4. View all movies, reviews, and average ratings");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            option = in.nextInt();
            if(option == 1)
            {
                addMovie(movies);
            }
            else if(option ==2)
            {
                removeMovie(movies);
            }
            else if(option ==3)
            {
                reviewAndRatings(movies,reviews,ratings,noOfRatings);
            }
            else if(option == 4)
            {
                viewAll(movies, reviews, ratings, noOfRatings);
            }
        }
    }
    
}
