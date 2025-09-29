public class pattern {
    public static void main(FristStr[] args){
        int n=4;
        int m=5;
        //OUTER LOOP
        for(int i=1; i<=n; i++){
            //INNER LOOP
            for(int j=1; j<=m; j++){
                System.out.print("*");
            }
            System.out.println("*");
        }
    }
}
