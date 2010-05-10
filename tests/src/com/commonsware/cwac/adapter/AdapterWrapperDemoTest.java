package com.commonsware.cwac.adapter;

import android.test.ActivityInstrumentationTestCase;

/**
 * This is a simple framework for a test of an Application.  See
 * {@link android.test.ApplicationTestCase ApplicationTestCase} for more information on
 * how to write and extend Application tests.
 * <p/>
 * To run this test, you can type:
 * adb shell am instrument -w \
 * -e class com.commonsware.cwac.adapter.AdapterWrapperDemoTest \
 * com.commonsware.cwac.adapter.tests/android.test.InstrumentationTestRunner
 */
public class AdapterWrapperDemoTest extends ActivityInstrumentationTestCase<AdapterWrapperDemo> {

    public AdapterWrapperDemoTest() {
        super("com.commonsware.cwac.adapter", AdapterWrapperDemo.class);
    }

}
