package PraticalProject01.classes.reports;

import PraticalProject01.classes.reports.visitor.Visitor;

public class PopularityReport extends Report{

    public PopularityReport(String title, String text) {
        super(title, text);
    }
    
    public void accept(Visitor v) {
        v.visit(this);
    }
}
