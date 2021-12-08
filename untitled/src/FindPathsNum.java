class Point {
    public int x;
    public int y;
    public boolean isWall;

    public Point(int y, int x, boolean isWall) {
        this.x = x;
        this.y = y;
        this.isWall = isWall;
    }

    @Override
    public boolean equals(Object p) {
        if (p.getClass() == Point.class) {
            return ((Point) p).x == this.x
                    && ((Point) p).y == this.y;
        }
        return false;
    }
}

public class FindPathsNum {
    private static Point[][] bracket;

    /*  Количество способов пройти лабиринт вправо и вверх. */
    public static void main(String[] args) {
//        Point point1 = new Point(1, 1);
//        Point point2 = new Point(1, 2);

        bracket = new Point[3][3];
        for (int i = 0; i < bracket.length; i++) {
            for (int j = 0; j < bracket.length; j++) {
                bracket[i][j] = new Point(i,j,false);
            }
        }
        bracket[1][1].isWall = true;
//        bracket[1][0].isWall = true;
//        bracket[2][1].isWall = true;
        System.out.println(getPaths(bracket[2][0], bracket[0][2]));
        //System.out.println(point1.equals(point2));
    }

    /*
        1 1 f
        3 2 1
        s 3 1
        getPaths = 6

        1 1 f
        1 # 1
        s 1 1
        getPaths = 2

        1 1 f
        # # 1
        s # 1
        getPaths = 0
     */

    public static int getPaths(Point p, Point f) {
        if (bracket[p.y][p.x].isWall) return 0;
        if (p.x == f.x || p.y == f.y) return 1;

        return getPaths(bracket[p.y][p.x + 1], f) + getPaths(bracket[p.y - 1][p.x], f);
    }
}
