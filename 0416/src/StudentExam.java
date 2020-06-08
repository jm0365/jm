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
		Student kim = new Student("김현우") ;
		kim.setGrade(2) ;
		Student jang = new Student( "장민재", 3 ) ;
		System.out.println("학생의 이름은 " + kim.getName() + "이고, " + kim.getGrade()
		+ "학년입니다.") ;
		System.out.println("학생의 이름은 " + jang.getName() + "이고, " + jang.getGrade()
		+ "학년입니다.") ;
	}
}