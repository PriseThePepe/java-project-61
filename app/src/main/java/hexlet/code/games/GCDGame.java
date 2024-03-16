package hexlet.code.games;

import java.util.Random;
import java.util.Scanner;

public class GCD {
    public void GCDgame(String cliName){
        Random random = new Random();
        Scanner scanner=new Scanner(System.in);
        int correctCount = 0;
        while (correctCount < 3) {
            int rnNumbOne = random.nextInt(0, 100);
            int rnNumbTwo = random.nextInt(0, 100);
            int max=0;
            System.out.println("Question: " + rnNumbOne +" "+ rnNumbTwo);
            int answer=scanner.nextInt();
            while(rnNumbOne!=0&&rnNumbTwo!=0){
                if(rnNumbOne>rnNumbTwo){
                    rnNumbOne=rnNumbOne%rnNumbTwo;
                }else {rnNumbTwo=rnNumbOne%rnNumbTwo;}
              max=rnNumbOne+rnNumbTwo;
            }
            if(answer==max){
                correctCount++;
                System.out.println("Correct!");
            }else {
                System.out.println("'" + answer + "'" + "is wrong answer ;(. Correct answer was '" + max +"`");
                System.out.println("Let`s try again, "+ cliName);
                break;
            }

        }
        if(correctCount==3){
            System.out.println("Congratulations, " + cliName + "!");
        }
    }
}
