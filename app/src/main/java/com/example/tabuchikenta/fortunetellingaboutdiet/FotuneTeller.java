package com.example.tabuchikenta.fortunetellingaboutdiet;

import java.util.Random;

/**
 * Created by tabuchikenta on 2017/07/17.
 */
public class FotuneTeller {

    public String getFotune(){
        String result;
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

        result = "明日は" + resultIsFat + "でしょう";
        return result;
    }
}
