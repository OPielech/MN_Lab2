import java.math.BigInteger;

public class Silnia {

    public static void main(String[] args) {
        System.out.println(silnia(4));
        System.out.println(silnia2(4));

    }

    public static int silnia (int n){
        int silnia1=1;
        for(int i=1; i<=n; i++)
            silnia1*=i;
        return silnia1;
    }

    public static BigInteger silnia2(int value){
        BigInteger bigInteger=new BigInteger("1");
        for(int i=1; i<=value;i++){
            String temp=String.valueOf(i);
            bigInteger=bigInteger.multiply(new BigInteger(temp));
        }
        return bigInteger;
    }
}
