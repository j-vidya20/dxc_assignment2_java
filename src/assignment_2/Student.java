package assignment_2;

	import java.util.*;
	public class Student
	{
String name;
	int age;
	String address;
	public Student()
	{
	this.name="unknown";
	this.age=0;
	this.address="not avaliable";
	}
	public void setinfo(int age,String name)
	{
	this.name=name;
	this.age=age;
	}
	public void setinfo(int age ,String name,String address)	{
	this.name=name;
this.age=age;
	this.address=address;
	}
	@Override
	public String toString()
	{
	return "Student [name=" + name + ", age=" + age + ", address=" + address + "]";
	}
public static void main(String[] args)
	{
List<Student> stu=new ArrayList<>();
	stu.add(new Student());
stu.add(new Student());
	stu.add(new Student());
	stu.add(new Student());
	stu.add(new Student());
	stu.add(new Student());
	stu.add(new Student());
	stu.add(new Student());
	stu.add(new Student());
	stu.add(new Student());
	stu.get(0).setinfo(55, "abc");
	stu.get(2).setinfo(50, "efgh","Mumbai,India");
	stu.get(3).setinfo(45, "ijk","Chennai,India");
	stu.get(5).setinfo(30, "lmno","Hyderabad,India");
	stu.get(6).setinfo(65, "pqrst","Delhi,India");
stu.get(8).setinfo(55, "xyz");
	for(Student s :stu)
	{
System.out.println(s);
	}
}
	}
