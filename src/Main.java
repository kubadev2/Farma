import java.util.Scanner;
public class Main {
    public static void main(String[] args)
    {
        System.out.println("Rozpoczynamy grę");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj swoją nazwę: ");
        String name = scanner.next();
        User user1 = new User(name);

        Farm[] farm = new Farm[4];
        for (int i = 1; i <= 4; i++)
            farm[i-1]=new Farm();

        int choice;
        do
        {
            CLS();
            System.out.println("Witaj " + user1.name);
            System.out.println("Posiadasz " + user1.name + " farm/y");
            System.out.println("Jeśli chcesz kupić farmę wybierz 1");
            choice = Integer.parseInt(scanner.next());
            if(choice==1) {

                System.out.println("Oto farmy możliwe do kupienia");
                for (int i = 1; i <= 4; i++) {
                    System.out.println("Farma " + i );
                    System.out.println("Stodoły: " + farm[i-1].barn);
                    System.out.println("Chlewy:  " + farm[i-1].sty);
                }
            }
            scanner.next();
        }while(choice!=0);
    }
    public static void CLS() {
        for (int i = 0; i < 20; ++i) System.out.println();
    }
}