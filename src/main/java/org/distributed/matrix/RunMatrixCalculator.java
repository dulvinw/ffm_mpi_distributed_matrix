package org.distributed.matrix;

public class RunMatrixCalculator {
    public static void main(String[] args) {
        IntMatrixCalculator intCalculator = new IntMatrixCalculator();
        System.out.printf("Multiply: %d%n", intCalculator.multiply());
    }
}
