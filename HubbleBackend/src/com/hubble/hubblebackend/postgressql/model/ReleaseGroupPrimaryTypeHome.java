package com.hubble.hubblebackend.postgressql.model;

// Generated Sep 7, 2015 5:12:36 PM by Hibernate Tools 3.4.0.CR1

import java.util.List;
import javax.naming.InitialContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Example;

/**
 * Home object for domain model class ReleaseGroupPrimaryType.
 * @see com.hubble.hubblebackend.postgressql.model.ReleaseGroupPrimaryType
 * @author Hibernate Tools
 */
public class ReleaseGroupPrimaryTypeHome {

	private static final Log log = LogFactory
			.getLog(ReleaseGroupPrimaryTypeHome.class);

	private final SessionFactory sessionFactory = getSessionFactory();

	protected SessionFactory getSessionFactory() {
		try {
			return (SessionFactory) new InitialContext()
					.lookup("SessionFactory");
		} catch (Exception e) {
			log.error("Could not locate SessionFactory in JNDI", e);
			throw new IllegalStateException(
					"Could not locate SessionFactory in JNDI");
		}
	}

	public void persist(ReleaseGroupPrimaryType transientInstance) {
		log.debug("persisting ReleaseGroupPrimaryType instance");
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(ReleaseGroupPrimaryType instance) {
		log.debug("attaching dirty ReleaseGroupPrimaryType instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(ReleaseGroupPrimaryType instance) {
		log.debug("attaching clean ReleaseGroupPrimaryType instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(ReleaseGroupPrimaryType persistentInstance) {
		log.debug("deleting ReleaseGroupPrimaryType instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public ReleaseGroupPrimaryType merge(
			ReleaseGroupPrimaryType detachedInstance) {
		log.debug("merging ReleaseGroupPrimaryType instance");
		try {
			ReleaseGroupPrimaryType result = (ReleaseGroupPrimaryType) sessionFactory
					.getCurrentSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public ReleaseGroupPrimaryType findById(int id) {
		log.debug("getting ReleaseGroupPrimaryType instance with id: " + id);
		try {
			ReleaseGroupPrimaryType instance = (ReleaseGroupPrimaryType) sessionFactory
					.getCurrentSession()
					.get("com.hubble.hubblebackend.postgressql.model.ReleaseGroupPrimaryType",
							id);
			if (instance == null) {
				log.debug("get successful, no instance found");
			} else {
				log.debug("get successful, instance found");
			}
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(ReleaseGroupPrimaryType instance) {
		log.debug("finding ReleaseGroupPrimaryType instance by example");
		try {
			List results = sessionFactory
					.getCurrentSession()
					.createCriteria(
							"com.hubble.hubblebackend.postgressql.model.ReleaseGroupPrimaryType")
					.add(Example.create(instance)).list();
			log.debug("find by example successful, result size: "
					+ results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}
}
