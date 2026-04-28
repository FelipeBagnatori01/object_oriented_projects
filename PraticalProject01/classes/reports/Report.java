package PraticalProject01.classes.reports;

import PraticalProject01.classes.reports.visitor.Visitor;

abstract class Report {
    private String title;
    private String text;

    public Report(String title, String text) {
        this.title = title;
        this.text = text;
    }

    public String getTitle() {
        return title;
    }

    public String getText() {
        return text;
    }

    abstract public void accept(Visitor v);
}
