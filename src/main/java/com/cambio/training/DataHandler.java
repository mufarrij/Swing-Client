package com.cambio.training;

import java.util.*;

/**
 * DataHandler class is used to hold and handle data related to patients
 */
public final class DataHandler
{
  /**
   * patientList  used to store patient objects
   */
  public static List<Patient> patientList = new ArrayList<Patient>();

  public static PatientTableModel patientTableModel;


  // defining birthdays for three sample patients
  Calendar myCalendar1 = new GregorianCalendar(1992, 5, 11);
  Date p1BirthDate = myCalendar1.getTime();
  Calendar myCalendar2 = new GregorianCalendar(2019,0,1);
  Date p2BirthDate = myCalendar2.getTime();
  Calendar myCalendar3 = new GregorianCalendar(2016,11,24);
  Date p3BirthDate = myCalendar3.getTime();

  /**
   * constructor for data handler
   * initializing patient list with sample data
   */
  public DataHandler(){
    Patient p1 = new Patient("Nimal", "0772546890", p1BirthDate , "Male", "26 years", "3,Torington,Colombo-7.", "Student");
    Patient p2 = new Patient("Kamal", "0762545890", p2BirthDate,"Male", "0 years 2 months", "21,Dehigastalawa,Balangoda.", "Unemployed");
    Patient p3 = new Patient("Vimal", "0772546870",p3BirthDate,"Male", "2 years 4 month", "34,Ramakrishna road,Colombo-6.", "Part Time");
    patientList.add(p1);
    patientList.add(p2);
    patientList.add(p3);
    patientTableModel = new PatientTableModel(patientList);
  }

  /**
   * getPatientTableModel is the getter method for get patientTableModel
   * @return patientTableModel object of dataHandler
   */
  public PatientTableModel getPatientTableModel()
  {
    return patientTableModel;
  }

  /**
   * addPatient method takes patient object as input and add it to patient list
   * @param p takes patient object as input
   */
  public void addPatient(Patient p)
  {
    this.patientList.add(p);
    patientTableModel = new PatientTableModel(patientList);
  }

}

