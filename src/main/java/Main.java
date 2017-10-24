import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        String direction;
        int level = 0;


        System.out.print("direction(up,down,right,left): ");
        direction = number.next();

        try {
            System.out.print("Level: ");
            level = number.nextInt();
        }
        catch (Exception e) {
            System.out.println("Podaj liczbe!");
        }

        switch(direction) {
            case "up":
                Up up = new Up(level);
                break;
            case "down":
                Down down = new Down(level);
                break;
            case "left":
                Left left = new Left(level);
                break;
            case "right":
                Right right = new Right(level);
                break;
            default:
                System.out.println("zła komenda");
        }

    }

}
