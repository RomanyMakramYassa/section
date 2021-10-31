/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assig.pkg1;
import java.util.Scanner;
/**
 *
 * @author roman
 */
public class Assig1 {

    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // TODO code application logic here
        Scanner in=new Scanner (System.in);
        System.out.println("enter a string to person");
        String p1=in.next();
        System.out.println("enter a string to student");
        String p2=in.next();
        System.out.println("enter a string to employee");
        String p3=in.next();
        System.out.println("enter a string to faculty");
        String p4=in.next();
        System.out.println("enter a string to staff");
        String p5=in.next();
        person per1 = new person(p1);
        
        student s1 = new student(p2);
        employeee e1 = new employeee(p3);
         faculty f1= new faculty(p4);
        staff st1 = new staff(p5);
       person people[] = { per1,  s1, e1, f1, st1 };
        for (person p : people)
        System.out.println(p);
        
    }
    }
    
