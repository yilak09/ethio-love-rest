import org.junit.Test;

public class ParandremTest {

    @Test
    public void parandrem(){
        int r;
        int sum=0;
        int n =456;
        int temp=n;
        while(n>0){
            r=n%10;
            System.out.println("r="+r);
            sum=(sum*10)+r;
            System.out.println("sum="+sum);
            n=n/10;
        }
        if(temp==sum){
            System.out.println("parandrem number");
        }else{
            System.out.println("non parndrem number");
        }

    }


    }

