package com.p6.pattern.chain;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @project Design-Patterns
 * @package com.p6.pattern.chain
 * @className Member
 * @author: zhuyf
 * @Date:2022/12/07 12:45
 * @Description: //
 */
@Data
@AllArgsConstructor
public class Member {

    private String loginName;

    private String loginPass;

    private String roleName;

}
