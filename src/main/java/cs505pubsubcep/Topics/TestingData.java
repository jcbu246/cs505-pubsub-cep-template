package cs505pubsubcep.Topics;

import java.util.List;

public class patient_list {

    public int testing_id;
    public String patient_name;
    public String patient_mrn;
    public int patient_zipcode;
    public int patient_status;
    public List<String> contact_list;
    public List<String> event_list;

    public  patient_list() {

    }
    
public class hospital_list {
    
    public int hospital_id;
    public String paitent_mrn;
    public String patient_name;
    public int patient_status;
    
    public hospital_list() {
        
    }
    
public class vax_list {
    
    public int vaccination_id;
    public String patient_mrn;
    public String patient_name;
    
    public vax_list() {
        
    }
