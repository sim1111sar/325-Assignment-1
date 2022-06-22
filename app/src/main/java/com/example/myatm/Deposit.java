package com.example.myatm;
public class Deposit {
    public static String dp(CharSequence c, String amount, CharSequence d) {
        String r = "";
        int inHand = Integer.parseInt(d.toString());
        int money = Integer.parseInt(amount);
        int account = Integer.parseInt(c.toString());

        if (inHand > 0 && inHand >= money) {
            r += account + money;
        } else {
            r = c.toString();
        }
        return r;
    }
    public static String dpm(CharSequence d, String amount) {
        String r= "";
        int inHand = Integer.parseInt(d.toString());
        int money = Integer.parseInt(amount);

        if (inHand >= money){
            r += inHand - money;
        }else{
            r = d.toString();
        }
        return r;
    }
}

