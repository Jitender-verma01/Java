import java.util.*;
public class weekly {
    public static void main(String[] args) {
        float f (float x,int y){
            float p,s;
            int i;
            for(s=1,p=1,i=1;i<y;i++){
                p*=x/i;
                s +=p;
            }
            return s;
        }

    }
}
