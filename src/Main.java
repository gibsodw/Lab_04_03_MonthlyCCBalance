public class Main
{
    public static void main(String[] args)
    {
        double initial = 5000;
        double monthOne = 0;
        double monthTwo = 0;
        double interest = 1.17;

        monthOne = initial * interest;
        monthTwo = monthOne * interest;

        System.out.println("Your initial balance is " + initial);
        System.out.println("Your balance after one month is " + monthOne);
        System.out.println("Your balance after two months is " + monthTwo);


    }
}