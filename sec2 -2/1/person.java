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
public class person {
    
        String name, address, phoneNumber, email;

 public person (String m)
 {
        this.name = m;
        
        }

        @Override
        public String toString() {
        return "Person " + name;
        }
    }
 
