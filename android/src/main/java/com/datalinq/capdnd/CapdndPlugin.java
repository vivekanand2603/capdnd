package com.datalinq.capdnd;

import android.app.NotificationManager;
import android.content.Context;
import android.os.Build;
import androidx.annotation.RequiresApi;
import com.getcapacitor.JSObject;
import com.getcapacitor.Plugin;
import com.getcapacitor.PluginCall;
import com.getcapacitor.PluginMethod;
import com.getcapacitor.annotation.CapacitorPlugin;

@CapacitorPlugin(name = "Capdnd")
public class CapdndPlugin extends Plugin {

    @PluginMethod
    public void turnOnDoNotDisturb(PluginCall call) {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            turnDoNotDisturbMode(true);
            call.resolve();
        } else {
            call.reject("This feature requires Android M (API level 23) or higher");
        }
    }

    @PluginMethod
    public void turnOffDoNotDisturb(PluginCall call) {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            turnDoNotDisturbMode(false);
            call.resolve();
        } else {
            call.reject("This feature requires Android M (API level 23) or higher");
        }
    }

    @RequiresApi(api = Build.VERSION_CODES.M)
    private void turnDoNotDisturbMode(boolean enable) {
        NotificationManager notificationManager = (NotificationManager) getContext().getSystemService(Context.NOTIFICATION_SERVICE);
        if (notificationManager != null) {
            int mode = enable ? NotificationManager.INTERRUPTION_FILTER_NONE : NotificationManager.INTERRUPTION_FILTER_ALL;
            notificationManager.setInterruptionFilter(mode);
        }
    }
}
