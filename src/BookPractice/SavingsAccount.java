package BookPractice;

public class SavingsAccount {
    private static double annualInterestRate;
    private double savingsBalance;
    public SavingsAccount(double savingsBalance){
        this.savingsBalance=savingsBalance;
    }
    public void calculateMonthlyInterest(){
        double interestRate= (savingsBalance*annualInterestRate)/12;
        savingsBalance+=interestRate;
    }
    public static void modifyInterestRate(double newRate){
        annualInterestRate=newRate;
    }

    public double getSavingsBalance() {
        return savingsBalance;
    }

    public static void main(String[] args) {
        SavingsAccount saver1=new SavingsAccount(2000.00);
        SavingsAccount saver2=new SavingsAccount(3000.00);
        SavingsAccount.modifyInterestRate( 0.04 );
        for(int i=1; i<=12; i++){
            saver1.calculateMonthlyInterest();
            saver2.calculateMonthlyInterest();
            System.out.printf("month %d: %.2f %.2f\n", i,saver1.getSavingsBalance(),saver2.getSavingsBalance());

        }
        SavingsAccount.modifyInterestRate( 0.05);
        saver1.calculateMonthlyInterest();
        saver2.calculateMonthlyInterest();
        System.out.printf("balances of saver 1 and saver 2 are: %.2f %.2f\n ",saver1.getSavingsBalance(),saver2.getSavingsBalance());
    }

}
