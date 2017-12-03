package test.bwie.com.lijian1203lx.model;

import test.bwie.com.lijian1203lx.bean.Bean;

/**
 * Created by lj on 2017/12/3.
 */

public interface ModelCallBack {

    public  void  success(Bean bean);
    public  void  failure(Exception e);

}
