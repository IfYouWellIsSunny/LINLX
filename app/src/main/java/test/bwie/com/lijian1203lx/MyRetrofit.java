package test.bwie.com.lijian1203lx;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;
import test.bwie.com.lijian1203lx.bean.Bean;

/**
 * Created by lj on 2017/12/3.
 */

public interface MyRetrofit {

//http://v.juhe.cn/weixin/query?key=88f7bbc507e3ecacfaeab2b47dd8936f
    @GET("weixin/query")
    Call<Bean> get(@Query("key") String key);

}
