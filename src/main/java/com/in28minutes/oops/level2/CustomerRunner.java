package com.in28minutes.oops.level2;

public class CustomerRunner {
    public static void main(String[] args) {

        Address homeAddress = new Address("line 1", "Hyderabad", "500035");
        Customer customer = new Customer("Ranga", homeAddress);
        System.out.println(customer);

        Address workAddress = new Address("line 1 for work", "Hyderabad", "500060");
        customer.setWorkAddress(workAddress);
        System.out.println(customer);

        customer.setWorkAddress(new Address("line 2 for work","Hyderabad 2", "500080"));
        System.out.println(customer);

        homeAddress.modifyAddress("line 3", "Hyderabad 3", "500055");
        System.out.println(customer);
    }
}
