package BookPractice;
import java.util.Scanner;
public class GlobalWarming {
    public static void main(String[] args) {
        Scanner in= new Scanner( System.in );
        String[] questions={"What is the primary greenhouse gas responsible for global warming?",
        "Which organization shared the 2007 Nobel Peace Prize for efforts related to global warming?",
                "What is the main argument of global warming skeptics?",
                "What is the consensus among climate scientists regarding global warming?",
                "Which of the following is a potential consequence of global warming?"
    };
        String choices[][]={
                {"1. Carbon dioxide (CO2)", "2. Oxygen (O2)", "3. Nitrogen (N2)", "4. Helium (He)"},
                {"1. United Nations", "2. Greenpeace", "3. World Health Organization", "4. Red Cross"},
                {"1. Human activities have no impact on the climate.", "2. The Earth is cooling, not warming.",
                        "3. Natural factors are the sole cause of climate change.", "4. CO2 emissions are beneficial for the environment."},
                {"1. There is no consensus.", "2. Most agree that global warming is a significant issue caused by human activities.",
                        "3. Most agree that global warming is a natural phenomenon.", "4. The consensus is divided equally among all viewpoints."},
                {"1. Increased polar ice cap size", "2. Reduced sea levels", "3. More frequent extreme weather events",
                        "4. Decreased levels of greenhouse gases"}
        };
        int correctChoice[]={1,2,3,4,5};
        int score=0;


        for(int i=0; i<questions.length; i++)
        {

            System.out.println(questions[i]);
            for(int j=0; j<4; j++){
                System.out.println(choices[i][j]);


            }
            System.out.println("Enter correct option:");
            int choice= in.nextInt();
            if(choice==correctChoice[i]){
                score++;
            }


        }
        System.out.printf("Final score is %d \n", score);
        if(score==5){
            System.out.println("excellent");
        }
        else if(score==4){
            System.out.println("Good");
        }
        else System.out.println("You need improvment.");



}
}
