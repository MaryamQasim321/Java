package lab3;

public class Music {
private String title;
private  int duration;
private  String genre;
private  String albumName;
private Date releaseDate ;
private  Artist artistName;


public Music(String title, int duration, String genre, String albumName, Date releaseDate, Artist artistName ){
    this.title=title;
    this.duration=duration;
    this.genre=genre;
    this.albumName=albumName;
    this.releaseDate=releaseDate;
    this.artistName=artistName;
}



//title
    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    //duration

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public int getDuration() {
        return duration;
    }



    //genre

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getGenre() {
        return genre;
    }
    //alumName

    public void setAlbumName(String albumName) {
        this.albumName = albumName;
    }

    public String getAlbumName() {
        return albumName;
    }
    //releaseDate


    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }

    public Date getReleaseDate() {
        return releaseDate;
    }

    //artist

    public void setArtistName(Artist artistName) {
        this.artistName = artistName;
    }

    public Artist getArtistName() {
        return artistName;
    }

    public String toString() {
        return String.format("%s %d %s %s %s %s", title,duration, genre, albumName, releaseDate, artistName);
    }


    public boolean equals(Object obj1) {
    Music temp=(Music) obj1;

        return getArtistName().equals( temp.getArtistName())&& getTitle().equals( temp.getTitle() );
    }
}
