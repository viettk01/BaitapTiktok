import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Tiktok tiktok = new Tiktok();
        System.out.println("Nhập số lượng idol tiktok");
        int numberIdol = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= numberIdol; i++) {
            System.out.println("nhập tên idol "+i);
            String name = scanner.nextLine();
            System.out.println("nhập id idol " + i);
            int id = Integer.parseInt(scanner.nextLine());
            System.out.println("nhập email idol " + i);
            String email = scanner.nextLine();
            System.out.println("nhập group idol " + i);
            String group = scanner.nextLine();
            System.out.println("nhập so followers "+i);
            int numberOfFollower = Integer.parseInt(scanner.nextLine());
            ArrayList<Follower> followers = new ArrayList<>();
            for(int j = 1; j <= numberOfFollower; j++) {
                System.out.println("nhập tên follower" + j);
                String nameFollower = scanner.nextLine();
                System.out.println("nhập id follower" + j);
                int idFollower = Integer.parseInt(scanner.nextLine());
                System.out.println("nhập email follower" + j);
                String emailFollower = scanner.nextLine();
                System.out.println("nhập số lượt like follower" + j);
                int NumberOfFollower = Integer.parseInt(scanner.nextLine());
                followers.add(new Follower(nameFollower, idFollower, emailFollower, NumberOfFollower));
            }
            tiktok.addIdol(name, id, email, followers, group);
        }

        System.out.println("Nhập số lượng bài hát trên tiktok");
        int numberSongs = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= numberSongs; i++){
            System.out.println("nhập id bài hát");
            int idSong = Integer.parseInt(scanner.nextLine());
            System.out.println("nhập tên bài hát");
            String nameSong = scanner.nextLine();
            System.out.println("nhập tên ca sĩ");
            String Singer = scanner.nextLine();
            tiktok.addSong(idSong, nameSong, Singer);
        }
        System.out.println(tiktok);
    }
}