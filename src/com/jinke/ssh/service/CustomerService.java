package com.jinke.ssh.service;

import com.jinke.ssh.domain.Customer;

import java.util.List;

/**
 * 客户管理的业务层的接口
 */
public interface CustomerService {

    void save(Customer customer);

    void update(Customer customer);

    void delete(Customer customer);

    Customer findById(int id);

    List<Customer> findAllByHQL();

    List<Customer> findAllByQBC();

    List<Customer> findAllByName();
}
