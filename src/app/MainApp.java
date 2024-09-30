import java.util.Scanner;

public class MainApp {

    public static void main(String[] args) {
        String pay = "To pay: ";
        String error = "You followed the instructions above incorrectly, please try again.";
        String welcome = "Welcome to the tax bot";
        String enterDate = "Enter your salary so I can help you calculate your tax";
        String corectEnter = "*Please enter the amount correctly, for example: 10000 or 10000,43";
        String thank = "Thank you for using our bot, see you soon!";
        Scanner scanner = new Scanner(System.in);

        System.out.printf("%s \n" +
                "%s \n" +
                "%s \n" , welcome, enterDate, corectEnter);

          double salary = scanner.nextDouble();

        if (salary >= 0 && salary <= 10000) {
            salary *= 0.025;
            System.out.println(pay + salary);
            System.out.println(thank);
        } else if (salary > 10000 && salary<=25000){
            salary *= 0.043;
            System.out.println(pay + salary);
            System.out.println(thank);
        } else if (salary > 25000){
            salary *= 0.067;
            System.out.println(pay + salary);
            System.out.println(thank);
        }else {
            System.out.println(error);
        }



        }
    }

