import java.util.Scanner;

public class UserInput {
    private final Scanner scanner;

    public UserInput() {
        this.scanner = new Scanner(System.in);
    }

    public int numberOfSubjects(){
        System.out.print(("Enter number of subject: -> "));
        int number = 0;
        if (scanner.hasNextInt()) {
            number = scanner.nextInt();
        } else {
            System.out.println("Enter the incorrect number. Please tre again");
            scanner.next();
        }
        return number;
    }


public int setMark() {
    System.out.print(" ");
    int mark = 0;
    while (true) {
        if (scanner.hasNextInt()) {
            mark = scanner.nextInt();
            break;
        } else {
            System.out.print("Enter the invalid mark. Please try again");
            scanner.next();
        }
    }
    return mark;
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
