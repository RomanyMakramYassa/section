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
public class staff extends employeee{
        public staff(String n) {
        super(n);
        }

        String title;

        @Override
        public String toString() {
        return "Staff " + name;
        }
    }
    
