package org.com.preparingOOD.behavioralpatterns.visitorpattern;

import org.com.preparingOOD.behavioralpatterns.visitorpattern.concreteelement.Document;
import org.com.preparingOOD.behavioralpatterns.visitorpattern.concreteelement.Image;
import org.com.preparingOOD.behavioralpatterns.visitorpattern.concreteelement.Table;
import org.com.preparingOOD.behavioralpatterns.visitorpattern.concreteelement.Text;
import org.com.preparingOOD.behavioralpatterns.visitorpattern.concretevisitor.HtmlRenderVisitor;
import org.com.preparingOOD.behavioralpatterns.visitorpattern.concretevisitor.WordCountVisitor;

public class Demo {
    public static void main(String[] args) {
        Document document = new Document();

        document.addElement(new Text("Hello world from Visitor pattern"));
        document.addElement(new Image("photo.png", 800, 600));
        document.addElement(new Table(3, 4));
        document.addElement(new Text("Another text block with more words"));

        WordCountVisitor wordCountVisitor = new WordCountVisitor();
        HtmlRenderVisitor htmlRenderVisitor = new HtmlRenderVisitor();

        System.out.println("=== Word Count Visitor ===");
        document.accept(wordCountVisitor);
        System.out.println("Total words: ");

        System.out.println("\n=== HTML Render Visitor ===");
        document.accept(htmlRenderVisitor);
    }
}