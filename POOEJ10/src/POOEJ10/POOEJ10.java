package POOEJ10;

import java.util.Arrays;
import java.util.Random;

public class POOEJ10 {
    public static void main(String[] args) throws Exception {
        double [] A = new double[50];
        double [] B = new double[20];
        Random random = new Random();
        for (int i = 0; i < A.length; i++) A[i] = random.nextInt(10);
        Arrays.sort(A);
        for (int i = 0; i < 11; i++) B[i] = A[i];
        Arrays.fill(B, 11, B.length, 0.5);

        for (int i = 0; i < A.length; i++) System.out.println("A["+i+"] = " + A[i] );
        for (int i = 0; i < B.length; i++) System.out.println("B["+i+"] = " + B[i] );
    }
}
