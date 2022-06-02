import java.time.LocalDate;

public class AssociationTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book1 b1 = new Book1();
		b1.setBookName("Head first Java");
		
		
		Professor p1 = new Professor();
		p1.setProfessorName("vishhalDawane");
		p1.setProfType("Professor");
		
		Subject s = new Subject();
		s.setSubName("Java");
		
		Lecture l=new Lecture();
		l = Professor.delivering(b1, "VishalDawane", 4);
		
		
		
		 
		
	}

}

class Profession
{
	String profType;

	public String getProfType() {
		return profType;
	}

	public void setProfType(String profType) {
		this.profType = profType;
	}

	@Override
	public String toString() {
		return "Profession [profType=" + profType + "]";
	}
	
	
}

class Professor extends Profession
{
	Subject sub = new Subject();
	String ProfessorName;
	
	Lecture delivering(Book1 b1, String lessonTitle, int hours)
	{
		Lecture l = new Lecture();
		l.setProfName(ProfessorName);
		l.setLessonTitle(lessonTitle);
		l.setLectureDuration(hours);
		return l;
	}

	public Subject getSub() {
		return sub;
	}

	public void setSub(Subject sub) {
		this.sub = sub;
	}

	public String getProfessorName() {
		return ProfessorName;
	}

	public void setProfessorName(String professorName) {
		ProfessorName = professorName;
	}

	@Override
	public String toString() {
		return "Professor [sub=" + sub + ", ProfessorName=" + ProfessorName + "]";
	}
	
	
}

class Subject
{
	String subName;

	public String getSubName() {
		return subName;
	}

	public void setSubName(String subName) {
		this.subName = subName;
	}

	@Override
	public String toString() {
		return "Subject [subName=" + subName + "]";
	}
	
	
}

class Lecture
{
	String profName;
	String lessonTitle;
	int lectureDuration;
	public String getProfName() {
		return profName;
	}
	public void setProfName(String profName) {
		this.profName = profName;
	}
	public String getLessonTitle() {
		return lessonTitle;
	}
	public void setLessonTitle(String lessonTitle) {
		this.lessonTitle = lessonTitle;
	}
	public int getLectureDuration() {
		return lectureDuration;
	}
	public void setLectureDuration(int lectureDuration) {
		this.lectureDuration = lectureDuration;
	}
	@Override
	public String toString() {
		return "Lecture [profName=" + profName + ", lessonTitle=" + lessonTitle + ", lectureDuration=" + lectureDuration
				+ "]";
	}
	
	
}

class Book1
{
	String bookName;

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	@Override
	public String toString() {
		return "Book [bookName=" + bookName + "]";
	}
	
	
}
