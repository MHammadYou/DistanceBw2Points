import java.util.*;

public class Point {

    private int x;
    private int y;

    public Point() {}

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void setX() {
        System.out.println("Enter first number");
        this.x = getInput();
    }

    public void setY() {
        System.out.println("Enter second number");
        this.y = getInput();
    }

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }

    public static double calculateDistance(Point p1, Point p2) {
        return Math.sqrt(Math.pow(p1.x - p2.x, 2) + Math.pow(p1.y - p2.y, 2));
    }

    private int getInput() {
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }

}
