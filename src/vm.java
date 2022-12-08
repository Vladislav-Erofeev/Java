/*
 * 101
 * This program was made by Vladislav Erofeev. IKBO-01-21
 */

public class vm {
    public static double f(double x, double y) {
        return x*x + 1.1*y;
    }

    public static void calc() {
        double x = 0;
        double y = 1.6;
        double h = 0.5;
        for (int i = 0; i < 4; i++) {
            System.out.println("______________________________________________________________________________");
            double k1 = f(x, y);
            double k2 = f(x + h/2,y+h/2*k1);
            double k3 = f(x + h/2,y+h/2*k2);
            double k4 = f(x+h,y+h*k3);
            y = y + h/6*(k1 + 2*k2 + 2*k3 + k4);
            x = x + h;
            System.out.println("k1: " + k1);
            System.out.println("k2: " + k2);
            System.out.println("k3: " + k3);
            System.out.println("k4: " + k4);
            System.out.println(x + "     |      " + y);
        }
    }

    public static void main(String[] args) {
        int n = 3*3  + 4*5 + 5*6 + 6*5 + 7*6;
        System.out.println(n);
    }
}
