// File: Flick.java
package movies;

public class Flick {

    // Attributes
    private String name;
    private String producer;
    private String director;
    private int duration; // in minutes
    private int year;
    private String genre;

    // Static variable
    private static int totalFlicks = 0;

    // Read-only field
    private final String flickId;

    // Mandatory-fields constructor
    public Flick(String name, String producer) {
        if (name == null || producer == null) {
            throw new IllegalArgumentException("Name and producer are required!");
        }
        this.name = name;
        this.producer = producer;

        totalFlicks++;
        this.flickId = this.name + "_" + totalFlicks;
    }

    // Constructor with all attributes
    public Flick(String name, String producer, String director, int duration, int year, String genre) {
        this(name, producer); // call mandatory-fields constructor
        this.director = director;
        this.duration = duration;
        this.year = year;
        this.genre = genre;
    }

    // Getters
    public String getFlickId() {
        return flickId;
    }

    public static int getTotalFlicks() {
        return totalFlicks;
    }

    // Method to show details
    public String showInfo() {
        return "Flick ID: " + flickId + ", Name: " + name + ", Producer: " + producer
                + ", Director: " + director + ", Duration: " + duration + " mins, Year: " + year
                + ", Genre: " + genre;
    }
}




//////////////////////////////////////////////




// File: SpecialFlick.java
package movies;

public class SpecialFlick extends Flick {

    private String soundTech;
    private String visualTech;

    // Constructor
    public SpecialFlick(String name, String producer, String soundTech, String visualTech) {
        super(name, producer); // call parent constructor
        this.soundTech = soundTech;
        this.visualTech = visualTech;
    }

    public SpecialFlick(String name, String producer, String director, int duration, int year, String genre,
                        String soundTech, String visualTech) {
        super(name, producer, director, duration, year, genre);
        this.soundTech = soundTech;
        this.visualTech = visualTech;
    }

    @Override
    public String showInfo() {
        return super.showInfo() + ", Sound Tech: " + soundTech + ", Visual Tech: " + visualTech;
    }
}



///////////////////////////////////////////////////////////////////




// File: GlobalFlick.java
package movies;

public class GlobalFlick extends Flick {

    private String country;
    private String language;

    // Constructor
    public GlobalFlick(String name, String producer, String country, String language) {
        super(name, producer);
        this.country = country;
        this.language = language;
    }

    public GlobalFlick(String name, String producer, String director, int duration, int year, String genre,
                       String country, String language) {
        super(name, producer, director, duration, year, genre);
        this.country = country;
        this.language = language;
    }

    @Override
    public String showInfo() {
        return super.showInfo() + ", Country: " + country + ", Language: " + language;
    }
}



//////////////////////////////////////////////////////////////





// File: MainFlicks.java
package movies;

public class MainFlicks {
    public static void main(String[] args) {

        // Basic Flick
        Flick f1 = new Flick("ChillVibes", "Happy Studio");
        System.out.println(f1.getFlickId()); // ChillVibes_1
        System.out.println(f1.showInfo());

        // Flick with all attributes
        Flick f2 = new Flick("AdventureRush", "Epic Films", "Jane Doe", 130, 2025, "Action");
        System.out.println(f2.getFlickId()); // AdventureRush_2
        System.out.println(f2.showInfo());

        // Special Flick
        SpecialFlick sf = new SpecialFlick("SoundBlaster", "Mega Studio", "Dolby Atmos", "CGI 4K");
        System.out.println(sf.getFlickId()); // SoundBlaster_3
        System.out.println(sf.showInfo());

        // Global Flick
        GlobalFlick gf = new GlobalFlick("WorldTour", "Global Studio", "USA", "English");
        System.out.println(gf.getFlickId()); // WorldTour_4
        System.out.println(gf.showInfo());

        // Static variable test
        System.out.println("Total flicks created: " + Flick.getTotalFlicks());
    }
}
