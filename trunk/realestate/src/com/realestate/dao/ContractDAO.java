package com.realestate.dao;

import com.realestate.pojo.Contract;

import java.util.Date;
import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.criterion.Example;

/**
 * ATESTZZX data access object (DAO) providing persistence and search support for
 * Contract entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.realestate.pojo.Contract
 * @author MyEclipse Persistence Tools
 */

public class ContractDAO extends BaseHibernateDAO {
	private static final Log log = LogFactory.getLog(ContractDAO.class);
	// property constants
	public static final String STATUS = "status";

	public void save(Contract transientInstance) {
		log.debug("saving Contract instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(Contract persistentInstance) {
		log.debug("deleting Contract instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Contract findById(java.lang.Integer id) {
		log.debug("getting Contract instance with id: " + id);
		try {
			Contract instance = (Contract) getSession().get(
					"com.realestate.pojo.Contract", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(Contract instance) {
		log.debug("finding Contract instance by example");
		try {
			List results = getSession().createCriteria(
					"com.realestate.pojo.Contract").add(
					Example.create(instance)).list();
			log.debug("find by example successful, result size: "
					+ results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	public List findByProperty(String propertyName, Object value) {
		log.debug("finding Contract instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from Contract as model where model."
					+ propertyName + "= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByStatus(Object status) {
		return findByProperty(STATUS, status);
	}

	public List findAll() {
		log.debug("finding all Contract instances");
		try {
			String queryString = "from Contract";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public Contract merge(Contract detachedInstance) {
		log.debug("merging Contract instance");
		try {
			Contract result = (Contract) getSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(Contract instance) {
		log.debug("attaching dirty Contract instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Contract instance) {
		log.debug("attaching clean Contract instance");
		try {
			getSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}