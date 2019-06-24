package com.jinke.ssh.web.action;

import com.jinke.ssh.domain.Customer;
import com.jinke.ssh.service.CustomerService;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

/**
 * 客户管理的Action的类
 */
public class CustomerAction extends ActionSupport implements ModelDriven<Customer> {
    //模型驱动使用的对象
    private Customer customer = new Customer();

    @Override
    public Customer getModel() {

        return customer;
    }

    //注入customerService
    private CustomerService customerService;

    public void setCustomerService(CustomerService customerService) {
        this.customerService = customerService;
    }

    /**
     * 报错客户的方法
     */
    public String save() {
        System.out.println("Action中的save方法执行了...");
        customerService.save(customer);
        return NONE;
    }

    public String findById() {
        Customer customer = customerService.findById(2);
        customer.setName("延迟");
        return NONE;
    }
}
