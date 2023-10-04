package BookPractice;

public class Date {
    private int date;
    private  int month;

    private int  year;


    public Date( int date, int month, int year){
        this.date=date;
        this.month=month;
        this.year=year;

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
        return String.format("date:  %d %d %d",  date, month , year);
    }
}

