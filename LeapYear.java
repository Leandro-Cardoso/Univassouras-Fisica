import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        /*  */
        System.out.println();
        System.out.println("Digite um ano para verificar se e ou nao bissesto.");
        System.out.println();
        System.out.print("Ano: ");
        Scanner input = new Scanner(System.in);
        int year = input.nextInt();
        System.out.println();
        if(isLeapYear(year)) {
            System.out.println("O ano " + year + " e bissesto...");
        }
        else {
            System.out.println("O ano " + year + " nao e bissesto...");
        }
        System.out.println();
    }

    public static boolean isLeapYear(int year) {
        /* Verifica se um ano e ou nao bissesto */
        if(year % 400 == 0) {
            return true;
        }
        else if(year % 100 == 0) {
            return false;
        }
        else if(year % 4 == 0) {
            return true;
        }
        else {
            return false;
        }
    }
}
