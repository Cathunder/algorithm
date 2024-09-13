import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int result = 0;
        while(st.hasMoreTokens()) {
            result += (int) Math.pow(Integer.parseInt(st.nextToken()), 2);
        }
        System.out.println(result % 10);

        br.close();
    }
}