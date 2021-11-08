/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agreee.pkg2;

/**
 *
 * @author roman
 */
public class Agreee2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
          address addrs1=new address(555,"Mina","Egypt");
       subject subj1=new subject(123,"java",3);
       
       student stud1=new student(1234,3.2,"atif",subj1,addrs1);
       stud1.display();
    }
    
}
