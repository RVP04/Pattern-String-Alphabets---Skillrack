import java.util.*;
public class Hello {

    public static void main(String[] args) {
	
	    Scanner input = new Scanner(System.in);
	    String inputString = input.next();
	    
	    System.out.println(inputString);
        int stringLength = inputString.length();
       
        String temp = " ";
        for(int i =1;i<=stringLength;i++)
        {
            temp = inputString.substring(i,stringLength);
            temp+= inputString.substring(0,i);
            System.out.println(temp);
        }
        
	}
}
