// ITestInterface.aidl
package com.unknow.jason.testaidlproject;

// Declare any non-default types here with import statements

interface ITestInterface {
    /**
     * Demonstrates some basic types that you can use as parameters
     * and return values in AIDL.
     */
    void basicTypes(int anInt, long aLong, boolean aBoolean, float aFloat,
            double aDouble, String aString);

    void serviceTest(int test);
}
