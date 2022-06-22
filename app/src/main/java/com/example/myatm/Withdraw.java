package com.example.myatm;
public class Withdraw {
    public static String wd(CharSequence c, String amount, CharSequence d) {
        String r = "";
        int inHand = Integer.parseInt(c.toString());
        int money = Integer.parseInt(amount);
        int account = Integer.parseInt(d.toString());
        if (account > 0 && account >= money) {
            r += inHand + money;
        } else {
            r = c.toString();
        }
        return r;
    }
    public static String wdm(CharSequence d, String amount) {
        String r= "";
        int account = Integer.parseInt(d.toString());
        int money = Integer.parseInt(amount);
        if (account > 0 && account >= money){
            r += account - money;
        }else{
            r = d.toString();
        }
        return r;
    }
}
