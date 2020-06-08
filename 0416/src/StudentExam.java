class Student{
	private String name ; private int grade ;
	public Student() { }
	public Student( String name ) { this.name = name ; }
	public Student( String name, int grade ) {
		this(name) ;
		this.grade = grade ;
	}
	public void setName( String name ){ this.name = name ; }
	public void setGrade( int grade ){ this.grade = grade ; }
	public String getName(){ return this.name ; }
	public int getGrade(){ return this.grade ; }
}
public class StudentExam{
	public static void main( String args[] ) {
		Student kim = new Student("������") ;
		kim.setGrade(2) ;
		Student jang = new Student( "�����", 3 ) ;
		System.out.println("�л��� �̸��� " + kim.getName() + "�̰�, " + kim.getGrade()
		+ "�г��Դϴ�.") ;
		System.out.println("�л��� �̸��� " + jang.getName() + "�̰�, " + jang.getGrade()
		+ "�г��Դϴ�.") ;
	}
}