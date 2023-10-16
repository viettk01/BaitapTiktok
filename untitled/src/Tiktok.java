import java.util.ArrayList;

public class Tiktok {
    private ArrayList<Idol> idols = new ArrayList<>();
    private ArrayList<Song> Songs = new ArrayList<>();

    public void addIdol(String name, int id, String email, ArrayList<Follower> followers, String group) {
        idols.add(new Idol(name, id, email, followers, group));
    }

    public void addSong(int idSong, String nameSong, String singer) {
        Songs.add(new Song(idSong, nameSong, singer));
    }

    @Override
    public String toString() {
        return "Tiktok{" +
                "idols=" + idols +
                ", Songs=" + Songs +
                '}';
    }
}
