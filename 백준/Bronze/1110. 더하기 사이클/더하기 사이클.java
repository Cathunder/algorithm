import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	    
	    int A = Integer.parseInt(br.readLine());
	    int newA = 0;
	    int count = 0;
	    
	    while(true) {
	    	if(count == 0) {
	    		int quot = A / 10;
		    	int remain = A % 10;
		    	int sum = quot + remain;
		    	newA = (remain * 10) + (sum % 10);
	    	} else {
	    		int quot = newA / 10;
	    		int remain = newA % 10;
	    		int sum = quot + remain;
	    		newA = (remain * 10) + (sum % 10);
	    	}
	    	
	    	count++;
	    	if(newA == A) {
	    		break;
	    	}
	    }
	    
	    bw.write(count + "\n");
	    	    
    	bw.flush();
    	bw.close();
    	br.close();
    }
}