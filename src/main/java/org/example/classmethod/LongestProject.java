package org.example.classmethod;

public class LongestProject {
    private int name;
    private int monthCount;

    public int getName() {
        return name;
    }

    public void setName(int name) {
        this.name = name;
    }

    public void setMonthCount(int monthCount) {
        this.monthCount = monthCount;
    }

    public int getMonthCount() {
        return monthCount;
    }

    @Override
    public String toString() {
        return "LongestProject{" +
                "name=" + name +
                ", monthCount=" + monthCount +
                '}';
    }
}
