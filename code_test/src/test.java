import java.util.Scanner;

public class test {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        StringBuilder[] sb = new StringBuilder[201];

        for (int i = 0; i<sb.length; i++){
            sb[i] = new StringBuilder();
        }

        for (int i = 0; i<n; i++){
            int age = sc.nextInt();
            String name = sc.next();

            sb[age].append(age).append(' ').append(name).append('\n');
        }

        StringBuilder print = new StringBuilder();
        for (StringBuilder val : sb){
            print.append(val);
        }
    }
}
