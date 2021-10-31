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
public class faculty extends employeee{
 
        public faculty(String n) {
        super(n);
        }

        String officeHours, rank;
        
        public String toString() {
        return "Faculty: " + name;
        }
    }
    
}
