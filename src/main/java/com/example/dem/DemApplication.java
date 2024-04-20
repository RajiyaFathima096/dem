package com.example.dem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.dem.entity.Customer;
import com.example.dem.repository.CustomerRepository;

@SpringBootApplication
public class DemApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(DemApplication.class, args);
    }

    @Autowired
    private CustomerRepository customerRepository;

    @Override
    public void run(String  args[]) throws Exception {
        Customer customer1 = new Customer("John", "Doe", "john@example.com");
        //customerRepository.save(customer1);
        Customer customer2 = new Customer("Jane", "Doe", "jane@example.com");
        //customerRepository.save(customer2);
        // Add more sample customers if needed
    }
}
