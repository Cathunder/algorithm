import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int input = Integer.parseInt(br.readLine());

        int cnt = 0;
        for (int i = 5; i <= input; i = i * 5) {
            cnt += input / i;
        }
        System.out.println(cnt);

        br.close();
    }
}