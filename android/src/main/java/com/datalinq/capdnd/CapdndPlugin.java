package com.datalinq.capdnd;

import com.getcapacitor.JSObject;
import com.getcapacitor.Plugin;
import com.getcapacitor.PluginCall;
import com.getcapacitor.PluginMethod;
import com.getcapacitor.annotation.CapacitorPlugin;

@CapacitorPlugin(name = "Capdnd")
public class CapdndPlugin extends Plugin {

    private Capdnd implementation = new Capdnd(getContext());

    @PluginMethod
    public void echo(PluginCall call) {
        String value = call.getString("value");

        JSObject ret = new JSObject();
        ret.put("value", implementation.echo(value));
        implementation.requestDoNotDisturbPermission();
        if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.M) {
            implementation.turnDoNotDisturbMode(true);
        }
        call.resolve(ret);
    }
}