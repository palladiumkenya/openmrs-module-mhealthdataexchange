# openmrs-module-mhealthdataexchange
mHealth DataExchange the Ushauri IL Consumer 


Service that has the following functions: 

 - Sends json messages from IL to ushauri receiver (il.kenyahmis.org) 

 - Ushauri receiver" decomposes the json message and posts appointments, new registrations, updated registrations and oru messages in the tbl_client and tbl_appointment tables. 

 - Transmits messages from mLab to IL when the facility is online. It contains a cron job that runs at intervals of 30 seconds checking if there is internet 

 - When the facility is offline, all messages are stored in the local ushauri database (ushauri_il) temporarily and when the facility is back online, the data is sent to ushauri receiver (il.kenyahmis.org) 

# Functionality

    - Defining the data model for message table 

    - DB migrations in liquibase 

    - Service apis  a) SaveorUpdateMessage 
                    b) GetMessageById 
                    c) SendMessage 
                    d) PurgeMessage – delete entries sent successfully, except registration 

    - Scheduler for post to server 

    - Web service to receive from IL 

    - Scheduler for generating appointment messages, registration message and observation 

    (Check if registration happens before sending appointments) 

    - Mlab scope (tbd)