package patterns._12_prototype;

public class PrototypeApp {

	public static void main(String[] args) {
		Human p1=new Human(15,"Ivan");
		Human p2= (Human) p1.copy();
		System.out.println(p1);
		System.out.println(p2);
		
		Human person=new Human(18,"Name");
		HumanMeeting hm=new HumanMeeting(person);
		Human p3=hm.makeCopy();
		System.out.println(p3);
		hm.setPrototype(new Human(9,"Oldman"));
		Human p4=hm.makeCopy();
		System.out.println(p4);
	}

}

interface Clonable{
	Object copy();
}

class Human implements Clonable{
	
	int age;
	String name;
	
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Human [age=" + age + ", name=" + name + "]";
	}

	public Human(int age, String name) {
		this.age = age;
		this.name = name;
	}

	@Override
	public Object copy() {
		Human obj=new Human(age, name);		
		return obj;
	}
	
}

class HumanMeeting{
	Human human;

	public HumanMeeting(Human human) {		
		setPrototype(human);
		}
	
	public void setPrototype(Human human){
		this.human=human;
	}
	
	Human makeCopy() {
		return (Human)human.copy();
	}
	
	
}