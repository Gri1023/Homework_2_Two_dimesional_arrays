import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
    int A [][] = new int [7][6];
    //setting values
    for (int r=0;r<5;r++) {
        A[0][r+1] = r;
    }
    for (int c=0;c<6;c++) {
        A[c+1][0] = c;
    }
    A[3][1] = -19;
    A[4][3] = 7;
    A[6][4] = 22;
    //printing result
    for (int[ ] i : A) {
        System.out.println(Arrays.toString(i));
    }
    }
}