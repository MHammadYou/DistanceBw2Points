public class Main {
    public static void main(String[] args) {

        Point point1 = new Point();
        Point point2 = new Point();

        point1.setX();
        point1.setY();

        point2.setX();
        point2.setY();

        double distance = Point.calculateDistance(point1, point2);
        System.out.println(distance);
    }
}
