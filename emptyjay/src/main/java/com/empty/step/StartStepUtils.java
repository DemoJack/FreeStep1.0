package com.empty.step;

import android.content.Context;
import android.widget.Toast;


/**
 * @author Administrator
 */
public class StartStepUtils {

    private volatile static StartStepUtils startStepUtils;
    private Context context;


    private StartStepUtils(Context context) {
        this.context = context;
    }

    public static StartStepUtils getSingleton(Context context) {
        if (startStepUtils == null) {
            synchronized (StartStepUtils.class) {
                if (startStepUtils == null) {
                    startStepUtils = new StartStepUtils(context);
                }
            }
        }
        return startStepUtils;
    }

    public void StartFlow() {
        Toast.makeText(context, "更新之前", Toast.LENGTH_SHORT).show();
    }
}
