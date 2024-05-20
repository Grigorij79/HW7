package org.example.classmethod;

public class PrintProjectPrices {
    private int project;
    private int price;

    public int getProject() {
        return project;
    }

    public void setProject(int project) {
        this.project = project;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "PrintProjectPrices{" +
                "project=" + project +
                ", price=" + price +
                '}' + "\n";
    }
}
