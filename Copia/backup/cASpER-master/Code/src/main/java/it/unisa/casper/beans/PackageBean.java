package it.unisa.casper.beans;

import java.util.ArrayList;
import java.util.Collection;

public class PackageBean {
    private String name;
    private Collection<ClassBean> classes;
    private String textContent;

    public PackageBean() {
        name = null;
        classes = new ArrayList<>();
    }

    public String getName() {
        return this.name;
    }

    public void setName(String pName) {
        this.name = pName;
    }

    public String getTextContent() {
        return textContent;
    }

    public void setTextContent(String textContent) {
        this.textContent = textContent;
    }

    public Collection<ClassBean> getClasses() {
        return this.classes;
    }

    public void setClasses(Collection<ClassBean> pClasses) {
        this.classes = pClasses;
    }

    public void addClass(ClassBean pClass) {
        classes.add(pClass);
    }

    public void removeClass(ClassBean pClass) {
        classes.remove(pClass);
    }

}
