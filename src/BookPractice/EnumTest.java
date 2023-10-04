package BookPractice;
//8.10
public class EnumTest {
    enum TrafficLight{
        RED(10),
        GREEN(5),
        YELLOW(15);
        private final int durationInSeconds;
        TrafficLight(int durationInSeconds){
            this.durationInSeconds=durationInSeconds;
        }
        public int getDurationInSeconds() {
            return durationInSeconds;
        }
    }

    public static void main(String[] args) {
        for(TrafficLight traffic:TrafficLight.values()){
            System.out.println(traffic.name()+"the value of duration in seconds is:"+traffic.getDurationInSeconds());
        }

    }
}
