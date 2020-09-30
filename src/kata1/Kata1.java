/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kata1;

import java.time.LocalDate;
import java.time.Month;

/**
 *
 * @author hugob
 */
public class Kata1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Person person = new Person("Juan Fernandez",LocalDate.of(1997, Month.AUGUST, 30));
        System.out.println(person.getName()+" tiene "+person.getAge()+ " años");
    }
    
}
