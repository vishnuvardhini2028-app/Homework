/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Marks;


public class GradeConvert implements Grade
{
   Totalmark totalmark;
   //Grade grade;
   
   
   public GradeConvert(Totalmark totalmark)
   {
       this.totalmark=totalmark;
       
       
   }    

    
@Override
    public String getGrade() 
    {
           int mrk=totalmark.totalmarks();
       if(mrk>90)
       {
           return("A grade");
       }
       else if(mrk>=75)
       {
          return("B grade");
       }
       else if(mrk>=65)
       {
          return("C grade");
       }
       else if(mrk>=50)
       {
          return("D grade");
       }
       else
       {
           return("F grade");
       }
      
    }   

    
}


