package com.pdd.api.news.dao.entity;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.annotation.JSONField;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.Date;

/**
 * @author:liyangpeng
 * @date:2018/12/7 14:23
 */
public class News_Content {
    /**
     * 新闻内容表自增id
     */
    private Integer news_id;
    /**
     * 新闻生成页面urlid
     */
    private String news_urlid;
    /**
     * 新闻标题
     */
    private String new_title;
    /**
     * 新闻链接
     */
    private String news_url;
    /**
     * 新闻正文缩略图
     */
    @JsonIgnore
    private String news_cover_thumbnail;
    private JSONArray news_cover_thumbnail_array;
    /**
     * 新闻封面
     */
    private String news_cover;
    /**
     * 新闻创建时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date news_createtime;
    /**
     * 新闻发布时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date news_publishtime;
    /**
     * 新闻来源
     */
    private String news_source;
    /**
     * 新闻类型
     */
    private Integer news_type;
    /**
     * 正文内容获取Key
     */
    private String news_cachekey;
    /**
     * 新闻来源站点
     */
    private String news_urlfrom;
    /**
     * 新闻状态
     */
    private Integer news_stat;
    /**
     * 是否删除标识
     */
    private Integer news_isdel;
    /**
     * 新闻缩略图数量
     */
    private Integer news_thumbnail_count;

    public Integer getNews_id() {
        return news_id;
    }

    public void setNews_id(Integer news_id) {
        this.news_id = news_id;
    }

    public String getNews_urlid() {
        return news_urlid;
    }

    public void setNews_urlid(String news_urlid) {
        this.news_urlid = news_urlid;
    }

    public String getNew_title() {
        return new_title;
    }

    public void setNew_title(String new_title) {
        this.new_title = new_title;
    }

    public String getNews_url() {
        return news_url;
    }

    public void setNews_url(String news_url) {
        this.news_url = news_url;
    }

    public String getNews_cover_thumbnail() {
        return news_cover_thumbnail;
    }

    public void setNews_cover_thumbnail(String news_cover_thumbnail) {
        this.news_cover_thumbnail = news_cover_thumbnail;
    }

    public String getNews_cover() {
        return news_cover;
    }

    public void setNews_cover(String news_cover) {
        this.news_cover = news_cover;
    }

    public Date getNews_createtime() {
        return news_createtime;
    }

    public void setNews_createtime(Date news_createtime) {
        this.news_createtime = news_createtime;
    }

    public Date getNews_publishtime() {
        return news_publishtime;
    }

    public void setNews_publishtime(Date news_publishtime) {
        this.news_publishtime = news_publishtime;
    }

    public String getNews_source() {
        return news_source;
    }

    public void setNews_source(String news_source) {
        this.news_source = news_source;
    }

    public Integer getNews_type() {
        return news_type;
    }

    public void setNews_type(Integer news_type) {
        this.news_type = news_type;
    }

    public String getNews_cachekey() {
        return news_cachekey;
    }

    public void setNews_cachekey(String news_cachekey) {
        this.news_cachekey = news_cachekey;
    }

    public String getNews_urlfrom() {
        return news_urlfrom;
    }

    public void setNews_urlfrom(String news_urlfrom) {
        this.news_urlfrom = news_urlfrom;
    }

    public Integer getNews_stat() {
        return news_stat;
    }

    public void setNews_stat(Integer news_stat) {
        this.news_stat = news_stat;
    }

    public Integer getNews_isdel() {
        return news_isdel;
    }

    public void setNews_isdel(Integer news_isdel) {
        this.news_isdel = news_isdel;
    }

    public Integer getNews_thumbnail_count() {
        return news_thumbnail_count;
    }

    public void setNews_thumbnail_count(Integer news_thumbnail_count) {
        this.news_thumbnail_count = news_thumbnail_count;
    }
    public JSONArray getNews_cover_thumbnail_array() {
        return JSONArray.parseArray(this.news_cover_thumbnail);
    }
}
