
public class Student {

	private int _scoreKorean;
	private int _scoreEnglish;
	private int _scoreComputer;
	

	
	
	//비공개 학점
	private char score2Grade(int aScore) {
		if (aScore >= 90) {
			return 'A';
		} else if (aScore >= 80) {
			return 'B';
		} else if (aScore >= 70) {
			return 'C';
		} else if (aScore >= 60) {
			return 'D';
		} else {
			return 'F';
		}
	}

	//비공개 평점
	private double grade2Point(char aGrade) {
		if (aGrade=='A') {
			return 4.0;
		} else if (aGrade=='B') {
			return 3.0;
		} else if (aGrade=='C') {
			return 2.0;
		} else if (aGrade=='D') {
			return 1.0;
		} else {
			return 0.0;
		}
	}
	
	public Student() {
		this._scoreKorean = 0;
		this._scoreEnglish = 0;
		this._scoreComputer = 0;


	}

	// 국어

	public void setScoreKorean(int aScoreKorean) {
		this._scoreKorean = aScoreKorean;
	}

	public int scoreKorean() {
		return this._scoreKorean;
	}

	public char gradeKorean() {
		return this.score2Grade(this._scoreKorean);
	}
	
	public double gradePointKorean () {
		return this.grade2Point(this.gradeKorean());
	}

	// 영어
	public void setScoreEnglish(int aScoreEnglish) {
		this._scoreEnglish = aScoreEnglish;
	}

	public int scoreEnglish() {
		return this._scoreEnglish;
	}

	public char gradeEnglish() {
		return this.score2Grade(this._scoreEnglish);
	}
	
	public double gradePointEnglish () {
		return this.grade2Point(this.gradeEnglish());
	}

	// 컴퓨터
	public void setScoreComputer(int aScoreComputer) {
		this._scoreComputer = aScoreComputer;
	}

	public int scoreComputer() {
		return this._scoreComputer;
	}

	public char gradeComputer() {
		return this.score2Grade(this._scoreComputer);
	}
	
	public double gradePointComputer () {
		return this.grade2Point(this.gradeComputer());
	}
	
	//평균 평점계산

	public double gpa() {

		double gradePointKorean, gradePointEnglish, gradePointComputer ;
		
		gradePointKorean=grade2Point(this.gradeKorean());
		gradePointEnglish=grade2Point(this.gradeEnglish());
		gradePointComputer=grade2Point(this.gradeComputer());
		
		return (gradePointKorean + gradePointEnglish + gradePointComputer) / 3.0 ;


	}
}
