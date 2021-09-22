package exercise1;

public class SutdaCard {

    public static void main(String[] args) {
        SutdaCard card1 = new SutdaCard(3,false);
        SutdaCard card2 = new SutdaCard();

        System.out.println(card1.info());
        System.out.println(card2.info());
    }

    private int num=0;
    private boolean isKwang=false;

    public SutdaCard(int num, boolean isKwang){
        this.num=num;
        this.isKwang=isKwang;
    }
    public SutdaCard(){
    }

    public String info(){
        if(num!=0) return num+"";
        if(!isKwang) return "1K";
        else return " ";
    }
}
