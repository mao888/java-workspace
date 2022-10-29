package 面向对象;
class Student{
	private int score1,score2,score3;
	private String StdName;
	private int StdAge;
	private int StdId;
//	构造方法1
	public Student(String stdName) {
		StdName = stdName;
	}
//	构造方法2
	public Student(String name,int stdAge, int stdId) {
		this(name);		
		StdAge = stdAge;
		StdId = stdId;
	}
	//姓名
	public String getStdName() {	
		return StdName;
	}
//	年龄
	public int getStdAge() {
		return StdAge;
	}
	
	public void setStdAge(int stdAge) {
		if (stdAge<0) {
			throw new IllegalArgumentException("年龄不能为0");
		} else if(stdAge>200) {
			throw new IllegalArgumentException("年龄不能为200");
		}
		StdAge = stdAge;
	}
	//ID
	public int getStdId() {
		return StdId;
	}
	public void setStdId(int stdId) {
		StdId = stdId;
	}
	//获取成绩
	public void setScore(int i,int test)
	{
		if (i>3) {
			throw new IllegalArgumentException("请输入小于3的成绩");
		}
		if (i==1) {
			score1=test;
		}else if  (i==2){
			score2=test;
		}else {
			score3=test;
		}
	}
	//平均成绩
	public int getAverage() {
		return (score1+score2+score3)/3;
	}
	//比较年龄
	public Student compare(Student s) {
		if (this.getStdAge()>s.getStdAge()) return this;
		else return s;	
	}
	@Override
	public String toString() {
		return "Student [score1=" + score1 + ", score2=" + score2 + ", score3=" + score3 + ", StdName=" + StdName
				+ ", StdAge=" + StdAge + ", StdId=" + StdId + "]";
	}
}
public class xueshengxinxi {
	public static void main(String[] args) {
	Student std1 = new Student("Bill",20,101);
	Student std2 = new Student("Mike",22,102);
	//学生1的成绩
	std1.setScore(1,90);
	std1.setScore(2,90);
	std1.setScore(3,90);

	//学生2的成绩
	std2.setScore(1, 80);
	std2.setScore(2, 80);
	std2.setScore(3, 90);
	System.out.println("Name:"+std1.getStdName()+"  ,Age:"+std1.getStdAge()+"  ,id:"+std1.getStdId()+" ,Average :"+std1.getAverage());
	System.out.println("Name:"+std2.getStdName()+"  ,Age:"+std2.getStdAge()+"  ,id:"+std2.getStdId()+"  ,Average :"+std2.getAverage());
	System.out.println(std1.compare(std2).getStdName()+" is older");
	}
}
