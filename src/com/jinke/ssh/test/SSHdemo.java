package com.jinke.ssh.test;

import com.jinke.ssh.domain.Customer;
import com.jinke.ssh.service.CustomerService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class SSHdemo {

    @Resource
    private CustomerService customerService;

    @Test
    public void update() {
        Customer customer = customerService.findById(3);
        customer.setName("三石");
        customerService.update(customer);
    }

    @Test
    public void delete() {
        Customer customer = customerService.findById(1);
        customerService.delete(customer);
    }

    @Test
    public void findAllByHQL() {
        List<Customer> customerList = customerService.findAllByHQL();
        for (Customer customer : customerList) {
            System.out.println(customer);
        }
    }

    @Test
    public void findAllByQBC() {
        List<Customer> customerList = customerService.findAllByQBC();
        for (Customer customer : customerList) {
            System.out.println(customer);
        }
    }

    @Test
    public void findAllByName() {
        List<Customer> customerList = customerService.findAllByName();
        for (Customer customer : customerList) {
            System.out.println(customer);
        }
    }
}
