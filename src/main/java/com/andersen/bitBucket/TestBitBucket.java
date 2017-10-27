package com.andersen.bitBucket;

class TestBitBucket {
    public static void main(String[] args) {
        BitBucket bitBucket = new BitBucket();
        for (int i = 0; i < 10; i++)
            bitBucket.add(i);
        System.out.println("Содержимое коллекции после добавления: ");
        System.out.println(bitBucket);

        bitBucket.add(5, 6);
        bitBucket.add(2, 9);
        bitBucket.add(8, -2);
        System.out.println("Содержимое коллекции после добавления по индексу: ");
        System.out.println(bitBucket);

        bitBucket.removeForIndex(2);
        System.out.println("Содержимое коллекции после удаления по индексу: ");
        System.out.println(bitBucket);

        System.out.println("Удаление значений 6 и 10 в коллекции: ");
        bitBucket.remove((Integer) 6);
        bitBucket.remove((Integer) 10);
        System.out.println("Содержимое коллекции после удаления элементов через значения: ");
        System.out.println(bitBucket);

        System.out.println("Значение элемента коллекции по индексу 5: ");
        System.out.println(bitBucket.searchIndex(5));
        System.out.println();

        System.out.println("Поиск элемента по значению: ");
        System.out.println(bitBucket.searchValue(44));
        System.out.println();
        if (bitBucket.searchValue(100) == 0)
            System.out.println();

        System.out.println("Максимальный элемент в коллекции равен: " + bitBucket.maxVal());
        System.out.println("Минимальный элемент в коллекции равен: " + bitBucket.minVal());
        System.out.println("Среднее значение всех элементов в коллекции: " + bitBucket.averageVal());

        System.out.println();
        System.out.println("Введём null последним элементом.");
        bitBucket.add(null);
        System.out.println("Последний элемент: " + bitBucket.get(bitBucket.size() - 1));
    }
}
