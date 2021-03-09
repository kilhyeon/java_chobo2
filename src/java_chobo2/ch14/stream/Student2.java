package java_chobo2.ch14.stream;

public class Student2 {
	String name;
	boolean isMale;	//성별
	int hak;		//학년
	int ban;		//반
	int score;

	Student2(String name, boolean isMale, int hak, int ban, int score) {
		this.name = name;
		this.isMale = isMale;
		this.hak = hak;
		this.ban = ban;
		this.score = score;
	}

	String getName() {
		return name;
	}

	boolean isMale() {
		return isMale;
	}

	int getHak() {
		return hak;
	}

	int getBan() {
		return ban;
	}

	int getScore() {
		return score;
	}

	@Override
	public String toString() {
		return String.format("[%s, %s, %s학년 %s반, %s점]", name, isMale ? "남" : "여", hak, ban, score);
	}

	

}