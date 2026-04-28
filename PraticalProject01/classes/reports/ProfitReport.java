package PraticalProject01.classes.reports;

import PraticalProject01.classes.reports.visitor.Visitor;

public class ProfitReport extends Report{

    public ProfitReport(String title, String text) {
        super(title, text);
    }
    
    public void accept(Visitor v) {
        v.visit(this);
    }
}
