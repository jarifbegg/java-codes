package Arrayavg;

public class Arrayavg { 
    
    public static void main( String args[] ) {  
        
        int [] num;  
          
        num = new int[]{21,0,99,17,76,7,24,662};  
      
        for (int i = 0; i < 4; i++)  
        {  
            System.out.println(num[i]);  
        }  
        
        int length = num.length;
 
        int sum = 0;
 
        for (int i = 0; i < num.length; i++) {
            sum += num[i];
        }
 
        double average = sum / length;
         
        System.out.println("Average of array : "+average);
        
        
   }  
  
}  