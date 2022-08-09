package cn.tedu.csmall.passport.web;

import cn.tedu.csmall.passport.ex.ServiceException;
import io.swagger.models.auth.In;
import lombok.Data;

import java.io.Serializable;
@Data
public class JsonResult<T> implements Serializable {
    private Integer state;
    private T data;
    private String message;

    public static JsonResult ok(){
        return ok(null);
    }

    public static <T> JsonResult<T> ok(T data){
        JsonResult jsonResult = new JsonResult();
        jsonResult.setState(ServiceCode.OK);
        jsonResult.setData(data);
        return jsonResult;
    }

    public static JsonResult fail(ServiceException e){
        return JsonResult.fail(e.getState(),e.getMessage());
    }
    public static JsonResult<Void> fail(Integer code,String message){
        JsonResult jsonResult = new JsonResult();
        jsonResult.setState(code);
        jsonResult.setMessage(message);
        return jsonResult;
    }

}
