package test.bwie.com.lijian1203lx;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Generated;

/**
 * Created by lj on 2017/12/3.
 */
@Entity
public class ListBean {

    /**
     * id : wechat_20171203011145
     * title : 缅怀今圣南怀瑾先生——《南怀瑾选集》最新100套开放结缘
     * source : 南师国学智慧
     * firstImg : http://zxpic.gtimg.com/infonew/0/wechat_pics_-60690027.jpg/640
     * mark :
     * url : http://v.juhe.cn/weixin/redirect?wid=wechat_20171203011145
     */
    @Id(autoincrement = true)
    private  Long sid;
    private String id;
    private String title;
    private String source;
    private String firstImg;
    private String mark;
    private String url;

    @Generated(hash = 894169133)
    public ListBean(Long sid, String id, String title, String source,
            String firstImg, String mark, String url) {
        this.sid = sid;
        this.id = id;
        this.title = title;
        this.source = source;
        this.firstImg = firstImg;
        this.mark = mark;
        this.url = url;
    }

    @Generated(hash = 777734033)
    public ListBean() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getFirstImg() {
        return firstImg;
    }

    public void setFirstImg(String firstImg) {
        this.firstImg = firstImg;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Long getSid() {
        return this.sid;
    }

    public void setSid(Long sid) {
        this.sid = sid;
    }


}
