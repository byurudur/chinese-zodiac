import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Chinese zodiac finder;

        // Arranging input;
        int birthYear, sign;
        Scanner input = new Scanner(System.in);

        // While loop;

        while (true){
            System.out.println("Please enter your birth of year: ");
            birthYear = input.nextInt();
            sign = birthYear%12;
            switch (sign) {
                case 0:
                    System.out.println("Chinese zodiac: Monkey");
                    break;
                case 1:
                    System.out.println("Chinese zodiac: Rooster");
                    break;
                case 2:
                    System.out.println("Chinese zodiac: Dog");
                    break;
                case 3:
                    System.out.println("Chinese zodiac: Pig");
                    break;
                case 4:
                    System.out.println("Chinese zodiac: Rat");
                    break;
                case 5:
                    System.out.println("Chinese zodiac: Ox");
                    break;
                case 6:
                    System.out.println("Chinese zodiac: Tiger");
                    break;
                case 7:
                    System.out.println("Chinese zodiac: Rabbit");
                    break;
                case 8:
                    System.out.println("Chinese zodiac: Dragon");
                    break;
                case 9:
                    System.out.println("Chinese zodiac: Snake");
                    break;
                case 10:
                    System.out.println("Chinese zodiac: Horse");
                    break;
                case 11:
                    System.out.println("Chinese zodiac: Sheep");
                    break;
                default:
                    System.out.println("Invalid statement, retry.");
                    break;
            }
        }




        // With if-else blocks.


//        while (true){
//        if (birthYear%12 == 0){
//            System.out.println("Chinese zodiac: Monkey");
//        } else if (birthYear%12 == 1) {
//            System.out.println("Chinese zodiac: Rooster");
//        } else if (birthYear%12 == 2) {
//            System.out.println("Chinese zodiac: Dog");
//        } else if (birthYear%12 == 3) {
//            System.out.println("Chinese zodiac: Pig");
//        } else if (birthYear%12 == 4) {
//            System.out.println("Chinese zodiac: Rat");
//        } else if (birthYear%12 == 5) {
//            System.out.println("Chinese zodiac: Ox");
//        } else if (birthYear%12 == 6) {
//            System.out.println("Chinese zodiac: Tiger");
//        } else if (birthYear%12 == 7) {
//            System.out.println("Chinese zodiac: Bunny");
//        } else if (birthYear%12 == 8) {
//            System.out.println("Chinese zodiac: Dragon");
//        } else if (birthYear%12 == 9) {
//            System.out.println("Chinese zodiac: Snake");
//        } else if (birthYear%12 == 10) {
//            System.out.println("Chinese zodiac: Horse");
//        } else if (birthYear%12 == 11) {
//            System.out.println("Chinese zodiac: Sheep");
//        }continue;
//        }
    }
}
