package opslab.bean;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

/**
 * @Description:分页对象
 * @Author lyh-god
 * @Date 2020/4/29
 **/
@Getter
@Setter
@NoArgsConstructor
public class PageBean<T> {
    //当前页
    private Integer currentPage = 0;
    //每页显示的总条数
    private Integer pageSize;
    //总条数
    private Long total;
    //是否有下一页
    private Integer isMoore;
    //总页数
    private Integer totalPage;
    //开始索引
    private Integer startIndex;
    //分页结果
    private List<T> rows;
}
