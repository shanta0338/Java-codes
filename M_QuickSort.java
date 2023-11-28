class M_QuickSort{
    public static void main(String[]args) {
        int[]array = {1,23,5,690,1,-1,0};
        quick(array,0, array.length-1);
        //Printing
        for(int i: array) {
            System.out.print(i+" ");
        }
    }
    
    static void quick(int[] array, int left, int right) {

        if(left < right) {
            int pidx = partition(array,left,right);
            quick(array, left, pidx-1);
            quick(array, pidx+1, right);
        }
    }

    static int partition(int[] array,int left, int right) {
        int pivotx = pi(array, left, right);
        int pivot = array[pivotx];
        //Swaping
        int temp = array[pivotx];
        array[pivotx] = array[right];
        array[right] = temp;

        int i = left - 1;
        for(int j=left; j<right; j++) {

            if(array[j] < pivot) {
                i++;
                int temp1 = array[i];
                array[i] = array[j];
                array[j] = temp1;
            }
        }
        i++;
        int temp1 = array[i];
        array[i] = pivot;
        array[right] = temp1;
        return i;
    }
    
    static int pi(int[] array, int left, int right) {
        int mid = left + (right - left) / 2;
        if(array[left] > array[mid]) {
            int temp = array[left];
            array[left] = array[mid];
            array[mid] = temp;
        }

        if(array[left] > array[right]) {
            int temp = array[left];
            array[left] = array[right];
            array[right] = temp;
        }

        if(array[mid] > array[right]) {
            int temp = array[mid];
            array[mid] = array[right];
            array[right] = temp;
        }

        return mid;
    }
}