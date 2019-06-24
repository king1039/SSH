package com.jinke.ssh.dao;

import com.jinke.ssh.domain.Customer;

import java.util.List;

/**
 * DAO层的接口
 */
public interface CustomerDao {
    void save(Customer customer);

    void update(Customer customer);

    void delete(Customer customer);

    Customer findById(int id);

    List<Customer> findAllByHQL();

    List<Customer> findAllByQBC();

    List<Customer> findAllByName();
}
