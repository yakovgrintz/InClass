public class Logics implements MyGame {

    public static int checkGame(int[][] arr){
        int number = 0;
        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j <arr[i].length; j++) {
                number+=arr[i][j];
            }
        }
        if(number==WIN_OF_X){
            return X_PLAYER;
        } else if (number==WIN_OF_O) {
            return O_PLAYER;

        }else{
            return 0;
        }
    }
}
