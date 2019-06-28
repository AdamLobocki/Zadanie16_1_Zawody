import java.util.List;
import java.util.Scanner;

public class Adding {
void add (List list) {
    Scanner scanner = new Scanner(System.in);
    String x = null;
    System.out.println("Podaj wyniki kolejnego gracza lub STOP");
    x = scanner.nextLine();
    while (!x.equals("STOP")) {
        list.add(new Result(x, scanner.nextInt()));
        System.out.println("Podaj wyniki kolejnego gracza lub STOP");
        x = scanner.nextLine();
        x = scanner.nextLine();

    }
}
}
