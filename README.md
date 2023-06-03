# Cubic-Equation-Solver-Step-by-Step-Solution-in-Java
The provided Java program implements a comprehensive and robust solution for solving cubic equations of the form ax^3 + bx^2 + cx + d = 0, where a, b, c, and d represent the coefficients of the equation. This code follows a rigorous mathematical approach to compute the roots of cubic equations, ensuring accurate and reliable results.

The algorithm employed by the program proceeds through several distinct steps. Firstly, it computes the discriminant delta0 and delta1 using the input coefficients, which are instrumental in determining the nature of the roots. The discriminant plays a critical role in classifying the cubic equation into different cases.

The code then examines the value of the discriminant to identify the specific type of roots present. Three scenarios are considered:

    In the case where both delta0 and delta1 are zero, the equation possesses one real root and two complex conjugate roots. The program proceeds to calculate the real and imaginary parts of the complex roots using appropriate formulas, and subsequently provides the three roots as output.

    If the discriminant is greater than zero, the cubic equation exhibits three distinct real roots. The program computes the values of C and D using cubic root operations, and then determines the roots using the corresponding equations. The three real roots are returned as the output of the program.

    When the discriminant is less than zero, the equation possesses one real root and two complex conjugate roots. The program computes C and D using cubic root and inverse cosine operations respectively, and subsequently evaluates the roots employing trigonometric functions. The resulting real and complex roots are then presented as output.

Throughout the computation process, the code makes use of standard mathematical functions provided by the Java programming language, such as Math.sqrt, Math.cbrt, and Math.acos, ensuring accurate calculations.
