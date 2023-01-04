package com.design.pattern.service.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * @project Design-Patterns
 * @package com.p6.pattern.service.entity
 * @className CourseEntity
 * @author: zhuyf
 * @Date:2022/12/07 14:03
 * @Description: //
 */
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Getter
@Setter
public class CourseEntity {

    private String name;

    private double price;
}
