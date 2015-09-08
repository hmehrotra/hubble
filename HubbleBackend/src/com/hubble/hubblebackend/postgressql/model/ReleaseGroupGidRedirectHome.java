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
 * Home object for domain model class ReleaseGroupGidRedirect.
 * @see com.hubble.hubblebackend.postgressql.model.ReleaseGroupGidRedirect
 * @author Hibernate Tools
 */
public class ReleaseGroupGidRedirectHome {

	private static final Log log = LogFactory
			.getLog(ReleaseGroupGidRedirectHome.class);

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

	public void persist(ReleaseGroupGidRedirect transientInstance) {
		log.debug("persisting ReleaseGroupGidRedirect instance");
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(ReleaseGroupGidRedirect instance) {
		log.debug("attaching dirty ReleaseGroupGidRedirect instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(ReleaseGroupGidRedirect instance) {
		log.debug("attaching clean ReleaseGroupGidRedirect instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(ReleaseGroupGidRedirect persistentInstance) {
		log.debug("deleting ReleaseGroupGidRedirect instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public ReleaseGroupGidRedirect merge(
			ReleaseGroupGidRedirect detachedInstance) {
		log.debug("merging ReleaseGroupGidRedirect instance");
		try {
			ReleaseGroupGidRedirect result = (ReleaseGroupGidRedirect) sessionFactory
					.getCurrentSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public ReleaseGroupGidRedirect findById(java.io.Serializable id) {
		log.debug("getting ReleaseGroupGidRedirect instance with id: " + id);
		try {
			ReleaseGroupGidRedirect instance = (ReleaseGroupGidRedirect) sessionFactory
					.getCurrentSession()
					.get("com.hubble.hubblebackend.postgressql.model.ReleaseGroupGidRedirect",
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

	public List findByExample(ReleaseGroupGidRedirect instance) {
		log.debug("finding ReleaseGroupGidRedirect instance by example");
		try {
			List results = sessionFactory
					.getCurrentSession()
					.createCriteria(
							"com.hubble.hubblebackend.postgressql.model.ReleaseGroupGidRedirect")
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
