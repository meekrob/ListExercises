package madman.david.listexercises;


/**
 * Created by david on 5/20/16.
 */
public class Computers {

    public String type;
    public String os;

    public Computers(String s1, String s2) {
        type = s1;
        os = s2;
    }

    @Override
    public String toString() {
        return type + ":" + os;
    }
}
