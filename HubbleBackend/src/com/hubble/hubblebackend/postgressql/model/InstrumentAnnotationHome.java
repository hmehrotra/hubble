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
 * Home object for domain model class InstrumentAnnotation.
 * @see com.hubble.hubblebackend.postgressql.model.InstrumentAnnotation
 * @author Hibernate Tools
 */
public class InstrumentAnnotationHome {

	private static final Log log = LogFactory
			.getLog(InstrumentAnnotationHome.class);

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

	public void persist(InstrumentAnnotation transientInstance) {
		log.debug("persisting InstrumentAnnotation instance");
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(InstrumentAnnotation instance) {
		log.debug("attaching dirty InstrumentAnnotation instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(InstrumentAnnotation instance) {
		log.debug("attaching clean InstrumentAnnotation instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(InstrumentAnnotation persistentInstance) {
		log.debug("deleting InstrumentAnnotation instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public InstrumentAnnotation merge(InstrumentAnnotation detachedInstance) {
		log.debug("merging InstrumentAnnotation instance");
		try {
			InstrumentAnnotation result = (InstrumentAnnotation) sessionFactory
					.getCurrentSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public InstrumentAnnotation findById(
			com.hubble.hubblebackend.postgressql.model.InstrumentAnnotationId id) {
		log.debug("getting InstrumentAnnotation instance with id: " + id);
		try {
			InstrumentAnnotation instance = (InstrumentAnnotation) sessionFactory
					.getCurrentSession()
					.get("com.hubble.hubblebackend.postgressql.model.InstrumentAnnotation",
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

	public List findByExample(InstrumentAnnotation instance) {
		log.debug("finding InstrumentAnnotation instance by example");
		try {
			List results = sessionFactory
					.getCurrentSession()
					.createCriteria(
							"com.hubble.hubblebackend.postgressql.model.InstrumentAnnotation")
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
