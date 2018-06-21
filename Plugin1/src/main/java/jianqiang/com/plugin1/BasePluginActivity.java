package jianqiang.com.plugin1;

import android.app.Activity;

public class BasePluginActivity extends Activity {

    private static final String TAG = "Client-BaseActivity";

    /**
     * 等同于mProxyActivity，可以当作Context来使用，会根据需要来决定是否指向this<br/>
     * 可以当作this来使用
     */
    protected Activity that;
    protected String dexPath;

    public void setProxy(Activity proxyActivity, String dexPath) {
        that = proxyActivity;
        this.dexPath = dexPath;
    }
}
