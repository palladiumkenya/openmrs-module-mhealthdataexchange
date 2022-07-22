package org.openmrs.module.mhealthdataexchange.api;

import org.openmrs.annotation.Authorized;
import org.openmrs.api.APIException;
import org.openmrs.api.OpenmrsService;
import org.openmrs.module.mhealthdataexchange.models.MhealthdataexchangeMhealthMessage;
import org.springframework.transaction.annotation.Transactional;

/**
 * This service exposes module's core functionality. It is a Spring managed bean which is configured
 * in moduleApplicationContext.xml.
 * <p/>
 * It can be accessed only via Context:<br>
 * <code>
 * Context.getService(MhealthdataexchangeMhealthMessageService.class).someMethod();
 * </code> The design has been adapted from
 * https://github.com/muzima/openmrs-module-muzimacore/blob/
 * master/api/src/main/java/org/openmrs/module
 * /muzima/api/service/impl/RegistrationDataServiceImpl.java
 * 
 * @see org.openmrs.api.context.Context
 */
public interface MhealthdataexchangeMhealthMessageService extends OpenmrsService {
	
	/**
	 * saves or updates a message object
	 * 
	 * @param message
	 * @return
	 * @throws APIException
	 */
	@Transactional
	MhealthdataexchangeMhealthMessage saveOrUpdateMessage(MhealthdataexchangeMhealthMessage message);
	
	/**
	 * Get data by the internal database id of the data.
	 * 
	 * @param id the internal database id.
	 * @return the data with matching internal database id. * @return
	 * @throws APIException
	 */
	@Authorized
	@Transactional(readOnly = true)
	MhealthdataexchangeMhealthMessage getMhealthMessageId(Integer id) throws APIException;
	
	/**
	 * Get data by the uuid .
	 * 
	 * @param uuid the uuid of the registration data.
	 * @return the registration data with matching uuid.
	 * @throws APIException
	 */
	MhealthdataexchangeMhealthMessage getMhealthMessageUuid(final String uuid) throws APIException;
	
	/**
	 * Deletes a message from the database.
	 * 
	 * @param message the message to delete.
	 */
	@Authorized(MhealthdataexchangeMhealthMessage.MODULE_PRIVILEGE)
	@Transactional
	void purgeRecord(MhealthdataexchangeMhealthMessage message);
	
}
