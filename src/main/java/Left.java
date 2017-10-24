public class Left {
    public Left(int level){
        for(int i = 0; i < level; i++) {
            for(int x = level; x > i+1; x--) {
                System.out.print(" ");
            }
            for(int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i = 0; i < level-1; i++){
            for(int x = 0; x <= i; x++) {
                System.out.print(" ");
            }
            for(int j = level-1; j > i; j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
