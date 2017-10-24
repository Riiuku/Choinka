public class Right {
    public Right(int level)
    {
        for(int i = 0; i < level; i++) {
            for(int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i = 0; i < level-1; i++){
            for(int j = level-1; j > i; j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
