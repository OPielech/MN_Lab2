public class test {
    public static void main(String[] args) {
        System.out.println("The true value of first Derivative for x=0,5 equals: " + trueValue(0.5));
        System.out.println();

        System.out.println("The approximation of first Derivative for x=0,5 and h=0.25 equals: "
                + approximation(0.5, 0.25));
        System.out.println("The true percent relative error equals: "
                + truePercentRelativeError(trueValue(0.5), approximation(0.5, 0.25)) + " %");
        System.out.println();

        System.out.println("The approximation of first Derivative for x=0,5 and h=0.5 equals: "
                + approximation(0.5, 0.5));
        System.out.println("The true percent relative error equals: "
                + truePercentRelativeError(trueValue(0.5), approximation(0.5, 0.5)) + " %");

        System.out.println();
        System.out.println("The approximation for x=0,5 and h=1/10e0 equals: " + approximationForTask4b(0.5, 0));
        System.out.println("The true percent relative error equals: "
                + truePercentRelativeError(trueValue(0.5), approximationForTask4b(0.5, 0)) + " %");

        System.out.println();
        System.out.println("The approximation for x=0,5 and h=1/10e1 equals: " + approximationForTask4b(0.5, 1));
        System.out.println("The true percent relative error equals: "
                + truePercentRelativeError(trueValue(0.5), approximationForTask4b(0.5, 1)) + " %");

        System.out.println();
        System.out.println("The approximation for x=0,5 and h=1/10e2 equals: " + approximationForTask4b(0.5, 2));
        System.out.println("The true percent relative error equals: "
                + truePercentRelativeError(trueValue(0.5), approximationForTask4b(0.5, 2)) + " %");

        System.out.println();
        System.out.println("The approximation for x=0,5 and h=1/10e3 equals: " + approximationForTask4b(0.5, 3));
        System.out.println("The true percent relative error equals: "
                + truePercentRelativeError(trueValue(0.5), approximationForTask4b(0.5, 3)) + " %");

        System.out.println();
        System.out.println("The approximation for x=0,5 and h=1/10e4 equals: " + approximationForTask4b(0.5, 4));
        System.out.println("The true percent relative error equals: "
                + truePercentRelativeError(trueValue(0.5), approximationForTask4b(0.5, 4)) + " %");

        System.out.println();
        System.out.println("The approximation for x=0,5 and h=1/10e5 equals: " + approximationForTask4b(0.5, 5));
        System.out.println("The true percent relative error equals: "
                + truePercentRelativeError(trueValue(0.5), approximationForTask4b(0.5, 5)) + " %");

        System.out.println();
        System.out.println("The approximation for x=0,5 and h=1/10e6 equals: " + approximationForTask4b(0.5, 6));
        System.out.println("The true percent relative error equals: "
                + truePercentRelativeError(trueValue(0.5), approximationForTask4b(0.5, 6)) + " %");

        System.out.println();
        System.out.println("The approximation for x=0,5 and h=1/10e7 equals: " + approximationForTask4b(0.5, 7));
        System.out.println("The true percent relative error equals: "
                + truePercentRelativeError(trueValue(0.5), approximationForTask4b(0.5, 7)) + " %");

        System.out.println();
        System.out.println("The approximation for x=0,5 and h=1/10e8 equals: " + approximationForTask4b(0.5, 8));
        System.out.println("The true percent relative error equals: "
                + truePercentRelativeError(trueValue(0.5), approximationForTask4b(0.5, 8)) + " %");

        System.out.println();
        System.out.println("The approximation for x=0,5 and h=1/10e9 equals: " + approximationForTask4b(0.5, 9));
        System.out.println("The true percent relative error equals: "
                + truePercentRelativeError(trueValue(0.5), approximationForTask4b(0.5, 9)) + " %");


    }//end of main

    public static double trueValue(double x) {
        double trueValue = -0.4 * Math.pow(x, 3) - 0.45 * Math.pow(x, 2) - x - 0.25;
        return trueValue;
    }//end of trueValue

    public static double function(double x) {
        double function = -0.1 * Math.pow(x, 4) - 0.15 * Math.pow(x, 3) - 0.5 * Math.pow(x, 2) - 0.25 * x + 1.2;
        return function;
    }//end of function

    public static double approximation(double x, double h) {
        double approximation = (function(x + h) - function(x - h)) / (2 * h) - 0 * Math.pow(h, 2);
        return approximation;
    }//end of approximation

    public static double approximationForTask4b(double x, double k) {
        double approximation = (function(x + 1 / Math.pow(10, k)) -
                function(x - 1 / Math.pow(10, k))) / (2 * (1 / Math.pow(10, k)))
                - 0 * Math.pow(1 / Math.pow(10, k), 2);
        return approximation;
    }//end of approximation

    public static double truePercentRelativeError(double trueValue, double approximation) {
        double truePercentRelativeError = Math.abs((trueValue - approximation) / trueValue * 100);
        return truePercentRelativeError;
    }//end of truePercentRelativeError


}//end of class