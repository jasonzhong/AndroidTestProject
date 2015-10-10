package com.unknow.jason.testaidlproject;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

/**
 * Created by admin on 2015/10/10.
 */
public class MainService extends Service {

    private MainServiceImpl mainServiceImpl = MainServiceImpl.getInstance();

    @Override
    public IBinder onBind(Intent intent) {
        return mainServiceImpl;
    }
}
