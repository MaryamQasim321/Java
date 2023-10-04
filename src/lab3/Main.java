package lab3;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner in=new Scanner( System.in);

        Music m1 = new Music( "song1", 5, "pop", "Pop music", new Date( "sunday", 15, 7, 2023 ), new Artist( "Artist1", "Indian", 5 ) );
        Music m2 = new Music( "song1", 5, "pop", "Pop music", new Date( "sunday", 15, 7, 2023 ), new Artist( "Artist1", "Indian", 5 ) );

        Music m3 = new Music( "song1", 5, "pop", "Pop music", new Date( "sunday", 15, 7, 2023 ), new Artist( "Artist1", "Indian", 5 ) );

        Music m4 = new Music( "song1", 5, "pop", "Pop music", new Date( "sunday", 15, 7, 2023 ), new Artist( "Artist1", "Indian", 5 ) );

        Music m5 = new Music( "song1", 5, "pop", "Pop music", new Date( "sunday", 15, 7, 2023 ), new Artist( "Artist1", "Indian", 5 ) );
//        System.out.println( m1.toString() );
//        System.out.println( m2.toString() );
//        System.out.println( m3.toString() );
//        System.out.println( m4.toString() );
//        System.out.println( m5.toString() );

        Music[] musics = { m1, m2, m3, m4, m5 };

        for (int i = 0; i < musics.length; i++) {
            System.out.println( musics[i].toString() );
        }


        //taking object 6 as input from user
        System.out.println("Enter title name: ");
        String title=in.nextLine();
        System.out.println("Enter title duration of song:");
        int duration=in.nextInt();
        System.out.println("Enter genre: ");
        String genre= in.nextLine();
        System.out.println("Enter title album name:");
        String albumName=in.nextLine();



        //date
        System.out.println("Enter day ");
        String day=in.nextLine();
        System.out.println("Enter month: ");
        int month= in.nextInt();
        System.out.println("Enter date:");
        int date=in.nextInt();
        System.out.println("Enter year:");
        int year=in.nextInt();


        //artist
        System.out.println("Enter name of artist: ");
        String name=in.nextLine();
        System.out.println("Enter nationality of artist: ");
        String nationality= in.nextLine();
        System.out.println("Enter rating of artist: ");
        int rating = in.nextInt();


        Music m6= new Music(title, duration, genre, albumName, new Date(day, date, month, year), new Artist( name, nationality,rating ) );
        System.out.println(m6.toString());

    }
    }

