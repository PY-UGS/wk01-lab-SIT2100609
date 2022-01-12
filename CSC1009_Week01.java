package Main;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException{
        Main main = new Main();

        System.out.println("--- CSC1009 - Week 01 Tutorial Question 01 ---");
        main.Question01("Koh Ding Yuan");

        System.out.println("\n--- CSC1009 - Week 01 Tutorial Question 02 ---");
        main.Question02("csc1009");
        
        System.out.println("\n--- CSC1009 - Week 01 Tutorial Question 03 ---");
        main.Question03(102, 66);
        {
            //Custom01Script c01 = new Custom01Script();
            //c01.run();
            
            //Custom02Script c02 = new Custom02Script();
            //c02.run();
        }
    }

    public void Question01(String inputName){
        //Self Introduction
        System.out.println("Hello, I am " + inputName + "!");
    }
    public void Question02(String inputCase){
        //
        String output = null;
        switch(inputCase.toLowerCase()){
            case "csc1009":
                output = "Object Oriented Programming";
                break;
            case "csc1006":
                output = "Mathematics 02";
                break;
            case "csc1010":
                output = "Computer Networks";
                break;
            default:
                System.out.println("Unregistered Module Code");
                return;
            }
            System.out.println("Your input: " + inputCase + " is " + output);
        }
    public void Question03(int inputStart, int inputEnd){
        //Print odd number in descending
        for(int i = inputStart; i > inputEnd; i--){
            if(i % 2 == 1)
                System.out.print(i + " ");
        }
    }
}