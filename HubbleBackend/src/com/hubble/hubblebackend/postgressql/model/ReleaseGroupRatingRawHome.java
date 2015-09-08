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
 * Home object for domain model class ReleaseGroupRatingRaw.
 * @see com.hubble.hubblebackend.postgressql.model.ReleaseGroupRatingRaw
 * @author Hibernate Tools
 */
public class ReleaseGroupRatingRawHome {

	private static final Log log = LogFactory
			.getLog(ReleaseGroupRatingRawHome.class);

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

	public void persist(ReleaseGroupRatingRaw transientInstance) {
		log.debug("persisting ReleaseGroupRatingRaw instance");
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(ReleaseGroupRatingRaw instance) {
		log.debug("attaching dirty ReleaseGroupRatingRaw instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(ReleaseGroupRatingRaw instance) {
		log.debug("attaching clean ReleaseGroupRatingRaw instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(ReleaseGroupRatingRaw persistentInstance) {
		log.debug("deleting ReleaseGroupRatingRaw instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public ReleaseGroupRatingRaw merge(ReleaseGroupRatingRaw detachedInstance) {
		log.debug("merging ReleaseGroupRatingRaw instance");
		try {
			ReleaseGroupRatingRaw result = (ReleaseGroupRatingRaw) sessionFactory
					.getCurrentSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public ReleaseGroupRatingRaw findById(
			com.hubble.hubblebackend.postgressql.model.ReleaseGroupRatingRawId id) {
		log.debug("getting ReleaseGroupRatingRaw instance with id: " + id);
		try {
			ReleaseGroupRatingRaw instance = (ReleaseGroupRatingRaw) sessionFactory
					.getCurrentSession()
					.get("com.hubble.hubblebackend.postgressql.model.ReleaseGroupRatingRaw",
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

	public List findByExample(ReleaseGroupRatingRaw instance) {
		log.debug("finding ReleaseGroupRatingRaw instance by example");
		try {
			List results = sessionFactory
					.getCurrentSession()
					.createCriteria(
							"com.hubble.hubblebackend.postgressql.model.ReleaseGroupRatingRaw")
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
