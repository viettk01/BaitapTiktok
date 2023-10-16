import java.util.ArrayList;

public class Idol {
    private String name;
    private int id;
    private String email;
    private ArrayList<Follower> followers;
    private String group;

    public Idol(String name, int id, String email, ArrayList<Follower> followers, String group) {
        this.name = name;
        this.id = id;
        this.email = email;
        this.followers = followers;
        this.group = group;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }



    @Override
    public String toString() {
        return "Idol{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", email='" + email + '\'' +
                ", followers=" + followers +
                ", group='" + group + '\'' +
                '}';
    }
}
