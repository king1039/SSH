package com.jinke.ssh.service.impl;

import com.jinke.ssh.dao.CustomerDao;
import com.jinke.ssh.domain.Customer;
import com.jinke.ssh.service.CustomerService;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * 业务层的实现类
 */
@Transactional
public class CustomerServiceImpl implements CustomerService {

    //注入DAO
    private CustomerDao customerDao;

    public void setCustomerDao(CustomerDao customerDao) {
        this.customerDao = customerDao;
    }

    @Override
    public void save(Customer customer) {
        System.out.println("Service中的save方法执行了");
        customerDao.save(customer);
    }

    @Override
    public void update(Customer customer) {
        System.out.println("Service中的update方法执行了");
        customerDao.update(customer);
    }

    @Override
    public void delete(Customer customer) {
        System.out.println("Service中的delete方法执行了");
        customerDao.delete(customer);
    }

    @Override
    public Customer findById(int id) {
        System.out.println("Service中的findById方法执行了");
        return customerDao.findById(id);
    }

    @Override
    public List<Customer> findAllByHQL() {
        System.out.println("Service中的findAllByHQL方法执行了");
        return customerDao.findAllByHQL();
    }

    @Override
    public List<Customer> findAllByQBC() {
        System.out.println("Service中的方法执行了");
        return customerDao.findAllByQBC();
    }

    @Override
    public List<Customer> findAllByName() {
        return customerDao.findAllByName();
    }
}
