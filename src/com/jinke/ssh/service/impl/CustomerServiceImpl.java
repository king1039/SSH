package com.jinke.ssh.service.impl;

import com.jinke.ssh.dao.CustomerDao;
import com.jinke.ssh.domain.Customer;
import com.jinke.ssh.service.CustomerService;
import org.springframework.transaction.annotation.Transactional;

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
}
