/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package c0722199_midterm_mads3464;

/**
 *
 * @author macstudent
 */
public class LambtonStringTools
{
  public void reverse(String s)
  {
        StringBuilder b = new StringBuilder();
        b.append(s);
        b = b.reverse();
        System.out.println(b);
  }  
  
  
   public void BinaryToDecimal(String b)
   {
    
     int decimal=Integer.parseInt(b,2);  
     System.out.println(decimal);  
   
   }
      String s1;
    public void initials(String s)
        {
            
            this.s1= s;
            String initi;
            char t;
            String[] split = s.split(" ",2);
            
            for (int i=0; i<split.length; i++)
            {   
                initi =split[i];
                t=initi.charAt(0);
                
                System.out.println(" " + (split[i].charAt(0))+ "." );
              
            }  
            }
            public void mostFrequent()
    {
        String S="jass";
      char[] array = S.toCharArray();
      int count = 1;
      int max = 0;
      char maxc = 0;
    for(int i=1; i<array.length; i++){ 
    if(array[i]==array[i-1]){
        count++;
    } else {
        if(count>max){  
            max=count;
            maxc=array[i-1];
        }
        count = 1; 
    }
}
if(count>max){
    
    maxc=array[array.length-1];
}
System.out.println( "Most Frequent character is "+maxc); 
    
    
    
    }

    
    
}



    

    



