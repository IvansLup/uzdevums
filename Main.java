import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Labdien, esmu ChatBots 300, kā tevi sauc?");
        String user_name = scan.nextLine();
        System.out.println("Labdien, " + user_name + " !" + " Man ir liels prieks ka esi iegājis pie mums.");
        System.out.println("Varbūt vēlies apgūt Java?");
        String respond = scan.nextLine();
        if(respond.contains("Jā")) {
            System.out.println("Super, mans kolēģis sagatavos tev piedāvājumu, paldies!");
        } if(respond.contains("Nē")) {
            System.out.println("Varbūt es tev varu piedāvāt darba iespējas?");
            String respond_sec = scan.nextLine();
            if(respond_sec.contains("Jā")) {
                System.out.println("Super prieks dzirdēt!");
            } else {
                System.out.println("Vēlu veiksmi!");
            }

        }
    }
}