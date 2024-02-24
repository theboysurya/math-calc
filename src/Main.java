import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int number = scn.nextInt();
        int factorCount = countFactor(number);
        System.out.println(factorCount);


    }

    public static int countFactor(int number){
        int count = 0;
        for(int i = 1; i <= Math.sqrt(number); i++){
            if(number % i == 0) { //Checking for i is factor or not
                if (i == number / i) {
                    count += 1;
//                    System.out.println(i);
                } else {
                    count += 2;
//                    System.out.println(i + ", " + number / i);
                }
            }
        }
        return count;
    }
}