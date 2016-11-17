interface StudentManager {
	abstract void show();
	abstract char grade();
}

class Student {
	String id, name, surname;
	double score, midterm, fscore, totalscore;
	char grade;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public double getScore() {
		return score;
	}

	public void setScore(double score) {
		this.score = score;
	}

	public double getMidterm() {
		return midterm;
	}

	public void setMidterm(double midterm) {
		this.midterm = midterm;
	}

	public double getFscore() {
		return fscore;
	}

	public void setFscore(double fscore) {
		this.fscore = fscore;
	}
}

public class TestInherit extends Student implements StudentManager{

	public static void main(String[] args) {
		TestInherit data = new TestInherit();
		data.setId("584277001");
		data.setName("Narumon");
		data.setSurname("Potiprom");
		data.setScore(30);
		data.setMidterm(25);
		data.setFscore(25);
		data.show();
		data.grade();
	}

	@Override
	public void show() {
		System.out.println("ID : "+id);
		System.out.println("NAME : "+name);
		System.out.println("SURNAME : "+surname);
		System.out.println("Score : "+score);
		System.out.println("Midterm : "+midterm);
		System.out.println("Fscore : "+fscore);
		System.out.println("****************");
		System.out.println("GRADE : "+grade());
	}

	@Override
	public char grade() {
		double totalscore;
		totalscore = getScore() + getMidterm() + getFscore();
		if (totalscore >= 80) {
			return 'A';
		}
		if (totalscore >= 70) {
			return 'B';
			} 
		if (totalscore >= 60) {
			return 'C';
			} 
		if (totalscore >= 50) {
			return 'D';
			}
		if (totalscore < 50) {
			return 'F';
			}
		return 0;
	}
}