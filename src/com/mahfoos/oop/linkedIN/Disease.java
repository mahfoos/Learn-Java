package com.mahfoos.oop.linkedIN;

public class Disease {

    private String name;
    private boolean curable;

    public Disease(String name, boolean curable) {
        this.name = name;
        this.curable = curable;
    }

    public String getName() {
        return name;
    }

    public boolean isCurable() {
        return curable;
    }

    public void setCurable(boolean curable) {
        this.curable = curable;
    }
}
