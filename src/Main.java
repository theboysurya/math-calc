import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
//        System.out.println("Welcome to math-calc");
        System.out.println("Welcome to math-calc\n1. Count Number of Factors\n2. Check for Prime Number\n3. Find Sum " +
                "of first n Natural Numbers\n4. Find sum of first n whole Numbers\n5. Find Square root\nChoose:");
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
                int sum = sumOfFirstNNaturalNumber(number);
                System.out.println(sum);
                break;
            case 4:
                int wsum = sumOfFirstNWholeNumber(number);
                System.out.println(wsum);
                break;
            case 5:
                int sqrt = sqrt(number);
                System.out.println(sqrt);
                break;
        }
    }

    public static int countFactor(int number){
        int count = 0;
        for(int i = 1; i <= sqrt(number); i++){
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

    public static int sumOfFirstNNaturalNumber(int number){
        int sum = ((number+1)*number)/2;
        return sum;
    }

    public static int sumOfFirstNWholeNumber(int number){
        int sum = ((number-1)*number)/2;
        return sum;
    }

    public static int sqrt(int number){
        int sqrt = 0;
        int i = 1;
        while(i*i <= number){
            sqrt = i;
            i++;
        }
        return sqrt;
    }
}