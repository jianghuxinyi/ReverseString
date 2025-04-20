package com.linanqing.test.ui;

import android.util.Log;

import java.util.Arrays;

public class Reverse {

    public static String ReverseStr(String str){
        Log.e("LOG","str is "+str);
        str = str.replace(" ",".");
        Log.e("LOG", str);
        String[]  split = str.split("\\.");
        int len = split.length;
        String strResult = "";
        Log.e("LOG", Arrays.toString(split));
        Log.e("LOG","sss:"+split[1]);
        for(String e : split){
            Log.e("LOG",":"+e);
        }
        for (int i =0; i< len;i++){
            Log.e("LOG","split[i]："+split[i]);
            if(split[i].equals("")){
                Log.e("LOG","return");
                continue;
            }
            strResult += split[len-i-1];

            if (i < len -1){
                strResult += " ";
            }

        }
        Log.e("LOG","result is :"+strResult);
        return strResult;
    }
}
