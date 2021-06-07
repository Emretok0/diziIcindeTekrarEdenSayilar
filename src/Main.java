public class Main {
    static boolean isFind(int[]arr, int value){
        for (int c: arr){
            if (value==c){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {

        int[] list = {3, 7, 3, 3, 2, 9, 10, 21, 1, 33, 9, 1};
        int[]list2 = new int[list.length];
        int i=0;
        for (int a=0; a< list.length; a++){
            for (int b=0; b< list.length; b++){
                if (b!=a && list[b]==list[a] && !isFind(list2, list[b])){
                    list2[i++]=list[b];
                }
            }
        }
        for (int z: list2){
            if (z!=0){
                System.out.println(z);
            }
        }
    }
}
