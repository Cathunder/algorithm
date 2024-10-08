import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int input = Integer.parseInt(br.readLine());

        int cnt = 0;
        int num = 1;
        while(true) {
            if(String.valueOf(num).contains("666")) {
                cnt++;
            }

            if (cnt == input) {
                System.out.println(num);
                break;
            }

            num++;
        }

        br.close();
    }
}