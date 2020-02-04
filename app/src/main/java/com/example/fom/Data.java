package com.example.fom;

public class Data {
    private static Data mInstance= null;

    protected Data(){}


    public String path1 = "";
    public String path2 = "";
    public String path3 = "";
    public String Myname = "Dan";
    public String hero = "hero";
    public String date = "26/12/2019";


    public static synchronized Data getInstance() {
        if(null == mInstance){
            mInstance = new Data();
        }
        return mInstance;
    }
}

