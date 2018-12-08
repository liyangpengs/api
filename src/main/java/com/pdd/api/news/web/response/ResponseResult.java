package com.pdd.api.news.web.response;

/**
 * @author:liyangpeng
 * @date:2018/12/7 15:01
 */
public class ResponseResult {

    public static ResponseEntity Success(){
        ResponseEntity entity=new ResponseEntity();
        entity.setCode("0000");
        entity.setMessage("请求成功");
        return entity;
    }

    public static ResponseEntity Success(String msg){
        ResponseEntity entity=new ResponseEntity();
        entity.setCode("0000");
        entity.setMessage(msg);
        return entity;
    }

    public static ResponseEntity Success(Object obj){
        ResponseEntity entity=new ResponseEntity();
        entity.setCode("0000");
        entity.setMessage("请求成功");
        entity.setData(obj );
        return entity;
    }

    public static ResponseEntity Success(String msg,Object obj){
        ResponseEntity entity=new ResponseEntity();
        entity.setCode("0000");
        entity.setMessage(msg);
        entity.setData(obj );
        return entity;
    }

    public static ResponseEntity Error(){
        ResponseEntity entity=new ResponseEntity();
        entity.setCode("00001");
        entity.setMessage("请求失败");
        return entity;
    }

    public static ResponseEntity Error(String msg){
        ResponseEntity entity=new ResponseEntity();
        entity.setCode("0001");
        entity.setMessage(msg);
        return entity;
    }

    public static ResponseEntity Error(Object obj){
        ResponseEntity entity=new ResponseEntity();
        entity.setCode("00001");
        entity.setMessage("请求成功");
        entity.setData(obj );
        return entity;
    }

    public static ResponseEntity Error(String msg,Object obj){
        ResponseEntity entity=new ResponseEntity();
        entity.setCode("00001");
        entity.setMessage(msg);
        entity.setData(obj );
        return entity;
    }
}
