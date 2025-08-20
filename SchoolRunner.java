class SchoolRunner{
public static void main(String [] args){

int [] subjectCodes={23,12,34,34};
int [] subject=School.schoolCode(subjectCodes);
for(int value=0;value<subject.length;value++){
System.out.println(subject[value]);
}

long [] numberOfstudents={1324l,3726l,863228l};
long [] students=School.totalStudents(numberOfstudents);
for(int value=0;value<students.length;value++){
	System.out.println(students[value]);
}
double[] numberOfMarks={87.45,77.54,66.78};
double[] marks=School.totalMarks(numberOfMarks);
for(int value=0;value<marks.length;value++){
	System.out.println(marks[value]);
}
float[] numberofFees={455626.733f,655277.867f,575722.67367f};
float[] fees=School.totalFees(numberofFees);
for(int value=0;value<fees.length;value++){
	System.out.println(fees[value]);
}
char[] numberofSections={'A','B','C','d'};
char[] sections=School.sectionName(numberofSections);
for(int value=0;value<sections.length;value++){
	System.out.println(sections[value]);
}
boolean[] numberOfHolidays={true,false,true};
boolean[] holidays=School.isHolidayToday(numberOfHolidays);
for(int value=0;value<holidays.length;value++){
	System.out.println(holidays[value]);
}
String[] nameOfTheSchool={"navachetana","vidyaniketana","sridevi"};
String[] name=School.schoolName(nameOfTheSchool);
for(int value=0;value<name.length;value++){
	System.out.println(name[value]);
}

}




}