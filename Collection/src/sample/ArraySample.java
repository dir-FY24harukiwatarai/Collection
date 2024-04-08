package sample;

import javax.print.attribute.standard.NumberUpSupported;
import javax.security.auth.callback.ConfirmationCallback;

public class ArraySample {

    public static void main(String[] args) {
        // TODO 自動生成されたメソッド・スタブ
        var numbers=new int[5];
        
        for(var i=0;i<numbers.length;i++) {
            numbers[i]=i*2;
        }
        
        for (var i=0;i<numbers.length;i++) {
            System.out.println(numbers[i]);
        }

    }

}
