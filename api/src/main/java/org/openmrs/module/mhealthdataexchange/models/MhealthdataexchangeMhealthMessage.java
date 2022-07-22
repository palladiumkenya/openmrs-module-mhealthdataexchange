package org.openmrs.module.mhealthdataexchange.models;

import org.openmrs.BaseOpenmrsData;

import java.io.Serializable;

import org.openmrs.BaseOpenmrsMetadata;
import org.openmrs.BaseOpenmrsObject;

/**
 * It is a model class. It should extend either {@link BaseOpenmrsObject} or
 * {@link BaseOpenmrsMetadata}.
 */

public class MhealthdataexchangeMhealthMessage extends BaseOpenmrsData implements Serializable {
	
	private static final long serialVersionUID = 3062136520728193223L;
	
	public final static String MODULE_PRIVILEGE = "Messages Privilege";
	
	private Integer id;
	
	private String uuid;
	
	private Integer message_id;
	
	private Integer message_type;
	
	private String hl7_type;
	
	private String status;
	
	private String source;
	
	private String message;
	
	private String patient;
	
	private String internal_message_type;
	
	private String response;
	
	private String attempts;
	
	@Override
	public Integer getId() {
		return id;
	}
	
	@Override
	public void setId(Integer id) {
		this.id = id;
	}
	
	@Override
	public String getUuid() {
		return uuid;
	}
	
	@Override
	public void setUuid(String uuid) {
		this.uuid = uuid;
	}
	
	public Integer getMessage_id() {
		return message_id;
	}
	
	public void setMessage_id(Integer message_id) {
		this.message_id = message_id;
	}
	
	public Integer getMessage_type() {
		return message_type;
	}
	
	public void setMessage_type(Integer message_type) {
		this.message_type = message_type;
	}
	
	public String getHl7_type() {
		return hl7_type;
	}
	
	public void setHl7_type(String hl7_type) {
		this.hl7_type = hl7_type;
	}
	
	public String getStatus() {
		return status;
	}
	
	public void setStatus(String status) {
		this.status = status;
	}
	
	public String getSource() {
		return source;
	}
	
	public void setSource(String source) {
		this.source = source;
	}
	
	public String getMessage() {
		return message;
	}
	
	public void setMessage(String message) {
		this.message = message;
	}
	
	public String getPatient() {
		return patient;
	}
	
	public void setPatient(String patient) {
		this.patient = patient;
	}
	
	public String getInternal_message_type() {
		return internal_message_type;
	}
	
	public void setInternal_message_type(String internal_message_type) {
		this.internal_message_type = internal_message_type;
	}
	
	public String getResponse() {
		return response;
	}
	
	public void setResponse(String response) {
		this.response = response;
	}
	
	public String getAttempts() {
		return attempts;
	}
	
	public void setAttempts(String attempts) {
		this.attempts = attempts;
	}
}
