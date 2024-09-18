import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        System.out.println(GCD(a, b));
        System.out.println(LCM(a, b));
        br.close();
    }

    public static int GCD(int a, int b) {
        return b == 0 ? a : GCD(b, a % b);
    }

    public static int LCM(int a, int b) {
        return (a * b) / GCD(a, b);
    }
}