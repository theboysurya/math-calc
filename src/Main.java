import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
//        System.out.println("Welcome to math-calc");
        System.out.println("Welcome to math-calc\n1. Count Number of Factors\n2. Check for Prime Number\n3. Find Sum of n Natural Numbers\nChoose:");
        int option = scn.nextInt();
        System.out.println("Enter your number: ");
        int number = scn.nextInt();
        switch (option){
            case 1:
                int factorCount = countFactor(number);
                System.out.println(factorCount);
                break;
            case 2:
                String checkPrime = checkPrime(number);
                System.out.println(checkPrime);
                break;
            case 3:
                int sum = sumOfNaturalNumber(number);
                System.out.println(sum);
                break;
        }
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

    public static String checkPrime(int number){
        String isPrime = "";
        int countFactor = countFactor(number);
        if(countFactor > 2) {
            isPrime = "NO";
        } else {
            isPrime = "YES";
        }

        return isPrime;
    }

    public static int sumOfNaturalNumber(int number){
        int sum = ((number+1)*number)/2;
        return sum;
    }
}