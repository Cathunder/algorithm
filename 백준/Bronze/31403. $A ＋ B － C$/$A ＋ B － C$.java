import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int A = Integer.parseInt(br.readLine());
        int B = Integer.parseInt(br.readLine());
        int C = Integer.parseInt(br.readLine());
        System.out.println(A + B - C);

        String bind = String.valueOf(A) + String.valueOf(B);
        System.out.println(Integer.parseInt(bind) - C);

        br.close();
    }
}