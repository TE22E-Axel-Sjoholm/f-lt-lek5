import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        int rumnr = 0;
        int steg = 0;

        Scanner tb = new Scanner(System.in);
        int[][] rum = new int[5][5];
        
        rum[2][3] = 1;

        System.out.println(rum[0][0]+""+rum[1][0]+""+rum[2][0]+""+rum[3][0]+""+rum[4][0]);
        System.out.println(rum[0][1]+""+rum[1][1]+""+rum[2][1]+""+rum[3][1]+""+rum[4][1]);
        System.out.println(rum[0][2]+""+rum[1][2]+""+rum[2][2]+""+rum[3][2]+""+rum[4][2]);
        System.out.println(rum[0][3]+""+rum[1][3]+""+rum[2][3]+""+rum[3][3]+""+rum[4][3]);



    }
}
