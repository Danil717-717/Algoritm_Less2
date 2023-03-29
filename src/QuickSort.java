public class QuickSort {

    public static void sort(int[] array, int startPosition, int endPosition){
        int leftPosition = startPosition;
        int rightPosition = endPosition;
        int pivot = array[(startPosition + endPosition) / 2];
        do{
            while (array[leftPosition]<pivot){
                leftPosition++; //начинаем двигать элемент который больше пивота
            }
            while (array[rightPosition]>pivot){
                rightPosition++; ////начинаем двигать элемент который меньше пивота
            }
            if(leftPosition <= rightPosition){   //если эти элементы не пересикаются
                if(leftPosition<rightPosition){  // делаем их обмен
                    int temp = array[leftPosition];
                    array[leftPosition] = array[rightPosition];
                    array[rightPosition] = temp;
                }
                leftPosition++;     // после сдвигаем позиции
                rightPosition--;
            }
        }while(leftPosition<=rightPosition); //выполняется пока указатели не пересекуться
        if(leftPosition < endPosition){
            sort(array,leftPosition,rightPosition); //сортируем рекурсивно часть справа
        }
        if(startPosition < rightPosition){
            sort(array,startPosition,rightPosition); //часть слева
        }
    }
}
