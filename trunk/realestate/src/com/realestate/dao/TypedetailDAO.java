package com.realestate.dao;

import com.realestate.pojo.Typedetail;

import java.util.List;
import java.util.Set;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.criterion.Example;

/**
 * ATESTZZX data access object (DAO) providing persistence and search support for
 * Typedetail entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.realestate.pojo.Typedetail
 * @author MyEclipse Persistence Tools
 */

public class TypedetailDAO extends BaseHibernateDAO {
	private static final Log log = LogFactory.getLog(TypedetailDAO.class);
	// property constants
	public static final String TYPE = "type";

	public void save(Typedetail transientInstance) {
		log.debug("saving Typedetail instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(Typedetail persistentInstance) {
		log.debug("deleting Typedetail instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Typedetail findById(java.lang.Short id) {
		log.debug("getting Typedetail instance with id: " + id);
		try {
			Typedetail instance = (Typedetail) getSession().get(
					"com.realestate.pojo.Typedetail", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(Typedetail instance) {
		log.debug("finding Typedetail instance by example");
		try {
			List results = getSession().createCriteria(
					"com.realestate.pojo.Typedetail").add(
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
		log.debug("finding Typedetail instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from Typedetail as model where model."
					+ propertyName + "= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByType(Object type) {
		return findByProperty(TYPE, type);
	}

	public List findAll() {
		log.debug("finding all Typedetail instances");
		try {
			String queryString = "from Typedetail";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public Typedetail merge(Typedetail detachedInstance) {
		log.debug("merging Typedetail instance");
		try {
			Typedetail result = (Typedetail) getSession().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(Typedetail instance) {
		log.debug("attaching dirty Typedetail instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Typedetail instance) {
		log.debug("attaching clean Typedetail instance");
		try {
			getSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}