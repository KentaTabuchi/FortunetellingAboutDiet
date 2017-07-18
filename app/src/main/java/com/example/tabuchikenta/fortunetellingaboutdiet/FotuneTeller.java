package com.example.tabuchikenta.fortunetellingaboutdiet;

import android.util.Log;

import java.math.BigDecimal;
import java.util.Random;

/**
 * Created by tabuchikenta on 2017/07/17.
 */
public class FotuneTeller {
    private MainActivity activity;

    public FotuneTeller(MainActivity activity) {
        this.activity = activity;
    }

    public String getFotune(){
        String result;
        double weight;     //何kgか
        String resultIsFat = null;
        int jadgeFat;
        Random ramd1 = new Random();
        jadgeFat= ramd1.nextInt(2);
        if(jadgeFat == 0){
            resultIsFat = "太る";
        }
        else if(jadgeFat == 1){
            resultIsFat = "やせる";
        }

        Random rand2 = new Random();
        weight = rand2.nextDouble();
        BigDecimal decimal1 = new BigDecimal(weight);
        BigDecimal decimal2 = decimal1.setScale(1,BigDecimal.ROUND_DOWN);
        Log.d("decimal", String.valueOf(decimal2));
        result = "明日は" + decimal2 + "kg" + resultIsFat + "でしょう";
        return result;
    }
    public String getLuckyColor(){
        String result;
        String luckyColor[] = {"赤","黄","青","緑","黒","白","虹","迷彩"};
        Random rand = new Random();
        int index = rand.nextInt(8);
        result = "ラッキカラーは" + luckyColor[index] + "色です";
        return  result;
    }
    public String getLuckyAction(){
        String result = null;
        String[] luckyAction= activity.getResources().getStringArray(R.array.lucky_action);
        Random rand = new Random();
        int index = rand.nextInt(luckyAction.length);
        result = luckyAction[index];
        return result;
    }

}
