import java.util.Arrays;

public class CubicEquationSolver {
    
    public static double[] solveCubicEquation(double a, double b, double c, double d) {
        double[] roots = new double[3];
        
        // Step 1: Compute the discriminant
        double delta0 = b * b - 3 * a * c;
        double delta1 = 2 * b * b * b - 9 * a * b * c + 27 * a * a * d;
        double discriminant = delta1 * delta1 - 4 * delta0 * delta0 * delta0;
        
        // Step 2: Check the nature of the roots
        if (delta0 == 0 && delta1 == 0) {
            // One real root and two complex conjugate roots
            double root = -b / (3 * a);
            double realPart = Math.cbrt(-delta0 / (a * delta0));
            double imaginaryPart = Math.sqrt(Math.abs(discriminant)) / (a * delta0) * Math.cbrt(1.0);
            roots[0] = root + 2 * realPart * imaginaryPart;
            roots[1] = root - realPart * imaginaryPart;
            roots[2] = root - realPart * imaginaryPart;
        } else if (discriminant > 0) {
            // Three distinct real roots
            double C = Math.cbrt((delta1 + Math.sqrt(discriminant)) / 2);
            double D = Math.cbrt((delta1 - Math.sqrt(discriminant)) / 2);
            roots[0] = (-b - C - D) / (3 * a);
            roots[1] = (-b + (C - D) / 2) / (3 * a);
            roots[2] = (-b + (C - D) / 2) / (3 * a);
        } else {
            // One real root and two complex conjugate roots
            double C = Math.cbrt(Math.sqrt(Math.abs(delta0)) / (2 * a));
            double D = Math.acos(-delta1 / (2 * Math.pow(Math.sqrt(Math.abs(delta0))), 3));
            roots[0] = (-b - 2 * C * Math.cos(D / 3)) / (3 * a);
            roots[1] = (-b + C * (Math.cos(D / 3) + Math.sqrt(3) * Math.sin(D / 3))) / (3 * a);
            roots[2] = (-b + C * (Math.cos(D / 3) - Math.sqrt(3) * Math.sin(D / 3))) / (3 * a);
        }
        
        return roots;
    }
    
    public static void main(String[] args) {
        double a = 2;
        double b = -11;
        double c = 17;
        double d = -6;
        
        double[] roots = solveCubicEquation(a, b, c, d);
        
        System.out.println("The roots of the cubic equation are:");
        System.out.println("Root 1: " + roots[0]);
        System.out.println("Root 2: " + roots[1]);
        System.out.println("Root 3: " + roots[2]);
    }
}

