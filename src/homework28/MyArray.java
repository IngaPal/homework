package homework28;

import java.util.Arrays;

public class MyArray {
    private int size;
    private double[] array;

    public MyArray() {
        array = new double[0];
    }
    public MyArray(double[] array) {
        this.array = new double[array.length];
        copy(array, this.array);
    }
    private void copy(double[] src, double[] dst) {
        for (int i = 0; i < src.length; i++) {
            dst[i] = src[i];
        }
    }
    public double get(int index) {
        return array[index];
    }
    public void set(int index, double value) {
        array[index] = value;
    }
    public int size() {
        return array.length;
    }
    public int indexOf(double val) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == val) {
                return i;
            }
        }
        return -1;
    }
    public void add(int index, double val) {
        if (index < 0 || index > array.length) {
            return;
        }
        double[] newArray = new double[array.length + 1];
        copy(array, newArray);
        for (int i = newArray.length - 1; i > index; i--) {
            newArray[i] = newArray[i - 1];
        }
        newArray[index] = val;
        array = newArray;
    }
    public void remove(int index) {
        if (index >= 0 && index < array.length) {
            double[] newArray = new double[array.length - 1];
            for (int i = 0, j = 0; i < array.length; i++) {
                if (i != index) {
                    newArray[j++] = array[i];
                }
            }
            array = newArray;
        }
    }
    public String toString() {
        String res = "[ ";
        for (int i = 0; i < array.length; i++) {
            res += array[i];
            if (i != array.length - 1) {
                res += ", ";
            }
        }
        res += " ]";
        return res;
    }
    // homework28 Дополнить описаннный:

    //возвращает true если значение val есть в этом массиве, false в противном случае
    public boolean contains(double val) {
        return indexOf(val) != -1;
    }
    // возвращает true если массив пустой
    public boolean isEmpty() {
        return array.length == 0;
    }
    // добавляет элемент со значением val в конец
    public void add(double val) {
        array = Arrays.copyOf(array, array.length + 1);
        array[array.length - 1] = val;
    }
    // удаляет последний элемент
    public void removeLast() {
        if (array.length > 0) array = Arrays.copyOf(array, array.length - 1);
    }
    // удаляет первое значение из массива, равное переданному
    public void remove(double val) {
        while (indexOf(val) != -1) remove(indexOf(val));
    }
    // заменяет значение val в массиве на значение newVal
    public void replace(double val, double newVal) {
        if (indexOf(val) != -1) set(indexOf(val), newVal);
        }
    }
