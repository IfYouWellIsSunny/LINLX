package test.bwie.com.lijian1203lx;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import test.bwie.com.lijian1203lx.bean.Bean;
import test.bwie.com.lijian1203lx.presenter.MyPresenter;
import test.bwie.com.lijian1203lx.view.MyView;

public class MainActivity extends AppCompatActivity implements MyView{

    @BindView(R.id.recyclerview)
    RecyclerView recyclerview;
   private MyPresenter presenter;
   private  RecyclerviewAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
          presenter= new MyPresenter(this);
          presenter.getData();

        adapter=  new RecyclerviewAdapter(this);
        LinearLayoutManager manager=new LinearLayoutManager(this);
          recyclerview.setLayoutManager(manager);
            recyclerview.setAdapter(adapter);


        List<ListBean> list1 = presenter.getdb();
        if(list1 == null || list1.size() == 0){
            presenter.getData();
        }else {
            adapter.addList(list1);
        }
        List<ListBean> list = IApp.session.getListBeanDao().loadAll();
        for (ListBean newslistBean : list) {
            System.out.println(newslistBean.toString());
        }

    }


    @Override
    public void success(Bean bean) {

        adapter.add(bean);
    }

    @Override
    public void failure(Exception e) {

    }
}
