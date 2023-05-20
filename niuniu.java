import pka.*;

public class niuniu {
    public static void main(String[] args) {
        Circle c = new Circle(10);
        c.setColor("red");
        System.out.println(c.area());
        System.out.println(c.getColor());
        Shape2D s = new Circle(10);
        System.out.println(s.area());
        c.setColor(null);
        Color cc = new Circle(10);
        cc.setColor("red");
    }
}
