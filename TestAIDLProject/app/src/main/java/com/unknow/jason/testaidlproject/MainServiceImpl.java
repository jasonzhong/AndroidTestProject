package com.unknow.jason.testaidlproject;

import android.os.RemoteException;

/**
 * Created by admin on 2015/10/10.
 */
public class MainServiceImpl extends ITestInterface.Stub {
    @Override
    public void basicTypes(int anInt, long aLong, boolean aBoolean, float aFloat, double aDouble, String aString) throws RemoteException {
        return;
    }

    @Override
    public void serviceTest(int test) throws RemoteException {
        return;
    }

    private static MainServiceImpl sServiceManager;
    public synchronized static MainServiceImpl getInstance() {
        if (sServiceManager == null) {
            sServiceManager = new MainServiceImpl();
        }
        return sServiceManager;
    }
}
