package com.p6.test.visitor;

import com.p6.pattern.visitor.kpi.BusinessReport;
import com.p6.pattern.visitor.kpi.CEOVisitor;
import com.p6.pattern.visitor.kpi.CTOVisitor;

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
