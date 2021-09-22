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
}
