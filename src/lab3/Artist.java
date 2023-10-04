package lab3;

public class Artist {
private String name;
private String nationality;
private  int rating;


public Artist(String name, String nationality, int rating){
    this.name=name;
    this.nationality=nationality;
    this.rating=rating;
}

//name

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    //nationality
    public void setNationality(String nationality) {
        this.nationality = nationality;
    }
    public String getNationality() {
        return nationality;
    }


    //rating

    public void setRating(int rating) {
        this.rating = rating;
    }

    public int getRating() {
        return rating;
    }


    @Override
    public String toString() {
        return String.format("%s   %s   %d", name, nationality, rating);
    }
}
