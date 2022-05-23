import java.util.ArrayList;

public class Herd implements Moveable {
    private ArrayList<Moveable> herd;

    public Herd() {
        this.herd = new ArrayList<>();
    }

    public void addToHerd(Moveable movable) {
        herd.add(movable);
    }

    public String toString() {
        String out = "";
        for (Moveable one : herd) {
            out += one.toString() + "\n";
        }
        return out;
    }

    public void move(int dx, int dy) {
        for(Moveable one:herd){
            one.move(dx, dy);
        }
    }

    
}
