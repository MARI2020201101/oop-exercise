package exercise2;

public class Student {

    public static void main(String[] args) {
        Student s= new Student();
        s.name = "홍길동";
        s.ban = 1;
        s.no = 1;
        s.kor = 100;
        s.eng = 60;
        s.math = 76;

        System.out.println("이름 : " + s.name);
        System.out.println("총점 : " + s.getTotal());
        System.out.println("평균 : " + s.getAverage());
        System.out.println(s.info());
    }
    private String name;
    private int ban;
    private int no;
    private int kor;
    private int eng;
    private int math;

    public int getTotal(){
        return kor+eng+math;
    }

    public float getAverage(){
        return (int)((getTotal()/3.0f+0.05)*10)/10.0f;
    }

    public Student(){}

    public Student(String name, int ban, int no, int kor, int eng, int math){
        this.name=name;
        this.ban=ban;
        this.no = no;
        this.kor=kor;
        this.eng=eng;
        this.math= math;
    }
    public String info(){
        return String.format("%s,%d,%d,%d,%d,%d,%d,%.1f",name,ban,no,kor,eng,math,getTotal(),getAverage());
    }
}
