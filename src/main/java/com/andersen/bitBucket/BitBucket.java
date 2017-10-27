package com.andersen.bitBucket;

import java.util.ArrayList;
import java.util.Objects;

class BitBucket extends ArrayList<Integer> {

    public void add(int index, Integer value) {
        if (value != null) {
            if (index < size()) {
                super.add(index, value);
                int temp;
                for (int i = 0; i < size(); i++) {
                    if (i == index)
                        continue;
                    temp = super.get(i);
                    temp += value;
                    super.set(i, temp);
                }
            }
        } else System.out.println("Попытка ввести null в целочисленную коллекцию. " +
                "Элемент не добавлен.");
    }

    public boolean add(Integer value) {
        if (value != null) {
            super.add(value);
            int temp;
            for (int i = 0; i < size() - 1; i++) {
                temp = super.get(i);
                temp += value;
                super.set(i, temp);
            }
            return true;
        } else {
            System.out.println("Попытка ввести null в целочисленную коллекцию. " +
                    "Элемент не добавлен.");
            return false;
        }
    }

    void removeForIndex(int index) {
        if (index < size()) {
            int value = super.get(index), temp;
            super.remove(index);
            for (int i = 0; i < super.size(); i++) {
                temp = super.get(i);
                temp -= value;
                super.set(i, temp);
            }
        } else System.out.println("Нет элемента с индексом " + index + " в коллекции.");
    }

    void remove(Integer value) {
        int temp = -1, tempValue = 0, dec;
        for (int i = 0; i < size(); i++) {
            if (Objects.equals(super.get(i), value)) {
                temp = i;
                tempValue = super.get(i);
                super.remove(value);
                break;
            }
        }
        if (temp == -1) System.out.println("Нет значения " + value + " в коллекции.");
        else
            for (int i = 0; i < size(); i++) {
                dec = super.get(i);
                dec -= tempValue;
                super.set(i, dec);
            }
    }

    int searchValue(int value) {
        for (int i = 0; i < size(); i++)
            if (super.get(i) == value) {
                System.out.println("Элемент найден по индексу: " + i);
                return super.get(i);
            }
        System.out.println("Нет значения " + value + " в коллекции.");
        return 0;
    }

    int searchIndex(int index) {
        if (index < size())
            return super.get(index);
        else {
            System.out.println("Нет элемента с индексом " + index + " в коллекции.");
            return 0;
        }
    }

    int maxVal() {
        int max = super.get(0);
        for (int val : this) {
            if (max < val) {
                max = val;
            }
        }
        return max;
    }

    int minVal() {
        int min = super.get(0);
        for (int val : this) {
            if (min < val) {
                min = val;
            }
        }
        return min;
    }

    int averageVal() {
        int sum = 0;
        for (int val : this) {
            sum += val;
        }
        return sum / size();
    }

    void printList() {
        System.out.print("[");
        for (int val : this) {
            System.out.print(val + " ");
        }
        System.out.println("\b]\n");
    }
}
