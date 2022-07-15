package JavaCore.Lang.MethodsObject;

import java.util.Objects;

public class Heir extends Ancestor{
    private int hp;
    public Heir(String name) {
        super(name);
    }

    public Heir(String name, int hp) {
        super(name);
        this.hp = hp;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true; // проверяем ссылки
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Heir heir = (Heir) o;
        return hp == heir.hp;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), hp);
    }
}
