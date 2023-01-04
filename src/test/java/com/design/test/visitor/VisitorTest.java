package com.design.test.visitor;

import com.design.pattern.visitor.BusinessReport;
import com.design.pattern.visitor.CEOVisitor;
import com.design.pattern.visitor.CTOVisitor;

/**
 * @project Design-Patterns
 * @package com.p6.test.visitor
 * @className test
 * @author: zhuyf
 * @Date:2022/12/09 10:33
 * @Description: //
 */
public class VisitorTest {

    public static void main(String[] args) {
        BusinessReport report = new BusinessReport();
        System.out.println("CEO看报表");
        report.showReport(new CEOVisitor());
        System.out.println("CTO看报表");
        report.showReport(new CTOVisitor());

    }
}
