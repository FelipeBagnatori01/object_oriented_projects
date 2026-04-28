package PraticalProject01.classes.reports.visitor;

import PraticalProject01.classes.reports.PopularityReport;
import PraticalProject01.classes.reports.ProfitReport;

public interface Visitor {
    void visit(ProfitReport profit);
    void visit(PopularityReport pupularity);
}
