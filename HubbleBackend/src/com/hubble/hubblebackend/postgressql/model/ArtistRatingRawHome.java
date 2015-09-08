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
 * Home object for domain model class ArtistRatingRaw.
 * @see com.hubble.hubblebackend.postgressql.model.ArtistRatingRaw
 * @author Hibernate Tools
 */
public class ArtistRatingRawHome {

	private static final Log log = LogFactory.getLog(ArtistRatingRawHome.class);

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

	public void persist(ArtistRatingRaw transientInstance) {
		log.debug("persisting ArtistRatingRaw instance");
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(ArtistRatingRaw instance) {
		log.debug("attaching dirty ArtistRatingRaw instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(ArtistRatingRaw instance) {
		log.debug("attaching clean ArtistRatingRaw instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(ArtistRatingRaw persistentInstance) {
		log.debug("deleting ArtistRatingRaw instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public ArtistRatingRaw merge(ArtistRatingRaw detachedInstance) {
		log.debug("merging ArtistRatingRaw instance");
		try {
			ArtistRatingRaw result = (ArtistRatingRaw) sessionFactory
					.getCurrentSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public ArtistRatingRaw findById(
			com.hubble.hubblebackend.postgressql.model.ArtistRatingRawId id) {
		log.debug("getting ArtistRatingRaw instance with id: " + id);
		try {
			ArtistRatingRaw instance = (ArtistRatingRaw) sessionFactory
					.getCurrentSession()
					.get("com.hubble.hubblebackend.postgressql.model.ArtistRatingRaw",
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

	public List findByExample(ArtistRatingRaw instance) {
		log.debug("finding ArtistRatingRaw instance by example");
		try {
			List results = sessionFactory
					.getCurrentSession()
					.createCriteria(
							"com.hubble.hubblebackend.postgressql.model.ArtistRatingRaw")
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
