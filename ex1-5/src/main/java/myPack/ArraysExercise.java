package myPack;

public class ArraysExercise {

    public ArraysExercise(){

    }

    public void arrProcedure(){
        int[] array = new int[15];
        int summation = 0;
        int average = 0;
        for(int i = 0; i < array.length; i++) {
            if(i != 0){
                array[i] = array[i - 1] * 2;
                summation += array[i];
            }else{
                array[i] = 1;
                summation += array[i];
            }
        }

        average = summation / array.length;
        System.out.println("The array is: " + Arrays.toString(array));
        System.out.println("The summation is: " + summation);
        System.out.println("The average is: " + average);

    }
}
