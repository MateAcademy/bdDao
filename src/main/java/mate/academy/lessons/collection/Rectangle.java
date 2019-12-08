package mate.academy.lessons.collection;

/**
 * Необходимо написать класс Rectangle и реализовать в нем следующие методы:
 * getSquare() - ﻿возвращает значение площади
 * getWidth() - возвращает ширину
 * setWidth(int width) - устанавливает значение ширины
 * getHeight() - возвращает высоту
 * setHeight(int height) - устанавливает значение высоты
 */
public class Rectangle {
    private int width;
    private int height;

    double getSquare() {
        return width*height;
    }

    int getWidth() {
        return width;
    }

    void setWidth(int width) {
        this.width = width;
    }

    int getHeight() {
        return height;
    }

    void setHeight(int height) {
        this.height = height;
    }
}
