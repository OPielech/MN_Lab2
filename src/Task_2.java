public class Task_2 {
    public static void main(String[] args) {
        System.out.println("True value equals: " + trueValueFx());

        System.out.println("");
        System.out.println("Approximation of zero row equals: " + taylorSeries(0));
        System.out.println("Approximation of first row equals: " + taylorSeries(1));
        System.out.println("Approximation of second row equals: " + taylorSeries(2));
        System.out.println("Approximation of third row equals: " + taylorSeries(3));
        System.out.println("Approximation of fourth row equals: " + taylorSeries(4));
        System.out.println("Approximation of fifth row equals: " + taylorSeries(5));
        System.out.println("Approximation of sixth row equals: " + taylorSeries(6));

        System.out.println("");
        System.out.println("True percent relative error for zero row equals: "
                + truePercentRelativeError(taylorSeries(0)) + " %");
        System.out.println("True percent relative error for first row equals: "
                + truePercentRelativeError(taylorSeries(1)) + " %");
        System.out.println("True percent relative error for second row equals: "
                + truePercentRelativeError(taylorSeries(2)) + " %");
        System.out.println("True percent relative error for third row equals: "
                + truePercentRelativeError(taylorSeries(3)) + " %");
        System.out.println("True percent relative error for fourth row equals: "
                + truePercentRelativeError(taylorSeries(4)) + " %");
        System.out.println("True percent relative error for fifth row equals: "
                + truePercentRelativeError(taylorSeries(5)) + " %");
        System.out.println("True percent relative error for sixth row equals: "
                + truePercentRelativeError(taylorSeries(6)) + " %");
    }//end of main

    public static long factorial(int maxN) {
        long factorial = 1;

        for (int i = 1; i <= maxN; i++) {
            factorial *= i;
        }//end of for
        return factorial;
    }//end of factorial

    public static double trueValueFx() {
        double x = Math.PI / 3;
        double fx = Math.cos(x);
        return fx;
    }//end of trueValueFx

    public static double fxZeroDerivative() {
        double xi = Math.PI / 4;
        double fx = Math.cos(xi);
        return fx;
    }//end of fx

    public static double fxFirstDerivative() {
        double xi = Math.PI / 4;
        double fxFirstDerivative = -Math.sin(xi);
        return fxFirstDerivative;
    }//end of fxFirstDerivative

    public static double fxSecondDerivative() {
        double xi = Math.PI / 4;
        double fxSecondDerivative = -Math.cos(xi);
        return fxSecondDerivative;
    }//end of fxSecondDerivative

    public static double fxThirdDerivative() {
        double xi = Math.PI / 4;
        double fxThirdDerivative = Math.sin(xi);
        return fxThirdDerivative;
    }//end of fxThirdDerivative

    public static double fxFourthDerivative() {
        double xi = Math.PI / 4;
        double fxFourthDerivative = Math.cos(xi);
        return fxFourthDerivative;
    }//end of fxFourthDerivative

    public static double fxFifthDerivative() {
        double xi = Math.PI / 4;
        double fxFifthDerivative = -Math.sin(xi);
        return fxFifthDerivative;
    }//end of fxFourthDerivative

    public static double fxSixthDerivative() {
        double xi = Math.PI / 4;
        double fxSixthDerivative = -Math.cos(xi);
        return fxSixthDerivative;
    }//end of fxFourthDerivative

    public static double taylorSeries(int row) {
        double h = Math.PI / 12;
        double approximation = 0;

        for (int i = 0; i <= row; i++) {
            if (i == 0)
                approximation = fxZeroDerivative();
            else if (i == 1)
                approximation = fxZeroDerivative()
                        + fxFirstDerivative() * h;
            else if (i == 2)
                approximation = fxZeroDerivative()
                        + fxFirstDerivative() * h
                        + fxSecondDerivative() / factorial(2) * Math.pow(h, 2);
            else if (i == 3)
                approximation = fxZeroDerivative()
                        + fxFirstDerivative() * h
                        + fxSecondDerivative() / factorial(2) * Math.pow(h, 2)
                        + fxThirdDerivative() / factorial(3) * Math.pow(h, 3);
            else if (i == 4)
                approximation = fxZeroDerivative()
                        + fxFirstDerivative() * h
                        + fxSecondDerivative() / factorial(2) * Math.pow(h, 2)
                        + fxThirdDerivative() / factorial(3) * Math.pow(h, 3)
                        + fxFourthDerivative() / factorial(4) * Math.pow(h, 4);
            else if (i == 5)
                approximation = fxZeroDerivative()
                        + fxFirstDerivative() * h
                        + fxSecondDerivative() / factorial(2) * Math.pow(h, 2)
                        + fxThirdDerivative() / factorial(3) * Math.pow(h, 3)
                        + fxFourthDerivative() / factorial(4) * Math.pow(h, 4)
                        + fxFifthDerivative() / factorial(5) * Math.pow(h, 5);
            else if (i == 6)
                approximation = fxZeroDerivative()
                        + fxFirstDerivative() * h
                        + fxSecondDerivative() / factorial(2) * Math.pow(h, 2)
                        + fxThirdDerivative() / factorial(3) * Math.pow(h, 3)
                        + fxFourthDerivative() / factorial(4) * Math.pow(h, 4)
                        + fxFifthDerivative() / factorial(5) * Math.pow(h, 5)
                        + fxSixthDerivative() / factorial(6) * Math.pow(h, 6);
        }//end of for
        return approximation;
    }//end of taylorSeries

    public static double truePercentRelativeError(double approximation) {
        double et = Math.abs((trueValueFx() - approximation) / trueValueFx() * 100);
        return et;
    }//end of truePercentRelativeError

}//end of class
