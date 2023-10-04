package lab3;

public class Date {
    private String day;
    private int date;
    private  int month;

    private int  year;


    public Date(String day, int date, int month, int year){
        this.day=day;
        this.date=date;
        this.month=month;
        this.year=year;

    }

    //day
    public void setDay(String day) {
        this.day = day;
    }

    public String getDay() {
        return day;
    }
    //date
    public void setDate(int date) {
        this.date = date;
    }

    public int getDate() {
        return date;
    }

//month

    public int getMonth() {
        return month;
    }
    public void setMonth(int month) {
        this.month = month;
    }

  //year
    public void setYear(int year) {
        this.year = year;
    }
    public int getYear() {
        return year;
    }

    @Override
    public String toString() {
        return String.format("date: %s %d %d %d", day, date, month , year);
    }
}
