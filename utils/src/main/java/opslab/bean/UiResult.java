package opslab.bean;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @Description:返回统一的数据格式
 * @Author lyh-god
 * @Date 2020/4/29
 **/
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Setter
public class UiResult {
    //返回编码
    private String code;
    //编码描述
    private String msg;
    //业务数据
    private Object data;
}
