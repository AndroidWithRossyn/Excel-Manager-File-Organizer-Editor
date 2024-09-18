package com.example.excelreader;

import android.app.Application;
import android.content.Context;

import com.example.excelreader.model.OfficeModel;

import java.util.ArrayList;

public class MyApplication extends Application {
    private static MyApplication mInstance;
    private static ArrayList<OfficeModel> arrayListAll;
    public static MyApplication getInstance() {
        return mInstance;
    }
    private static synchronized void setInstance(MyApplication myApplication) {
        synchronized (MyApplication.class) {
            mInstance = myApplication;
        }
    }
    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(LocaleHelper.onAttach(base));
    }
    @Override
    public void onCreate() {
        super.onCreate();
        if (mInstance == null) {
            setInstance(this);
        }

        Utils.setTheme(this, SharedPreferenceUtils.getInstance(this).getBoolean(GlobalConstant.NIGHT_MODE_KEY, false));

        arrayListAll = new ArrayList<>();

    }
    public void setAllPdfList(ArrayList<OfficeModel> arrayList) {
        arrayListAll = arrayList;
    }
    public ArrayList<OfficeModel> getArrayListAll() {
        return arrayListAll;
    }

}
