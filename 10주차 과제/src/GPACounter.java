
public class GPACounter {
	private int _numberOfGPA3;
	private int _numberOfGPA2;
	private int _numberOfGPA1;
	private int _numberOfGPA0;

	// 생성자
	public GPACounter() {
		
		this._numberOfGPA3=0;
		this._numberOfGPA2=0;
		this._numberOfGPA1=0;
		this._numberOfGPA0=0;
		
	}

	// 주어진 평균 평점에 대해 해당 점수 범위에 들어가는 학생 수를 1 증가시키게 한다
	public void count(double aGPA) {

		if (aGPA >= 3.0) {
			this._numberOfGPA3++;
		}
		else if (aGPA>=2.0) {
			this._numberOfGPA2++;
		}
		else if (aGPA>=1.0) {
			this._numberOfGPA1++;
		}
		else {
			this._numberOfGPA0++;
		}
	}

	public int numberOfGPA3() {
		
		// 3.0 이상의 학생수를 얻는다
		return this._numberOfGPA3;
	}
	public int numberOfGPA2() {
		// 2.0 이상의 학생수를 얻는다
		return this._numberOfGPA2;
	}
	public int numberOfGPA1() {
		// 1.0 이상의 학생수를 얻는다
		return this._numberOfGPA1;
	}
	public int numberOfGPA0() {
		// 0.0 이상의 학생수를 얻는다
		return this._numberOfGPA0;
	}
}
