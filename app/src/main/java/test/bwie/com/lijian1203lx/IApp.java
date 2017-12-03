package test.bwie.com.lijian1203lx;

import android.app.Application;

import com.facebook.drawee.backends.pipeline.Fresco;

import org.greenrobot.greendao.database.Database;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import test.bwie.com.lijian1203lx.dao.DaoMaster;
import test.bwie.com.lijian1203lx.dao.DaoSession;

/**
 * Created by lj on 2017/12/3.
 */

public class IApp extends Application {
public  static   MyRetrofit service;
public  static  DaoSession session;
    @Override
    public void onCreate() {
        super.onCreate();
        Fresco.initialize(this);

       Retrofit retrofit =   new Retrofit.Builder()
               .baseUrl("http://v.juhe.cn")
               .addConverterFactory(GsonConverterFactory.create())
               .build();
           service=   retrofit.create(MyRetrofit.class);

        DaoMaster.DevOpenHelper helper=   new DaoMaster.DevOpenHelper(this,"1203");
           Database database= helper.getWritableDb();
       session= new DaoMaster(database).newSession();
    }
}
