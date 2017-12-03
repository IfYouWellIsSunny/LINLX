package test.bwie.com.lijian1203lx.model;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import test.bwie.com.lijian1203lx.IApp;
import test.bwie.com.lijian1203lx.ListBean;
import test.bwie.com.lijian1203lx.bean.Bean;
import test.bwie.com.lijian1203lx.dao.DaoSession;

/**
 * Created by lj on 2017/12/3.
 */

public class MyModl {

          public  void  getData(final ModelCallBack callBack){

             Call<Bean>  call= IApp.service.get("88f7bbc507e3ecacfaeab2b47dd8936f");
              call.enqueue(new Callback<Bean>() {
                  @Override
                  public void onResponse(Call<Bean> call, Response<Bean> response) {
                    Bean bean=  response.body();
                      callBack.success(bean);
                        //添加
                      IApp.session.getListBeanDao().insertInTx(bean.getResult().getList());
                  }

                  @Override
                  public void onFailure(Call<Bean> call, Throwable t) {

                      callBack.failure(new Exception(""));
                  }
              });
          }

    public List<ListBean> getdb(DaoSession session){
        List<ListBean> list = session.getListBeanDao().loadAll();
        return list;
    }


}
