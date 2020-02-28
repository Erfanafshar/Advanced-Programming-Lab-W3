public class Main {
    public static void main(String[] args) {
        ClockDisplay cd1 = new ClockDisplay(12,58,40);
        for (int i=0 ; i < 100 ; i++ ){
            cd1.timeTick();
            System.out.println(cd1.getTime());
        }

    }
}
