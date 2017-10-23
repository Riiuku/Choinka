public class Up {
    public  Up(int level){
        //petla odpowiedzialna za tworzenie wierszy
        for(int i = 0; i < level; i++) {
            //petla odpowiedzialna za przenoszenie * w odpowiednie miejsca
            for(int x = level;x > i; x--) {
                System.out.print(" ");
            }
            //petla odpowiedzialna za tworzenie * elementow w wierszach
            for(int j = 0; j<=i; j++) {
                if(j == 0) {
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
