import java.lang.Math;

public class Ex1 {
  public static void main(String[] args) {
    int[] arrayA = new int[10];
    int[] arrayB = new int[11];
    int[] arrayC = new int[10];
    int[] arrayD = new int[10];


    System.out.print("A) ");
    for (int i = 0; i < arrayA.length; i++) {
      arrayA[i] = 10 - i;
    }

    Util.printIntArray(arrayA);

    System.out.print("B) ");
    for (int i = 0; i < arrayB.length; i++) {
      arrayB[i] = (int) Math.pow(i, 2);
    }
    
    Util.printIntArray(arrayB);

    System.out.print("C) ");
    int tens = 1;
    int mid_array = arrayC.length / 2;
    /* 
      Para cada posição do array, se i for menor do que a metade adiciona i + 1
      e coloca no array, caso não for multiplica o 10 por tens e adiciona +1 APÓS a multiplicação
    */
    for (int i = 0; i < arrayC.length; i++) {
      arrayC[i] = 
        mid_array > i 
          ? i + 1 
          : tens++ * 10
        ;
    }

    Util.printIntArray(arrayC);

    System.out.print("D) ");
    for (int i = 0; i < arrayD.length; i++) {
      arrayD[i] = (int) Math.pow(i, 2) + 3;
    }

    Util.printIntArray(arrayD);
  }
}
