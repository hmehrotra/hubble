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
 * Home object for domain model class ReleaseGroupSecondaryType.
 * @see com.hubble.hubblebackend.postgressql.model.ReleaseGroupSecondaryType
 * @author Hibernate Tools
 */
public class ReleaseGroupSecondaryTypeHome {

	private static final Log log = LogFactory
			.getLog(ReleaseGroupSecondaryTypeHome.class);

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

	public void persist(ReleaseGroupSecondaryType transientInstance) {
		log.debug("persisting ReleaseGroupSecondaryType instance");
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(ReleaseGroupSecondaryType instance) {
		log.debug("attaching dirty ReleaseGroupSecondaryType instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(ReleaseGroupSecondaryType instance) {
		log.debug("attaching clean ReleaseGroupSecondaryType instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(ReleaseGroupSecondaryType persistentInstance) {
		log.debug("deleting ReleaseGroupSecondaryType instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public ReleaseGroupSecondaryType merge(
			ReleaseGroupSecondaryType detachedInstance) {
		log.debug("merging ReleaseGroupSecondaryType instance");
		try {
			ReleaseGroupSecondaryType result = (ReleaseGroupSecondaryType) sessionFactory
					.getCurrentSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public ReleaseGroupSecondaryType findById(int id) {
		log.debug("getting ReleaseGroupSecondaryType instance with id: " + id);
		try {
			ReleaseGroupSecondaryType instance = (ReleaseGroupSecondaryType) sessionFactory
					.getCurrentSession()
					.get("com.hubble.hubblebackend.postgressql.model.ReleaseGroupSecondaryType",
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

	public List findByExample(ReleaseGroupSecondaryType instance) {
		log.debug("finding ReleaseGroupSecondaryType instance by example");
		try {
			List results = sessionFactory
					.getCurrentSession()
					.createCriteria(
							"com.hubble.hubblebackend.postgressql.model.ReleaseGroupSecondaryType")
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
