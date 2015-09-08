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
 * Home object for domain model class LRecordingReleaseGroup.
 * @see com.hubble.hubblebackend.postgressql.model.LRecordingReleaseGroup
 * @author Hibernate Tools
 */
public class LRecordingReleaseGroupHome {

	private static final Log log = LogFactory
			.getLog(LRecordingReleaseGroupHome.class);

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

	public void persist(LRecordingReleaseGroup transientInstance) {
		log.debug("persisting LRecordingReleaseGroup instance");
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(LRecordingReleaseGroup instance) {
		log.debug("attaching dirty LRecordingReleaseGroup instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(LRecordingReleaseGroup instance) {
		log.debug("attaching clean LRecordingReleaseGroup instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(LRecordingReleaseGroup persistentInstance) {
		log.debug("deleting LRecordingReleaseGroup instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public LRecordingReleaseGroup merge(LRecordingReleaseGroup detachedInstance) {
		log.debug("merging LRecordingReleaseGroup instance");
		try {
			LRecordingReleaseGroup result = (LRecordingReleaseGroup) sessionFactory
					.getCurrentSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public LRecordingReleaseGroup findById(int id) {
		log.debug("getting LRecordingReleaseGroup instance with id: " + id);
		try {
			LRecordingReleaseGroup instance = (LRecordingReleaseGroup) sessionFactory
					.getCurrentSession()
					.get("com.hubble.hubblebackend.postgressql.model.LRecordingReleaseGroup",
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

	public List findByExample(LRecordingReleaseGroup instance) {
		log.debug("finding LRecordingReleaseGroup instance by example");
		try {
			List results = sessionFactory
					.getCurrentSession()
					.createCriteria(
							"com.hubble.hubblebackend.postgressql.model.LRecordingReleaseGroup")
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
