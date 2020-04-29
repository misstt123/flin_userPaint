package opslab.bean;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

/**
 * @Description:通用的结果集封装
 * @Author lyh-god
 * @Date 2020/4/29
 **/
@Getter
@Setter
@AllArgsConstructor
public class ResultBean {
    private String code;
    private Object data;
    private boolean success = false;
}
