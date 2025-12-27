package demo;

public class Calculator {
    public static double sum(double x, double y) {
        return x + y;
    }
    public static double sub(double x, double y) {
        return x - y;
    }
    public static double mul(double x, double y) {
        return x * y;
    }
    public static double div(double x, double y) {
        if (y == 0) return Double.NaN;
        return x / y;
    }
}
