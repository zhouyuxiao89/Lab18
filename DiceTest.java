import java.util.Scanner;
public class DiceTest {
    public static void main(String[] args)
      {
            //Display RollCount for static method.
            Scanner input = new Scanner(System.in);
            System.out.println("Display Display RollCount for static method");
            System.out.println("How many dices do want to roll?\n");
            int numberOfDice1 = input.nextInt();
            System.out.println("What is the max value of each dice?\n");
            int maxValue1 = input.nextInt();
            Dice.RollDice1(numberOfDice1, maxValue1);
            System.out.println("How many dices do want to roll?\n");
            int numberOfDice2 = input.nextInt();
            System.out.println("What is the max value of each dice?\n");
            int maxValue2 = input.nextInt();
            Dice.RollDice1(numberOfDice2, maxValue2);
            System.out.println("How many dices do want to roll?\n");
            int numberOfDice3 = input.nextInt();
            System.out.println("What is the max value of each dice?\n");
            int maxValue3 = input.nextInt();
            Dice.RollDice1(numberOfDice3, maxValue3);
            Dice dice1 = new Dice();
            //=========================================
            Dice dice3 = new Dice();
            dice3.Roll_1_Dice();
            dice3.Roll_1_Dice();
            dice3.Roll_1_Dice();
            dice3.Roll_1_Dice();
            System.out.printf("The times the dice rolled for static method is %d\n\n",dice3.getCount1());                    
            //Display RollCount for public method
            System.out.println("Display Display RollCount for public method");
            Dice dice2 = new Dice();
            System.out.println("How many dices do want to roll?\n");
            int numberOfDice4 = input.nextInt();
            System.out.println("What is the max value of each dice?\n");
            int maxValue4 = input.nextInt();
            dice2.RollDice2(numberOfDice4, maxValue4);
            System.out.println("How many dices do want to roll?\n");
            int numberOfDice5 = input.nextInt();
            System.out.println("What is the max value of each dice?\n");
            int maxValue5 = input.nextInt();
            dice2.RollDice2(numberOfDice5, maxValue5);
            System.out.println("How many dices do want to roll?\n");
            int numberOfDice6 = input.nextInt();
            System.out.println("What is the max value of each dice?\n");
            int maxValue6 = input.nextInt();
            dice2.RollDice2(numberOfDice6, maxValue6);
            System.out.printf("The times the dice rolled for regular method is %d\n\n",dice2.getCount2());
      }
}
