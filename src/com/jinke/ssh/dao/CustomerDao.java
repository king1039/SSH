package com.jinke.ssh.dao;

import com.jinke.ssh.domain.Customer;

/**
 * DAO层的接口
 */
public interface CustomerDao {
    void save(Customer customer);
}
