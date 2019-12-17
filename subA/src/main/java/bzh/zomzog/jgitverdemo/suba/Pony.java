package bzh.zomzog.jgitverdemo.suba;

public class Pony {
    private String name;

    public Pony(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Pony{" +
                "name='" + name + '\'' +
                '}';
    }
}
