//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        String name = "Shakeel";
        int age = 29;
        age = -1;
        char initial = 'A';
        Double bankBalance = 234567.9;
        float billAmount = 2345.9f;
        long availableBal = 1000l;
        boolean ifbalanceIsPositive = true;
        boolean ifbalanceIsNegative = false;
        int maxValue = Math.max(100, 20);
        int minValue = Math.min(80, 10);
        int absoluteValue = Math.abs(-123456);
        System.out.println("Name is" + name + " Age is " + age + " Bankbalance is " + bankBalance + " Purchase Amount is " + billAmount + " after purchase " + availableBal + " If Positive Bal " + ifbalanceIsPositive + " If Negative Bal " + ifbalanceIsNegative);
        System.out.println(age);
        System.out.println(maxValue);
        System.out.println(absoluteValue);
        System.out.println(minValue);

        if (age >= 0 && age <= 12) {
            System.out.println("Child");
        } else if (age >= 13 && age <= 19) {
            System.out.println("Teen");
        } else if (age >= 20 && age <= 59) {
            System.out.println("Adult");
        } else if (age >= 60) {
            System.out.println("Senior Citizen");
        } else {
            System.out.println("Invalid age");
        }
        int grade = 83;
        // grade mapping algorithm : 90–100: A, 80–89: B, 70–79: C, 60–69: D, Below 60: F
        if (grade >= 0 && grade <= 60) {
            System.out.println("F");
        } else if (grade >= 60 && grade <= 69) {
            System.out.println("D");
        } else if (grade >= 70 && grade <= 79) {
            System.out.println("C");
        } else if (grade >= 80 && grade <= 89) {
            System.out.println("B");
        } else if (grade >= 90 && grade <= 100) {
            System.out.println("A");
        } else {
            System.out.println("Invalid grade");
        }
        int temperature = 70;
        if (temperature <= 0) {
            System.out.println("Freezing");
        } else if (temperature >0 && temperature <=20){
            System.out.println("Cold");
        } else if (temperature >= 21 && temperature <=35){
            System.out.println("Moderate");
        } else {
            System.out.println("Hot");
        }
        //Array

        //int[] arr = new int[10];

        //int[] arr = {1,2,3,4,5};
        int i = 200;
        while (i > 100){
            if (i%2==0){
                System.out.println(i+ " Even ");
            } else {
                System.out.println(i+ " odd ");
            }
                i--; // i = i + 2
        }
int A = 100;
        int B = 0;
        while(A <200){
            B=A+B;
            A++;
        }
System.out.println("Total value " + B);

        int C = 99;
        int D = 0;
        while(C<200){
            if(C%5==0){
                D=C+D;
            }
            C++;
        }
        System.out.println(" Addition of 5 " + D);


    }
}
        // 0-12 child 13 - 19 teen 20-59 adult 60+ senior citizen
        //if else else if >= <= &&
