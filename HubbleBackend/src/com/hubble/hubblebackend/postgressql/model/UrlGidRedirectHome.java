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
 * Home object for domain model class UrlGidRedirect.
 * @see com.hubble.hubblebackend.postgressql.model.UrlGidRedirect
 * @author Hibernate Tools
 */
public class UrlGidRedirectHome {

	private static final Log log = LogFactory.getLog(UrlGidRedirectHome.class);

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

	public void persist(UrlGidRedirect transientInstance) {
		log.debug("persisting UrlGidRedirect instance");
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(UrlGidRedirect instance) {
		log.debug("attaching dirty UrlGidRedirect instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(UrlGidRedirect instance) {
		log.debug("attaching clean UrlGidRedirect instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(UrlGidRedirect persistentInstance) {
		log.debug("deleting UrlGidRedirect instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public UrlGidRedirect merge(UrlGidRedirect detachedInstance) {
		log.debug("merging UrlGidRedirect instance");
		try {
			UrlGidRedirect result = (UrlGidRedirect) sessionFactory
					.getCurrentSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public UrlGidRedirect findById(java.io.Serializable id) {
		log.debug("getting UrlGidRedirect instance with id: " + id);
		try {
			UrlGidRedirect instance = (UrlGidRedirect) sessionFactory
					.getCurrentSession()
					.get("com.hubble.hubblebackend.postgressql.model.UrlGidRedirect",
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

	public List findByExample(UrlGidRedirect instance) {
		log.debug("finding UrlGidRedirect instance by example");
		try {
			List results = sessionFactory
					.getCurrentSession()
					.createCriteria(
							"com.hubble.hubblebackend.postgressql.model.UrlGidRedirect")
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
