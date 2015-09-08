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
 * Home object for domain model class EditorCollectionLabel.
 * @see com.hubble.hubblebackend.postgressql.model.EditorCollectionLabel
 * @author Hibernate Tools
 */
public class EditorCollectionLabelHome {

	private static final Log log = LogFactory
			.getLog(EditorCollectionLabelHome.class);

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

	public void persist(EditorCollectionLabel transientInstance) {
		log.debug("persisting EditorCollectionLabel instance");
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(EditorCollectionLabel instance) {
		log.debug("attaching dirty EditorCollectionLabel instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(EditorCollectionLabel instance) {
		log.debug("attaching clean EditorCollectionLabel instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(EditorCollectionLabel persistentInstance) {
		log.debug("deleting EditorCollectionLabel instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public EditorCollectionLabel merge(EditorCollectionLabel detachedInstance) {
		log.debug("merging EditorCollectionLabel instance");
		try {
			EditorCollectionLabel result = (EditorCollectionLabel) sessionFactory
					.getCurrentSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public EditorCollectionLabel findById(
			com.hubble.hubblebackend.postgressql.model.EditorCollectionLabelId id) {
		log.debug("getting EditorCollectionLabel instance with id: " + id);
		try {
			EditorCollectionLabel instance = (EditorCollectionLabel) sessionFactory
					.getCurrentSession()
					.get("com.hubble.hubblebackend.postgressql.model.EditorCollectionLabel",
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

	public List findByExample(EditorCollectionLabel instance) {
		log.debug("finding EditorCollectionLabel instance by example");
		try {
			List results = sessionFactory
					.getCurrentSession()
					.createCriteria(
							"com.hubble.hubblebackend.postgressql.model.EditorCollectionLabel")
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
