package PraticalProject01.classes.reports.visitor;

import PraticalProject01.classes.reports.PopularityReport;
import PraticalProject01.classes.reports.ProfitReport;

public class PdfVisitor implements Visitor{
    
    public void visit(ProfitReport profit){
        System.out.println("Criando Relatorio de Lucros em PDF: " + profit.getTitle());
    }

    public void visit(PopularityReport popularity){
        System.out.println("Criando Relatorio de Popularidade em PDF: " + popularity.getTitle());
    }
}
