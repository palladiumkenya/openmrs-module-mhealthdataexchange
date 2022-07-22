package org.openmrs.module.mhealthdataexchange.models.observation;

import org.openmrs.module.mhealthdataexchange.models.MESSAGE_HEADER;
import org.openmrs.module.mhealthdataexchange.models.PATIENT_IDENTIFICATION;

/**
 * @author Cynthia Kamau Created on 21/07/2022.
 */
public class ObservationMessage {
	
	private MESSAGE_HEADER message_header;
	
	private PATIENT_IDENTIFICATION patient_identification;
	
	private OBSERVATION_RESULT[] observation_result;
	
	public MESSAGE_HEADER getMessage_header() {
		return message_header;
	}
	
	public void setMessage_header(MESSAGE_HEADER message_header) {
		this.message_header = message_header;
	}
	
	public PATIENT_IDENTIFICATION getPatient_identification() {
		return patient_identification;
	}
	
	public void setPatient_identification(PATIENT_IDENTIFICATION patient_identification) {
		this.patient_identification = patient_identification;
	}
	
	public OBSERVATION_RESULT[] getObservation_result() {
		return observation_result;
	}
	
	public void setObservation_result(OBSERVATION_RESULT[] observation_result) {
		this.observation_result = observation_result;
	}
}
