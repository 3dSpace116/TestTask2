//Напишите пример обработки нескольких исключений в одном блоке catch.
public class Main {
    public static void main(String[] args) {

        int[] nums = {1, 2, 3};
        int[] nullArray = null;
try{
        System.out.println(nums[3]+nullArray[0]);}
catch(ArrayIndexOutOfBoundsException|NullPointerException e){
    System.out.println("Error");
}

    }
}