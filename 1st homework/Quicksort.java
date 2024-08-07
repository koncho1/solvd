

public class Quicksort {
    public static void main(String[] args) {

        int[] array= {5,3,2,8,0,4,3,7,11};
        int len=array.length;
        quicksort(array,0,len-1);
        for (int i=0;i<len;i++){
            System.out.println(array[i]);
        }
    }

    static void quicksort(int[] array,int low, int high){
        if(low>high){
            return;
        }
        int p=partition(array,low,high);
        quicksort(array,low,p-1);
        quicksort(array,p+1,high);
    }
    static int partition(int[] array, int low, int high){
        int pivot=array[high];
        int i=low-1;
        for (int j=low;j<high;j++){
            if (array[j]<pivot){
                i++;
                int temp=array[i];
                array[i]=array[j];
                array[j]=temp;
            }
        }
        int temp=array[i+1];
        array[i+1]=array[high];
        array[high]=temp;
        return i+1;
    }
}