class Soldiers {
    
    public Soldiers() {
        System.out.println("There is a soldier");
    }

    public Soldiers(int id) {
        id = 101;
        System.out.println("Soldier ID: " + id);
    }

    public Soldiers(int id, String name) {
        name = "Arjun";
        System.out.println("Name of the Soldier - " + name);
    }
	
    public Soldiers(int id, String name,char code) {
        code = 'S';
        System.out.println("Soldier Code - " + code);
    }

    public Soldiers(int id, String name,char code,  boolean isActive) {
        isActive = true;
        System.out.println("Is Soldier Active - " + isActive);
    }
	public Soldiers(int id, String name,char code,  boolean isActive,long serviceNumber) {
        serviceNumber = 9876543210L;
        System.out.println("Service Number: " + serviceNumber);
    }
	public Soldiers(int id, String name,char code,  boolean isActive,long serviceNumber,double salary){
	salary = 55000.75;
        System.out.println("Soldier's Salary - " + salary);
    }
	public Soldiers(int id, String name,char code,  boolean isActive,long serviceNumber,double salary,float height){
	height = 5.9f;
        System.out.println("Height of the Soldier - " + height);
    }

	
}
