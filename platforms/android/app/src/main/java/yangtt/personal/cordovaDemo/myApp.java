package yangtt.personal.cordovaDemo;

import android.app.Application;
import android.content.Context;
import com.networkbench.agent.impl.NBSAppAgent;
public class myApp extends Application {
    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(base);
        initTingyun(base);
    }

    @Override
    public void onCreate() {
        super.onCreate();
    }
    public void initTingyun(Context context){
        String out_text_chengmy="";
        NBSAppAgent.setLicenseKey(out_text_chengmy)
                .withLocationServiceEnabled(true)
                .enableLogging(true)
                .setStartOption(511)
                .isCustomAppStart(true)
                .start(context);
        NBSAppAgent.setUserIdentifier("cordovaApp");
    }
}