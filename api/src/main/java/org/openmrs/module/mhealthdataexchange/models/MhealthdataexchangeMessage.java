package org.openmrs.module.mhealthdataexchange.models;

import org.openmrs.BaseOpenmrsMetadata;

import java.io.Serializable;

/**
 * @author Cynthia Kamau Created on 21/07/2022.
 */
public class MhealthdataexchangeMessage extends BaseOpenmrsMetadata implements Serializable {
	
	private static final long serialVersionUID = 3062136520728193223L;
	
	private Integer message_id;
	
	private Integer id;
	
	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	private Integer message_type;
	
	private String hl7_type;
	
	private String status;
	
	private String source;
	
	private String message;
	
	private String patient;
	
	private String internal_message_type;
	
	private String response;
	
	private String attempts;
	
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
