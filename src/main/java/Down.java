public class Down {
    public Down(int level){
        for (int i = 0; i < level; i++) {
            for(int x = 0; x < i; x++) {
                System.out.print(" ");
            }
            for(int j = level;j > i;j-- ) {
                if(j == level) {
                    System.out.print("*");
                }
                else{
                    System.out.print("**");
                }

            }
            System.out.println();
        }
    }
}
