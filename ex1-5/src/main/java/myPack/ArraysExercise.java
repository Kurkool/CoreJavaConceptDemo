package myPack;

public class ArraysExercise {

    public ArraysExercise(){

    }

    public void arrProcedure(){
        int[] arr = new int[15];
        int incrementNum = 1;
        int summation = 0;
        double avg = 0;
        for (int i=0; i<arr.length; i++)
        {
            if(i!=0){
                arr[i] = incrementNum*2;
                incrementNum++;
                summation += arr[i];
                System.out.println(arr[i]);
            }else{
                arr[i] = incrementNum;
                summation += arr[i];
                System.out.println(arr[i]);
            }
        }

        avg = summation/arr.length;
        System.out.println("sum:"+summation);
        System.out.println("avg:"+avg);

    }
}
