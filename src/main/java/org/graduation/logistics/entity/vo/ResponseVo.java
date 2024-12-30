package org.graduation.logistics.entity.vo;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class ResponseVo<T> {
    private String status;
    private Integer code;
    private String info;
    private T data;
    public static <T> ResponseVo success(T data){
        ResponseVo<T> res = new ResponseVo<T>();
        res.setCode(200);
        res.setInfo("请求成功");
        res.setData(data);
        return res;
    }

    public static ResponseVo success(String msg){
        ResponseVo res = new ResponseVo();
        res.setCode(200);
        res.setInfo(msg);
        return res;
    }

    public static ResponseVo success(){
        ResponseVo res = new ResponseVo();
        res.setCode(200);
        res.setInfo("请求成功");
        return res;
    }

    public static ResponseVo error(String msg){
        ResponseVo res = new ResponseVo();
        res.setCode(400);
        res.setInfo(msg);
        return res;
    }
}
