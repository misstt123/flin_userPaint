package opslab.functions;

/**
 * @Description:对象过滤接口
 * @Author lyh-god
 * @Date 2020/4/29
 **/
public interface ObjectFilter<T> {
    boolean filter(T t);
}
