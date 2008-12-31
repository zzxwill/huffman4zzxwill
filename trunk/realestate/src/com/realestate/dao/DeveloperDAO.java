package com.realestate.dao;

import com.realestate.pojo.Developer;

import java.util.List;
import java.util.Set;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.criterion.Example;

/**
 * ATESTZZX data access object (DAO) providing persistence and search support for
 * Developer entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.realestate.pojo.Developer
 * @author MyEclipse Persistence Tools
 */

public class DeveloperDAO extends BaseHibernateDAO {
	private static final Log log = LogFactory.getLog(DeveloperDAO.class);
	// property constants
	public static final String ADDRESS = "address";
	public static final String URL = "url";
	public static final String TELEPHONE = "telephone";
	public static final String INFORMATION = "information";
	public static final String POST = "post";
	public static final String EMAIL = "email";
	public static final String RANK = "rank";
	public static final String LICENSE = "license";
	public static final String COMPANY_NAME = "companyName";
	public static final String PASSWORD = "password";
	public static final String NAME = "name";
	public static final String STATUS = "status";

	public void save(Developer transientInstance) {
		log.debug("saving Developer instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(Developer persistentInstance) {
		log.debug("deleting Developer instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Developer findById(java.lang.Integer id) {
		log.debug("getting Developer instance with id: " + id);
		try {
			Developer instance = (Developer) getSession().get(
					"com.realestate.pojo.Developer", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(Developer instance) {
		log.debug("finding Developer instance by example");
		try {
			List results = getSession().createCriteria(
					"com.realestate.pojo.Developer").add(
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
		log.debug("finding Developer instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from Developer as model where model."
					+ propertyName + "= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByAddress(Object address) {
		return findByProperty(ADDRESS, address);
	}

	public List findByUrl(Object url) {
		return findByProperty(URL, url);
	}

	public List findByTelephone(Object telephone) {
		return findByProperty(TELEPHONE, telephone);
	}

	public List findByInformation(Object information) {
		return findByProperty(INFORMATION, information);
	}

	public List findByPost(Object post) {
		return findByProperty(POST, post);
	}

	public List findByEmail(Object email) {
		return findByProperty(EMAIL, email);
	}

	public List findByRank(Object rank) {
		return findByProperty(RANK, rank);
	}

	public List findByLicense(Object license) {
		return findByProperty(LICENSE, license);
	}

	public List findByCompanyName(Object companyName) {
		return findByProperty(COMPANY_NAME, companyName);
	}

	public List findByPassword(Object password) {
		return findByProperty(PASSWORD, password);
	}

	public List findByName(Object name) {
		return findByProperty(NAME, name);
	}

	public List findByStatus(Object status) {
		return findByProperty(STATUS, status);
	}

	public List findAll() {
		log.debug("finding all Developer instances");
		try {
			String queryString = "from Developer";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public Developer merge(Developer detachedInstance) {
		log.debug("merging Developer instance");
		try {
			Developer result = (Developer) getSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(Developer instance) {
		log.debug("attaching dirty Developer instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Developer instance) {
		log.debug("attaching clean Developer instance");
		try {
			getSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
	public List findAllListByPage(int pageSize,int pageNumber){
		   log.debug("finding Developer instance with pageSize and pageNumber");
		   try{
		    String queryString="from Developer order by id";
		    Query queryObject=getSession().createQuery(queryString);
		    queryObject.setFirstResult(pageSize*pageNumber);
		    queryObject.setMaxResults(pageSize);
		    return queryObject.list();
		   }catch(RuntimeException re){
		    log.error("find all failed");
		    throw re;
		   }
		}
}