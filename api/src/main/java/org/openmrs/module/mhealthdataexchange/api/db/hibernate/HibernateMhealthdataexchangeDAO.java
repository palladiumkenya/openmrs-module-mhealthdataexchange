/**
 * The contents of this file are subject to the OpenMRS Public License
 * Version 1.0 (the "License"); you may not use this file except in
 * compliance with the License. You may obtain a copy of the License at
 * http://license.openmrs.org
 * <p>
 * Software distributed under the License is distributed on an "AS IS"
 * basis, WITHOUT WARRANTY OF ANY KIND, either express or implied. See the
 * License for the specific language governing rights and limitations
 * under the License.
 * <p>
 * Copyright (C) OpenMRS, LLC.  All Rights Reserved.
 */
package org.openmrs.module.mhealthdataexchange.api.db.hibernate;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.openmrs.module.mhealthdataexchange.Item;
import org.openmrs.module.mhealthdataexchange.api.db.MhealthdataexchangeDao;
import org.openmrs.module.mhealthdataexchange.models.MhealthdataexchangeMessage;

import java.util.List;

/**
 * It is a default implementation of {@link MhealthdataexchangeDao}.
 */
public class HibernateMhealthdataexchangeDAO implements MhealthdataexchangeDao {
	
	protected final Log log = LogFactory.getLog(this.getClass());
	
	private SessionFactory sessionFactory;
	
	/**
	 * @param sessionFactory the sessionFactory to set
	 */
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	/**
	 * @return the sessionFactory
	 */
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}
	
	@Override
	public List<MhealthdataexchangeMessage> getAllMhealthdataexchangeMessages(Boolean includeRetired) {
		Criteria crit = this.sessionFactory.getCurrentSession().createCriteria(MhealthdataexchangeMessage.class);
		crit.add(Restrictions.eq("retired", includeRetired));
		return crit.list();
	}
	
	@Override
	public Item getItemByUuid(String uuid) {
		return (Item) this.sessionFactory.getCurrentSession().createCriteria(Item.class).add(Restrictions.eq("uuid", uuid))
		        .uniqueResult();
	}
	
	@Override
	public Item saveItem(Item item) {
		this.sessionFactory.getCurrentSession().saveOrUpdate(item);
		return item;
	}
}
