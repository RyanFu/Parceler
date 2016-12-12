package com.lzh.compiler.parcelerdemo.dispatcheres;

import android.app.Activity;
import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.support.annotation.Nullable;

import com.lzh.compiler.parceler.annotation.Arg;
import com.lzh.compiler.parceler.annotation.Dispatcher;

/**
 * Created by haoge on 2016/11/25.
 */

@Dispatcher
public class TestService extends Service {
    @Arg
    String username;
    @Arg
    String password;

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }
}
