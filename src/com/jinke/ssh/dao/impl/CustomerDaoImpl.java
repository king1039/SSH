package com.jinke.ssh.dao.impl;

import com.jinke.ssh.dao.CustomerDao;
import com.jinke.ssh.domain.Customer;
import org.hibernate.criterion.DetachedCriteria;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

import java.util.List;

/**
 * DAO层的实现类
 */
public class CustomerDaoImpl extends HibernateDaoSupport implements CustomerDao {
    @Override
    public void save(Customer customer) {
        System.out.println("DAO中的save方法被执行了");
        this.getHibernateTemplate().save(customer);
    }

    @Override
    public void update(Customer customer) {
        this.getHibernateTemplate().update(customer);
    }

    @Override
    public void delete(Customer customer) {
        this.getHibernateTemplate().delete(customer);
    }

    @Override
    public Customer findById(int id) {
        Customer customer = this.getHibernateTemplate().load(Customer.class, id);
        return customer;
    }

    @Override
    public List<Customer> findAllByHQL() {
        List<Customer> list = (List<Customer>) this.getHibernateTemplate().find("from Customer");
        return list;
    }

    @Override
    public List<Customer> findAllByQBC() {
        //自带分页
        DetachedCriteria criteria = DetachedCriteria.forClass(Customer.class);
        List<Customer> list = (List<Customer>) this.getHibernateTemplate().findByCriteria(criteria);
        return list;
    }

    @Override
    public List<Customer> findAllByName() {
        return (List<Customer>) this.getHibernateTemplate().findByNamedQuery("queryAll");
    }
}
