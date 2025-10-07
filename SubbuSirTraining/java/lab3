// File: Movie.java
package movies;

public class Movie {

    // Attributes
    private String movieName;
    private String producedBy;
    private String directedBy;
    private int duration; // in minutes
    private int year;
    private String category;

    // Static variable
    private static int moviesCount = 0;

    // Read-only field
    private final String movieId;

    // Mandatory-fields constructor
    public Movie(String movieName, String producedBy) {
        if (movieName == null || producedBy == null) {
            throw new IllegalArgumentException("movieName and producedBy are mandatory!");
        }
        this.movieName = movieName;
        this.producedBy = producedBy;

        moviesCount++;
        this.movieId = this.movieName + "_" + moviesCount;
    }

    // Constructor with all attributes
    public Movie(String movieName, String producedBy, String directedBy, int duration, int year, String category) {
        this(movieName, producedBy); // calls mandatory-fields constructor
        this.directedBy = directedBy;
        this.duration = duration;
        this.year = year;
        this.category = category;
    }

    // Getters
    public String getMovieId() {
        return movieId;
    }

    public static int getMoviesCount() {
        return moviesCount;
    }

    // Method to show details
    public String showDetails() {
        return "Movie ID: " + movieId + ", Name: " + movieName + ", Produced By: " + producedBy
                + ", Directed By: " + directedBy + ", Duration: " + duration + " mins, Year: " + year
                + ", Category: " + category;
    }



  ////////////////////////////////////////////////////////


// File: SpecialMovie.java
package movies;

public class SpecialMovie extends Movie {

    private String soundEffectsTechnology;
    private String visualEffectsTechnology;

    // Constructor
    public SpecialMovie(String movieName, String producedBy, String soundEffectsTechnology, String visualEffectsTechnology) {
        super(movieName, producedBy); // call parent constructor
        this.soundEffectsTechnology = soundEffectsTechnology;
        this.visualEffectsTechnology = visualEffectsTechnology;
    }

    public SpecialMovie(String movieName, String producedBy, String directedBy, int duration, int year, String category,
                        String soundEffectsTechnology, String visualEffectsTechnology) {
        super(movieName, producedBy, directedBy, duration, year, category);
        this.soundEffectsTechnology = soundEffectsTechnology;
        this.visualEffectsTechnology = visualEffectsTechnology;
    }

    public String showDetails() {
        return super.showDetails() + ", Sound Effects: " + soundEffectsTechnology
                + ", Visual Effects: " + visualEffectsTechnology;
    }
}


///////////////////////////////////////////////



// File: InternationalMovie.java
package movies;

public class InternationalMovie extends Movie {

    private String country;
    private String language;

    // Constructor
    public InternationalMovie(String movieName, String producedBy, String country, String language) {
        super(movieName, producedBy);
        this.country = country;
        this.language = language;
    }

    public InternationalMovie(String movieName, String producedBy, String directedBy, int duration, int year, String category,
                              String country, String language) {
        super(movieName, producedBy, directedBy, duration, year, category);
        this.country = country;
        this.language = language;
    }

    public String showDetails() {
        return super.showDetails() + ", Country: " + country + ", Language: " + language;
    }
}


  
}



///////////////////////////////////////////////////



// File: Main.java
package movies;

public class Main {
    public static void main(String[] args) {

        // Basic Movie
        Movie m1 = new Movie("Hello", "XYZ Productions");
        System.out.println(m1.getMovieId()); // Hello_1
        System.out.println(m1.showDetails());

        // Movie with all attributes
        Movie m2 = new Movie("AdventureTime", "ABC Studios", "John Doe", 120, 2025, "Action");
        System.out.println(m2.getMovieId()); // AdventureTime_2
        System.out.println(m2.showDetails());

        // Special Movie
        SpecialMovie sm = new SpecialMovie("EpicSound", "Mega Studios", "Dolby Atmos", "CGI 4K");
        System.out.println(sm.getMovieId()); // EpicSound_3
        System.out.println(sm.showDetails());

        // International Movie
        InternationalMovie im = new InternationalMovie("GlobalHit", "World Productions", "USA", "English");
        System.out.println(im.getMovieId()); // GlobalHit_4
        System.out.println(im.showDetails());

        // Static variable test
        System.out.println("Total movies created: " + Movie.getMoviesCount());
    }
}
