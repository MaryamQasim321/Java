package BookPractice;

public class CommandLine {
    public static void main(String[] args) {
        if(args.length==0){
            System.out.println("no arguments provided.");
            return;
        }
        double sum=0;
        for(String arg:args){
            double value= Double.parseDouble( arg );
            sum+=value;

        }
        System.out.println("sum is "+sum);



    }
}
