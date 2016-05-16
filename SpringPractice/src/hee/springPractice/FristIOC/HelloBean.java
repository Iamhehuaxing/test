package hee.springPractice.FristIOC;

public class HelloBean {
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSalary() {
		return salary;
	}
	public void setSalary(String salary) {
		this.salary = salary;
	}
	private String name;
	private String salary;
	public String sayHello(){
		return "Name:"+name+",Salary:"+salary;
	}
}
