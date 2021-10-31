/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assig.pkg1;

/**
 *
 * @author roman
 */
   public class student extends person {
        student(String a) {
        super(a);
        }

        enum Status {
        freshman, sophomore, junior, senior
        }

        Status classStatus;

        @Override
        public String toString() {
        return "Student: " + name;
        }
    }  
    
