public class Task_1 {
    public static void main(String[] args) {
        System.out.println("True value equals: " + trueValueFx());
        System.out.println("Approximation equals: " + taylorSeries());

        System.out.println();
        System.out.println("Approximation for n=0: " + taylorSeriesN0());
        System.out.println("Approximation for n=1: " + taylorSeriesN1());
        System.out.println("Approximation for n=2: " + taylorSeriesN2());
        System.out.println("Approximation for n=3: " + taylorSeriesN3());
        System.out.println("Approximation for n=4: " + taylorSeries());

    }//end of main

    public static long factorial(int maxN) {
        long factorial = 1;

        for (int i = 1; i <= maxN; i++) {
            factorial *= i;
        }//end of for
        return factorial;
    }//end of factorial

    public static double trueValueFx() {
        double x = 1;
        double fx = -0.1 * Math.pow(x, 4) - 0.15 * Math.pow(x, 3) - 0.5 * Math.pow(x, 2) - 0.25 * x + 1.2;
        return fx;
    }//end of trueValueFx

    public static double fxZeroDerivative() {
        double xi = 0;
        double fx = -0.1 * Math.pow(xi, 4) - 0.15 * Math.pow(xi, 3) - 0.5 * Math.pow(xi, 2) - 0.25 * xi + 1.2;
        return fx;
    }//end of fx

    public static double fxFirstDerivative() {
        double xi = 0;
        double fxFirstDerivative = (-0.4 * Math.pow(xi, 3) - 0.45 * Math.pow(xi, 2) - 1 * xi - 0.25);
        ;
        return fxFirstDerivative;
    }//end of fxFirstDerivative

    public static double fxSecondDerivative() {
        double xi = 0;
        double fxSecondDerivative = (-1.2 * Math.pow(xi, 2) - 0.9 * xi - 1);
        ;
        return fxSecondDerivative;
    }//end of fxSecondDerivative

    public static double fxThirdDerivative() {
        double xi = 0;
        double fxThirdDerivative = (-2.4 * xi - 0.9);
        ;
        return fxThirdDerivative;
    }//end of fxThirdDerivative

    public static double fxFourthDerivative() {
        double fxFourthDerivative = -2.4;
        return fxFourthDerivative;
    }//end of fxFourthDerivative

    public static double taylorSeries() {
        double h = 1;
        double approximation = fxZeroDerivative() + fxFirstDerivative() + fxSecondDerivative() / factorial(2)
                * Math.pow(h, 2) + fxThirdDerivative() / factorial(3) * Math.pow(h, 3)
                + fxFourthDerivative() / factorial(4) * Math.pow(h, 4);
        return approximation;

    }//end of taylorSeries

    public static double taylorSeriesN3() {
        double h = 1;
        double approximation = fxZeroDerivative() + fxFirstDerivative() + fxSecondDerivative() / factorial(2)
                * Math.pow(h, 2) + fxThirdDerivative() / factorial(3) * Math.pow(h, 3);
        return approximation;

    }//end of taylorSeries

    public static double taylorSeriesN2() {
        double h = 1;
        double approximation = fxZeroDerivative() + fxFirstDerivative() + fxSecondDerivative() / factorial(2)
                * Math.pow(h, 2);
        return approximation;

    }//end of taylorSeries

    public static double taylorSeriesN1() {
        double h = 1;
        double approximation = fxZeroDerivative() + fxFirstDerivative();
        return approximation;

    }//end of taylorSeries

    public static double taylorSeriesN0() {
        double h = 1;
        double approximation = fxZeroDerivative();
        return approximation;

    }//end of taylorSeries

}//end of class
