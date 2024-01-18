package HomeWork4;

import org.w3c.dom.ls.LSOutput;

public class Box {
    private int width;
    private int heigth;
    private int depth;
    private String color;
    private boolean statusObjectInside;
    private boolean statusCloseness;

    public boolean isStatusObjectInside() {
        return statusObjectInside;
    }

    public void setStatusObjectInside(boolean statusObjectInside) {
        this.statusObjectInside = statusObjectInside;
    }

    public boolean isStatusCloseness() {
        return statusCloseness;
    }

    public void setStatusCloseness(boolean statusCloseness) {
        this.statusCloseness = statusCloseness;
    }

    public int getWidth() {
        return width;
    }

    public int getHeigth() {
        return heigth;
    }

    public int getDepth() {
        return depth;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Box(int width, int heigth, int depth, String color, boolean statusObjectInside, boolean statusCloseness) {
        this.width = width;
        this.heigth = heigth;
        this.depth = depth;
        this.color = color;
        this.statusObjectInside = statusObjectInside;
        this.statusCloseness = statusCloseness;
    }

    public void putInBox() {
        if (statusObjectInside == true) {
            System.out.println("В коробку нельзя положить предмет потому, что он уже в коробке");

        } else if (statusCloseness == true) {
                System.out.println("В коробку нельзя положить предмет потому, что она закрыта");

        } else {
            statusObjectInside = true;
            System.out.println("Предмет внутри коробки");
        }
    }


    public void pullOutBox() {
        if (statusObjectInside == false) {
            System.out.println("Из коробки нельзя достать предмет потому, что он его там нет");

        } else if (statusCloseness == true) {
            System.out.println("Из коробки нельзя достать предмет потому, что она закрыта");

        } else {
            statusObjectInside = false;
            System.out.println("Предмет достали из коробки");
        }
    }

    public void info() {
        System.out.println("У нас есть коробка");
        System.out.println("Размер кробки: " + width + "x" + heigth + "x" + depth);
        System.out.println("Цвет коробки: " + color);

        if (statusCloseness == true) {
            System.out.print("Сейчас коробка закрыта");
        } else {
            System.out.print("Сейчас коробка открыта");
        }

        if (statusObjectInside == true) {
            System.out.println(" и в ней есть предмет");
        } else {
            System.out.println(" и в ней нет предмета");
        }
        System.out.println();
    }

    public void openBox() {
        if (statusCloseness == false) {
            System.out.println("Коробка уже открыта");
        } else {
            statusCloseness = false;
            System.out.println("Коробка открыта");
        }
    }

    public void closeBox() {
        if (statusCloseness == true) {
            System.out.println("Коробка уже закрыта");
        } else {
            statusCloseness = true;
            System.out.println("Коробка закрыта");
        }
    }

}

