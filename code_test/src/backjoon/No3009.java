package backjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class No3009 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] x = new int[3];
        int[] y = new int[3];

        x[0] = Integer.parseInt(st.nextToken());
        y[0] = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());

        x[1] = Integer.parseInt(st.nextToken());
        y[1] = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());

        x[2] = Integer.parseInt(st.nextToken());
        y[2] = Integer.parseInt(st.nextToken());

        int a, b;

        if( x[0] == x[1]){
            a = x[2];
        } else if (x[0] == x[2]){
            a = x[1];
        } else a = x[0];

        if( y[0] == y[1]){
            b = y[2];
        } else if (y[0] == y[2]){
            b = y[1];
        } else b = y[0];

        System.out.println(a + " "+ b);
    }
}
