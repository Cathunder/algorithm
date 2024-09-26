import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
	    int dice_1 = sc.nextInt();
	    int dice_2 = sc.nextInt();
	    int dice_3 = sc.nextInt();  
	    
	    if(dice_1 == dice_2 && dice_2 == dice_3 && dice_3 == dice_1) {
	    	System.out.println(10000 + dice_1*1000);
	    	
	    } else if(dice_1 == dice_2 && dice_3 != dice_1 && dice_3 != dice_2) {
	    	System.out.println(1000 + dice_1*100);
	    	
	    } else if(dice_2 == dice_3 && dice_1 != dice_2 && dice_1 != dice_3) {
	    	System.out.println(1000 + dice_2*100);
	    	
	    } else if(dice_3 == dice_1 && dice_2 != dice_1 && dice_2 != dice_3) {
	    	System.out.println(1000 + dice_3*100);
	    	
	    } else if(dice_1 != dice_2 && dice_2 != dice_3 && dice_3 != dice_1) {
	    	if(dice_1 > dice_2 && dice_1 > dice_3) {
	    		System.out.println(dice_1*100);
	    	} else if (dice_2 > dice_1 && dice_2 > dice_3) {
	    		System.out.println(dice_2*100);	    		
	    	} else if (dice_3 > dice_1 && dice_3 > dice_2) {
	    		System.out.println(dice_3*100);
	    	} else {
	    		System.out.println("error1");
	    	}
	    	
	    } else {
	    	System.out.println("error2");
	    }
        
	    sc.close();
    }
}