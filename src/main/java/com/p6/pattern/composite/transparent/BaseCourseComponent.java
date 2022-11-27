package com.p6.pattern.composite.transparent;

/**
 * @project Design-Patterns
 * @package com.p6.pattern.composite.transparent
 * @className CourseComponent
 * @author: zhuyf
 * @Date:2022/11/27 12:48
 * @Description: //
 */
public abstract class BaseCourseComponent {

    public void addChild(BaseCourseComponent component){
        throw new UnsupportedOperationException("不支持添加操作");
    }

    public void removeChild(BaseCourseComponent component){
        throw new UnsupportedOperationException("不支持删除操作");
    }

    public String getName(BaseCourseComponent component){
        throw new UnsupportedOperationException("不支持获取名称操作");
    }

    public double getPrice(BaseCourseComponent component){
        throw new UnsupportedOperationException("不支持获取价格操作");
    }

    public void print(){
        throw new UnsupportedOperationException("不支持打印操作");
    }


}
