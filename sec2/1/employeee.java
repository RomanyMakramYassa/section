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
public class employeee extends person {
       public employeee(String a) {
        super(a);
        }

        String office, hireDate;
        double salary;

        @Override
        public String toString() {
        return "Employee: " + name;
        }
    }

//}
//public class faculty extends employeee{
//
//      public faculty(String a) 
//      {
//          super(a);
//        }
//
//        String officeHours, rank;
//
//        @Override
//        public String toString() {
//        return "Faculty: " + name;
//        }
//    }
    

