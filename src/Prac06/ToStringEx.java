package Prac06;

class Point2 {
    int x, y;
    public Point2(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public String toString() {
        return "Point2(" + x + "," + y + ")";
    }
}
public class ToStringEx {
    public static void main(String [] args) {
        Point2 p = new Point2(2,3);
        System.out.println(p.toString());
        System.out.println(p);
        System.out.println(p + "입니다.");
    }
}
