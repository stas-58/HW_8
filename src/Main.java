//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        /* Задача 1 (Объявление массивов) */
        int[] box = new int[]{1, 2, 3};
        float[] box2 = new float[]{1.57F, 7.654F, 9.986F};
        int[] box3 = new int[]{7, 14, 21, 28, 35, 42, 49, 56, 63, 70};


        System.out.println("Задача 2");
        for (int i = 0; i < box.length; i++) {
            if (i == box.length - 1) {
                System.out.println(box[i]);
                break;
            }
            System.out.print(box[i] + ", ");
        }
        for (int i = 0; i < box2.length; i++) {
            if (i == box2.length - 1) {
                System.out.println(box2[i]);
                break;
            }
            System.out.print(box2[i] + ", ");
        }
        for (int i = 0; i < box3.length; i++) {
            if (i == box3.length - 1) {
                System.out.println(box3[i]);
                break;
            }
            System.out.print(box3[i] + ", ");
        }
        System.out.println(" ");


        System.out.println("Задача 3");

        for (int i = 0; i < (box.length); i++) {
            if (i == box.length - 1) {
                System.out.println(box[(box.length - 1 - i)]);
                break;
            }
            System.out.print(box[(box.length - (1 + i))] + ", ");
        }

        for (int i = 0; i < (box2.length); i++) {
            if (i == box2.length - 1) {
                System.out.println(box2[(box2.length - 1 - i)]);
                break;
            }
            System.out.print(box2[(box2.length - (1 + i))] + ", ");
        }

        for (int i = 0; i < (box3.length); i++) {
            if (i == box3.length - 1) {
                System.out.println(box3[(box3.length - 1 - i)]);
                break;
            }
            System.out.print(box3[(box3.length - (1 + i))] + ", ");
        }

        System.out.println(" ");


        System.out.println("Задача 4");
        int i = 0;
        do {
            if (box[i] % 2 != 0)
                box[i] = box[i] + 1;
            i += 1;
        }
        while (i < box.length);

    }
}