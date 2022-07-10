package JavaCore.Test.OOP;

public class PlayerND {
    public static void main(String[] args) {

    }
}

class Player2D {
    public int x, y;

    public void moveTo2D(int xl, int yl) {
        x = xl;
        y = yl;
    }

    public int[] getDistance(int xl, int yl) {
        return new int[]{xl - x, yl - y};
    }
}

class Player3D extends Player2D {
    private int z;

    public void moveTo3D(int xl, int yl, int zl) {
        moveTo2D(xl, yl);
        z = zl;
    }

    public int[] getDistance(int xl, int yl, int zl) {
        return new int[]{xl - x, yl - y, zl - z};
    }
}

class Player4D extends Player3D {
    public void moveTo4D(int xl, int yl, int zl, int tl) {
        int[] distance = super.getDistance(xl, yl, zl); // super обращается к Player3D
        for (int i = 0; i < tl; i++) {
            moveTo3D(xl - distance[0] * (1 - i / tl),
                    yl - distance[1] * (1 - i / tl),
                    zl - distance[2] * (1 - i / tl));
        }
    }
}