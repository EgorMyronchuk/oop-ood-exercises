package org.com.preparingOOD.behavioralpatterns.visitorpattern;

public interface DocumentElement {
   public void accept(DocumentVisitor visitor);
}
