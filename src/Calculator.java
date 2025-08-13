import java.util.Scanner;
public class Calculator {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Hello User..Welcome to calculator");
        int howmanytime =0;
        int running_total= 0;
        System.out.println("How many numbers you want to enter to find out the total: ");
        howmanytime = input.nextInt();
        for(int i=1;i<=howmanytime;i++) {
            System.out.print("Enter the "+ i+" number: ");
            int num = input.nextInt();
            running_total= num+ running_total;
            System.out.println(running_total);
        }
        System.out.println(running_total);
    }
}
