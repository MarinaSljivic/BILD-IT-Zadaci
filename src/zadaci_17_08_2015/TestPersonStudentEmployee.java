package zadaci_17_08_2015;
import zadaci_13_08_2015.MyDate;

/**
 * @author Marina Sljivic
 *
 */
public class TestPersonStudentEmployee{
	public static void main(String[] args) {
		Person p = new Person("Marina", "my address", 123, "m@ri.na");
		System.out.println(p);
		Student s = new Student("Marina student", 3);
		System.out.println(s);
		Employee e = new Employee("name employee", "office", 1000, new MyDate());
		System.out.println(e);
		Faculty f = new Faculty("name faculty", "name office", 12, "rank");
		System.out.println(f);
		Staff staff = new Staff("name staff", "some title");
		System.out.println(staff);
	}
}

class Person{
	private String name;
	private String address;
	private int phoneNumber;
	private String email;
	
	/**
	 * No arg constructor
	 */
	public Person(){
		
	}
	/**
	 * Constructs a Person object with the specified values.
	 * @param name String
	 * @param address String
	 * @param phoneNumber int
	 * @param email String
	 */
	public Person(String name, String address, int phoneNumber, String email){
		setName(name);
		setAddress(address);
		setPhoneNumber(phoneNumber);
		setEmail(email);
	}
	//getters and setters	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	//don't need to override in every class, just in the superclass
	@Override
	public String toString() {
		return getClass().getSimpleName()+"'s name: "+getName();
	}
}


class Student extends Person{
	private final static String[] CLASS_STATUS = {"freshman","sophomore","junior","senior"};
	private String status;
	//constructor
	public Student(String name, int status){
		setName(name);;
		if(status>=0 && status<4){//if the status is 0,1,2 or 3
			setStatus(getClassStatus()[status]);
		}else{
			setStatus(getClassStatus()[0]);//set it to be a freshman
		}
	}
	//getters and setters
	public static String[] getClassStatus() {
		return CLASS_STATUS;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
}
class Employee extends Person{
	private String office;
	private double salary;
	private MyDate dateHired;
	
	Employee(){
		
	}
	Employee(String name,String office,double salary,MyDate datehired){
		setName(name);
		setOffice(office);
		setSalary(salary);
		setDateHired(datehired);
	}
	public String getOffice() {
		return office;
	}

	public void setOffice(String office) {
		this.office = office;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public MyDate getDateHired() {
		return dateHired;
	}

	public void setDateHired(MyDate dateHired) {
		this.dateHired = dateHired;
	}
}

class Faculty extends Employee{
	private String office;
	private int hours;
	private String rank;
	
	Faculty(String name,String office,int hours,String rank){
		setName(name);
		setOffice(office);
		setHours(hours);
		setRank(rank);
	}
	public String getOffice() {
		return office;
	}

	public void setOffice(String office) {
		this.office = office;
	}

	public int getHours() {
		return hours;
	}

	public void setHours(int hours) {
		this.hours = hours;
	}

	public String getRank() {
		return rank;
	}

	public void setRank(String rank) {
		this.rank = rank;
	}

}

class Staff extends Employee{
	private String title;
	
	Staff(String name, String title){
		setName(name);
		setTitle(title);
	}
	
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

}
