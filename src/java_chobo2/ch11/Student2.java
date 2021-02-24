package java_chobo2.ch11;

import java.util.Comparator;

public class Student2 implements Comparable {
	String name;
	int ban;
	int no;
	int kor, eng, math;

	public Student2(String name, int ban, int no, int kor, int eng, int math) {
		this.name = name;
		this.ban = ban;
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}

	int getTotal() {
		return kor + eng + math;
	}

	float getAverage() {
		return (int) ((getTotal() / 3f) * 10 + 0.5) / 10f;
	}

	public String toString() {
		return name + "," + ban + "," + no + "," + kor + "," + eng + "," + math + "," + getTotal() + "," + getAverage();
	}

	public int compareTo(Object o) {
		if (o instanceof Student2) {
			Student2 tmp = (Student2) o;
			return name.compareTo(tmp.name);
		} else {
			return -1;
		}
	}
}

class BanNoAscending implements Comparator {
	public int compare(Object o1, Object o2) {
		if (o1 instanceof Student2 && o2 instanceof Student2) {
			Student2 s1 = (Student2) o1;
			Student2 s2 = (Student2) o2;
			int result = s1.ban - s2.ban;

			if (result == 0) {
				return s1.no - s2.no;
			}
			return result;
		}
		return -1;
	}
}