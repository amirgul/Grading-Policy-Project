import java.util.Scanner;

public class GradingPolicy
{
    private double quizOne;
    private double quizTwo;
    private double midterm;
    private double finalTerm;
    private double quizOnePercentage;
    private double quizTwoPercentage;
    private double midtermPercentage;
    private double finalPercentage;
    private double totalPercentage;
    private double totalScore;
    Scanner keyboard = new Scanner(System.in);

    public void display()
    {
        System.out.println("please enter score of quiz 1");
        quizOne = keyboard.nextDouble();
        System.out.println("Please enter score of quiz 2");
        quizTwo = keyboard.nextDouble();
        System.out.println("please enter midrerm score ");
        midterm = keyboard.nextDouble();
        System.out.println("please enter score of final Score");
        finalTerm = keyboard.nextDouble();
        quizOnePercentage = (quizOne/10)*12.5;
        quizTwoPercentage = (quizTwo/10)*12.5;
        midtermPercentage = (midterm/100)*25.0;
        finalPercentage = (finalTerm/100)*50.0;
        totalPercentage = quizOnePercentage+quizTwoPercentage+midtermPercentage+finalPercentage;
        totalScore = quizOne+quizTwo+midterm+finalTerm;
        System.out.println("score of quiz1: "+ quizOne);
        System.out.println("Score of quiz@: "+ quizTwo);
        System.out.println("Score of midterm: "+ midterm);
        System.out.println("Score of final term: "+ finalTerm);
        System.out.println("total score is: "+ totalScore);
        System.out.println("total percentage is: "+ totalPercentage);
        if(totalPercentage >= 90)
            System.out.println("A");
        else if(totalPercentage >= 80)
            System.out.println("B");
        else if(totalPercentage >= 70)
            System.out.println("C");
        else if(totalPercentage >= 60)
            System.out.println("D");
        else
            System.out.println("F");


    }
}
