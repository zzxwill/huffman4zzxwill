package com.realestate.dao;

import java.util.List;
import java.util.Set;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.criterion.Example;

import com.realestate.pojo.Estate;

/**
 * ATESTZZX data access object (DAO) providing persistence and search support for
 * Estate entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.realestate.pojo.Estate
 * @author MyEclipse Persistence Tools
 */

public class EstateDAO extends BaseHibernateDAO {
	private static final Log log = LogFactory.getLog(EstateDAO.class);
	// property constants
	public static final String NAME = "name";
	public static final String LOCATION = "location";
	public static final String GREEN_RATE = "greenRate";
	public static final String TRAFFIC = "traffic";
	public static final String ENVIRONMENT = "environment";
	public static final String IMAGE = "image";
	public static final String TOTAL = "total";
	public static final String PRESALE = "presale";
	public static final String SOLD = "sold";
	public static final String AVG_PRICE = "avgPrice";
	public static final String START_PRICE = "startPrice";

	public void save(Estate transientInstance) {
		log.debug("saving Estate instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(Estate persistentInstance) {
		log.debug("deleting Estate instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Estate findById(java.lang.Integer id) {
		log.debug("getting Estate instance with id: " + id);
		try {
			Estate instance = (Estate) getSession().get(
					"com.realestate.pojo.Estate", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(Estate instance) {
		log.debug("finding Estate instance by example");
		try {
			List results = getSession().createCriteria(
					"com.realestate.pojo.Estate").add(Example.create(instance))
					.list();
			log.debug("find by example successful, result size: "
					+ results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	public List findByProperty(String propertyName, Object value) {
		log.debug("finding Estate instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from Estate as model where model."
					+ propertyName + "= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByName(Object name) {
		return findByProperty(NAME, name);
	}

	public List findByLocation(Object location) {
		return findByProperty(LOCATION, location);
	}

	public List findByGreenRate(Object greenRate) {
		return findByProperty(GREEN_RATE, greenRate);
	}

	public List findByTraffic(Object traffic) {
		return findByProperty(TRAFFIC, traffic);
	}

	public List findByEnvironment(Object environment) {
		return findByProperty(ENVIRONMENT, environment);
	}

	public List findByImage(Object image) {
		return findByProperty(IMAGE, image);
	}

	public List findByTotal(Object total) {
		return findByProperty(TOTAL, total);
	}

	public List findByPresale(Object presale) {
		return findByProperty(PRESALE, presale);
	}

	public List findBySold(Object sold) {
		return findByProperty(SOLD, sold);
	}

	public List findByAvgPrice(Object avgPrice) {
		return findByProperty(AVG_PRICE, avgPrice);
	}

	public List findByStartPrice(Object startPrice) {
		return findByProperty(START_PRICE, startPrice);
	}

	public List findAll() {
		log.debug("finding all Estate instances");
		try {
			String queryString = "from Estate";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public Estate merge(Estate detachedInstance) {
		log.debug("merging Estate instance");
		try {
			Estate result = (Estate) getSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(Estate instance) {
		log.debug("attaching dirty Estate instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Estate instance) {
		log.debug("attaching clean Estate instance");
		try {
			getSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public List findAllListByPage(int pageSize, int pageNumber) {
		log.debug("finding Estates instance with pageSize and pageNumber");
		try {
			String queryString = "from Estate order by id";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setFirstResult(pageSize * pageNumber);
			queryObject.setMaxResults(pageSize);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed");
			throw re;
		}
	}
	public List findPropertyLike(String propertyName, String value) {
		log.debug("finding Estate instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from Estate as model where model."
					+ propertyName + " like ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, "%"+value+"%");
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}
	
	public List findValueBetween(String propertyName, Integer from,Integer to) {
		log.debug("finding Estate instance with property: " + propertyName
				);
		try {Query queryObject;
			String queryString;
			if(from==null){
				queryString= "from Estate as model where model."
					+ propertyName + "< ?";
				queryObject=getSession().createQuery(queryString);
				queryObject.setParameter(0, to);
			}
			else if(to==null){
				queryString= "from Estate as model where model."
					+ propertyName + ">= ?";
				queryObject=getSession().createQuery(queryString);
				queryObject.setParameter(0, from);
			}
			else {
				queryString= "from Estate as model where model."
					+ propertyName + ">= ? and model."+ propertyName+"< ?";
				queryObject=getSession().createQuery(queryString);
				queryObject.setParameter(0, from);
				queryObject.setParameter(1, to);
			}
			
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

}