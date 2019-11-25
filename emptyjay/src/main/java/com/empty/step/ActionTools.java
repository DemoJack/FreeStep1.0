package com.empty.step;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.Toast;


/**
 * @author Administrator
 */
public class ActionTools {

    private volatile static ActionTools actionTools;
    private Context context;


    private ActionTools(Context context) {
        this.context = context;
    }

    public static ActionTools getSingleton(Context context) {
        if (actionTools == null) {
            synchronized (ActionTools.class) {
                if (actionTools == null) {
                    actionTools = new ActionTools(context);
                }
            }
        }
        return actionTools;
    }

    public void StartFlow() {
        Toast.makeText(context, "更新之前", Toast.LENGTH_SHORT).show();
    }
}
