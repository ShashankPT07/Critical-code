class HospitalRunner {
    public static void main(String[] args) {

        int[] hospitalId = {101,102,103,104};
        int[] id= Hospital.hospitalId(hospitalId);
        for (int value=0;value< id.length;value++) {
            System.out.println(id[value]);
        }

        long[] patientCount={1200l,950l,1340};
        long[] patients=Hospital.patientCount(patientCount);
        for (int value=0;value<patients.length;value++) {
            System.out.println(patients[value]);
        }

        double[] medicineCost={230.5,145.75,580.2};
        double[] costs=Hospital.medicineCost(medicineCost);
        for (int value=0;value<costs.length;value++) {
            System.out.println(costs[value]);
        }

        float[] hospitalRatings={4.2f,3.9f,4.8f};
        float[] ratings = Hospital.hospitalRating(hospitalRatings);
        for (int value= 0;value< ratings.length;value++) {
            System.out.println(ratings[value]);
        }

        char[] departmentCodes = {'C','O','N','P'};
        char[] departments = Hospital.departmentCode(departmentCodes);
        for (int value=0;value<departments.length;value++) {
            System.out.println(departments[value]);
        }

        boolean[] emergencyStatus={true,false,true};
        boolean[] emergency = Hospital.isEmergencyAvailable(emergencyStatus);
        for (int value=0;value< emergency.length;value++) {
            System.out.println(emergency[value]);
        }

        String[] hospitalNames= {"sharada", "apollo", "SDM"};
        String[] names = Hospital.hospitalName(hospitalNames);
        for (int value=0;value<names.length;value++) {
            System.out.println(names[value]);
        }
    }
}
