
package BookPractice;
import java.util.*;

public class HealthProfile {
    private String first_name;
    private String last_name;
    private String gender;

    private  int height;
    private int weight;
    private Date date;
    public HealthProfile(String first_name, String last_name, String gender, int height, int weight, Date date){
        this.first_name=first_name;
        this.last_name=last_name;
        this.gender=gender;
        this.weight=weight;
        this.height=height;
        this.date=date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Date getDate() {
        return date;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getGender() {
        return gender;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    public int calculateAge() {
        int currentYear = java.time.LocalDate.now().getYear();
        return currentYear - date.getYear();
    }
    public double calculateBMI() {
        return (weight/ (height * height)) * 703.0;
    }
    public int calculateMaxHeartRate() {
        return 220 - calculateAge();
    }

    public String calculateTargetHeartRate() {
        int maxHeartRate = calculateMaxHeartRate();
        int minTargetRate = (int) (maxHeartRate * 0.5); // 50% of max heart rate
        int maxTargetRate = (int) (maxHeartRate * 0.85); // 85% of max heart rate
        return minTargetRate + " - " + maxTargetRate;
    }
    public static void displayBMIChart() {
        System.out.println("BMI Values Chart:");
        System.out.println("Underweight: less than 18.5");
        System.out.println("Normal: 18.5 - 24.9");
        System.out.println("Overweight: 25 - 29.9");
        System.out.println("Obese: 30 or greater");
    }
    public String toString() {
        return String.format("%s's information: %s %s gender: %s height: %s weight:  %s  %s", first_name,first_name,last_name , gender, height, weight, date);
    }

    public static void main(String[] args) {
        HealthProfile person1= new HealthProfile( "Person1","Person1", "Male", 6,65, new Date( 9, 4, 2000 ) );
        System.out.println(person1.toString());
        HealthProfile.displayBMIChart();
    }
}

