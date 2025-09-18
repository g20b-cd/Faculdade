package lista4;

class Invertearray{
    public static void main(String args[]){

        int[] A = {1,2,3,4,5,6,7,8,9,10};
        int[] a = new int[10];
        int j = 0;
        for(int i = (A.length - 1); i >= 0; i--){

            a[j] = A[i];
            j++;

        }
        for(int i = 0; i <= (a.length - 1); i++){

            System.out.println(a[i]);
            System.out.println(A[i]);
            
        }
    }
}