package com.xworkz.hospital.external;

import com.xworkz.hospital.events.PatientDetails;
import com.xworkz.hospital.events.DoctorDetails;
import com.xworkz.hospital.events.RoomDetails;
import com.xworkz.hospital.events.AppointmentDetails;
import com.xworkz.hospital.events.MedicineDetails;

import com.xworkz.hospital.internal.PatientException;
import com.xworkz.hospital.internal.DoctorException;
import com.xworkz.hospital.internal.RoomException;
import com.xworkz.hospital.internal.AppointmentException;
import com.xworkz.hospital.internal.MedicineException;

public class HospitalRunner {
    public static void main(String[] args) {

        // event objects
        PatientDetails patient = new PatientDetails();
        DoctorDetails doctor = new DoctorDetails();
        RoomDetails room = new RoomDetails();
        AppointmentDetails appoint = new AppointmentDetails();
        MedicineDetails medicine = new MedicineDetails();

        // internal objects
        PatientException pat = new PatientException();
        DoctorException doc = new DoctorException();
        RoomException rm = new RoomException();
        AppointmentException app = new AppointmentException();
        MedicineException med = new MedicineException();

        // Patient
        try {
            patient.patientInfo();
        } catch (PatientException e) {
            System.out.println(pat.checkPatient(-1));
        }

        // Doctor
        try {
            doctor.doctorInfo();
        } catch (DoctorException e) {
            System.out.println(doc.checkDoctor("John"));
        }

        // Room
        try {
            room.roomInfo();
        } catch (RoomException e) {
            System.out.println(rm.checkRoom(150));
        }

        // Appointment
        try {
            appoint.appointmentInfo();
        } catch (AppointmentException e) {
            System.out.println(app.checkAppointment("Sunday"));
        }

        // Medicine
        try {
            medicine.medicineInfo();
        } catch (MedicineException e) {
            System.out.println(med.checkMedicine(0));
        }
    }
}
