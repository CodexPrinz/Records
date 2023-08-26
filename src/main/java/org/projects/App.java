package org.projects;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "--------- Records in Java! ---------\n" );

        Customer customer = new Customer("Kofi", "Tom");

        System.out.println(customer);
        System.out.println("first name: "+customer.firstName());
        System.out.println("last name: "+customer.lastName());

        System.out.println("is first name equal to last name? "+customer.firstName().equals(customer.lastName()));

        System.out.println("-- Employee --");
        Employee employee = new Employee(123,"James", "Bond");
        System.out.println(employee);
        System.out.println(employee.firstNameUppercase());
    }
}
