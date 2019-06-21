package com.jinke.ssh.dao.impl;

import com.jinke.ssh.dao.CustomerDao;
import com.jinke.ssh.domain.Customer;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

/**
 * DAO层的实现类
 */
public class CustomerDaoImpl extends HibernateDaoSupport implements CustomerDao {
    @Override
    public void save(Customer customer) {
        System.out.println("DAO中的save方法被执行了");
        this.getHibernateTemplate().save(customer);
    }
}
