package bzh.zomzog.jgitverdemo.subb;

import bzh.zomzog.jgitverdemo.suba.Pony;

public class TypedPony extends Pony {
    private String type;

    public TypedPony(String name, String type)
    {
        super(name);
        this.type = type;
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return "TypedPony{" +
                "name='" + getName() + '\'' +
                ", type='" + type + '\'' +
                "}";
    }
}
