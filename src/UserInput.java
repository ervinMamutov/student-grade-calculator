import java.util.Scanner;

public class UserInput {
    private final Scanner scanner;

    public UserInput() {
        this.scanner = new Scanner(System.in);
    }

    public int numberOfSubjects(){

        System.out.print(("Enter number of subject: -> "));

        if (scanner.hasNextInt()) {
            return scanner.nextInt();
        } else {
            System.out.println("Enter the incorrect number. Pleae tre again");
            scanner.next();
            return 0;
        }
    }

    public int setMark() {
        System.out.print(" ");
        if (scanner.hasNextInt()) {
            return scanner.nextInt();
        } else {
            System.out.print("Enter the invalid mark. Please try again");
            scanner.next();
        }
        return 0;
    }

    public int showResult(){
        int num = 0;
        System.out.print("Select what do you want: sum (1), average(2), rating(3)");
        if (scanner.hasNextInt()) {
            num = scanner.nextInt();
            if( num >= 1 && num <= 3) {
                return num;
            } else {
                System.out.print("Enter the incorrect number. Please try again. (1 - 3)");
                scanner.next();
            }
        } else {
            System.out.print("Enter the incorrect number. Please try again. (1 - 3)");
            scanner.next();
        }
        return num;
    }


    public boolean isContinue() {
        System.out.print("Are you continuing? Yes/no: -> ");
        if (scanner.hasNext()){
            String choice = scanner.next().toLowerCase();

            return switch (choice) {
                case "y" -> true;
                case "n" -> false;
                default -> {
                    System.out.println("Invalid answer assuming 'no'");
                    yield false;
                }
            };
        }
        return false;
    }

    public void scannerClose(){
        scanner.close();
    }
}
