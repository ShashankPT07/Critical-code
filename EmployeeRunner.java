class EmployeeRunner {
    public static void main(String[] args) {

        int[] employeeIds = {1001,1002,1003};
        int[] ids = Employees.employeeIds(employeeIds);
        for (int value=0;value<ids.length;value++) {
            System.out.println(ids[value]);
        }

        long[] employeeSalaries = {55000l,72000l,91000l};
        long[] salaries = Employees.employeeSalary(employeeSalaries);
       for (int value=0;value<salaries.length;value++) {
            System.out.println(salaries[value]);
        }

        double[] performanceRatings = {4.5,3.9,4.8};
        double[] ratings = Employees.performanceRatings(performanceRatings);
        for (int value=0;value<ratings.length;value++) {
            System.out.println(ratings[value]);
        }

        float[] workingHours = {8.0f,7.5f,6.8f};
        float[] hours = Employees.workingHours(workingHours);
        for (int value=0;value<hours.length;value++) {
            System.out.println(hours[value]);
        }

        char[] departmentCodes = {'A','B','C'};
        char[] departments = Employees.departmentCodes(departmentCodes);
       for (int value=0;value<departments.length;value++) {
            System.out.println(departments[value]);
        }

        boolean[] leaveStatus = {true,false,false};
        boolean[] leave = Employees.isOnLeave(leaveStatus);
        for (int value=0;value<leave.length;value++) {
            System.out.println(leave[value]);
        }

        String[] employeeNames = {"ranjan","ram","raju"};
        String[] names = Employees.employeeNames(employeeNames);
        for (int value=0;value<names.length;value++) {
            System.out.println(names[value]);
        }
    }
}
