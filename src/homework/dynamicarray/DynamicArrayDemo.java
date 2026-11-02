package homework.dynamicarray;

public class DynamicArrayDemo {
    public static void main(String[] args) {
        DynamicArray obj = new DynamicArray();
        for (int i = 0; i < 5; i++) {
            obj.add(i + 1);

        }
        obj.print();

        for (int i = 0; i < 15; i++) {
            obj.add(i + 1);

        }
        System.out.println(obj.getByIndex(10));
        obj.print();
        for (int i = 0; i < 40; i++) {
            obj.add(i + 1);
        }
        obj.print();
        System.out.println(obj.getByIndex(0));
        System.out.println(obj.getByIndex(obj.getSize() - 1));
        System.out.println(obj.getByIndex(-1));
        System.out.println(obj.getByIndex(obj.getSize() + 1));
        DynamicArray obj1 = new DynamicArray();
        System.out.println(obj1.getByIndex(0));
    }


}


