/**
 * This Source Code Form is subject to the terms of the Mozilla Public License,
 * v. 2.0. If a copy of the MPL was not distributed with this file, You can
 * obtain one at http://mozilla.org/MPL/2.0/. OpenMRS is also distributed under
 * the terms of the Healthcare Disclaimer located at http://openmrs.org/license.
 *
 * Copyright (C) OpenMRS Inc. OpenMRS is a registered trademark and the OpenMRS
 * graphic logo is a trademark of OpenMRS Inc.
 */
package org.openmrs.module.mhealthdataexchange.api.db;

import org.hibernate.criterion.Restrictions;
import org.openmrs.api.db.hibernate.DbSession;
import org.openmrs.api.db.hibernate.DbSessionFactory;
import org.openmrs.module.mhealthdataexchange.Item;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.openmrs.module.mhealthdataexchange.models.MhealthdataexchangeMessage;
import java.util.List;
import java.util.ArrayList;

public interface MhealthdataexchangeDao {
	
	public Item getItemByUuid(String uuid);
	
	public Item saveItem(Item item);
	
	public List<MhealthdataexchangeMessage> getAllMhealthdataexchangeMessages(Boolean includeRetired);
}
