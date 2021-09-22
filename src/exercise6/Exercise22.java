package exercise6;

public class Exercise22 {
    public static boolean isNumber(String str){
        if(str==null || str.length()==0) return false;
        for(int i =0; i<str.length();i++){
            if(str.charAt(i)<'0' || str.charAt(i)>'9')
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        String str = "123";
        System.out.println(str+" 는 숫자입니까? " + isNumber(str));

        String str2 = "123o";
        System.out.println(str2+" 는 숫자입니까? " + isNumber(str2));
    }
}
