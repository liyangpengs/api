package com.pdd.api.news.dao.mapper;

import org.apache.ibatis.annotations.Mapper;
import com.pdd.api.news.dao.entity.*;
import java.util.List;

/**
 * @author:liyangpeng
 * @date:2018/12/7 14:23
 */
@Mapper
public interface News_ContentMapper {
     List<News_Content> queryList();
}
