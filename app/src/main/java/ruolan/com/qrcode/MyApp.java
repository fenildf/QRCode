package ruolan.com.qrcode;

import android.app.Application;
import android.content.Context;

/**
 * Created by wuyinlei on 2017/11/28.
 */

public class MyApp extends Application{

    @Override
    public void onCreate() {
        super.onCreate();
        INSTANCE = this;
    }

    private static MyApp INSTANCE;

    public static Context getContext() {
        return INSTANCE.getApplicationContext();
    }
}
