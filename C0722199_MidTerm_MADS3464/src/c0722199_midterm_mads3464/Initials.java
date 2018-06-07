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
public class Initials 

{
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
            }
