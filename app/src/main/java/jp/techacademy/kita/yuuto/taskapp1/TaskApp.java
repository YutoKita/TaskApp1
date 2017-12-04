package jp.techacademy.kita.yuuto.taskapp1;

import android.app.Application;

import io.realm.Realm;

/**
 * Created by KITA on 2017/12/05.
 */

public class TaskApp extends Application{
    @Override
    public void onCreate(){
        super.onCreate();
        Realm.init(this);
    }
}
