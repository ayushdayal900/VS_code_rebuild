package ARRAYS;
public class Make_ae_print_ar {
    public static void main(String[] args) {

        int a[][]=new int[10][10];

        for(int i=0; i<10; i++){
            for(int j=0; j<10; j++){
                a[i][j]=0;
            }
        }


        for(int i=0; i<10; i++){
            for(int j=0; j<10; j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }






    }
}
