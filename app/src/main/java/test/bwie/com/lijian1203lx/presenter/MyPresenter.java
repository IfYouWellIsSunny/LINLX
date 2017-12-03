package test.bwie.com.lijian1203lx.presenter;

import java.util.List;

import test.bwie.com.lijian1203lx.IApp;
import test.bwie.com.lijian1203lx.ListBean;
import test.bwie.com.lijian1203lx.bean.Bean;
import test.bwie.com.lijian1203lx.model.ModelCallBack;
import test.bwie.com.lijian1203lx.model.MyModl;
import test.bwie.com.lijian1203lx.view.MyView;

/**
 * Created by lj on 2017/12/3.
 */

public class MyPresenter {

      private MyView myView;
     private MyModl myModl;
    public MyPresenter(MyView myView) {
        this.myView = myView;
        this.myModl=new MyModl();
    }

    public List<ListBean> getdb(){
        List<ListBean> list = myModl.getdb(IApp.session);
        return list;
    }


    public  void  getData(){

           myModl.getData(new ModelCallBack() {
               @Override
               public void success(Bean bean) {
                   if (myView!=null){

                        myView.success(bean);
                   }

               }

               @Override
               public void failure(Exception e) {
                   if (myView!=null){

                       myView.failure(e);
                   }
               }
           });

    }



}
