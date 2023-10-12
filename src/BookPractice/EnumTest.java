package BookPractice;
//8.10
public class EnumTest {
    enum TrafficLight{
        RED(10 ),
        GREEN(5),
        YELLOW(15);
        private final int durationInSeconds;
        private static int mm=9;

        TrafficLight(int durationInSeconds){
            this.durationInSeconds=durationInSeconds;

        }

        public static void setMm(int mm) {
            TrafficLight.mm = mm;
        }

        public static int getMm() {
            return mm;
        }

        public int getDurationInSeconds()
        {
            return durationInSeconds;
        }
    }

    public static void main(String[] args) {
        for(TrafficLight traffic:TrafficLight.values()){
            TrafficLight.setMm( 20 );
            System.out.println(traffic.name()+"the value of duration in seconds is:"+traffic.getDurationInSeconds()+ " "+ TrafficLight.getMm());
        }

    }
}
