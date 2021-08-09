public class Flipcoin {
    public static void main(String args[]) {

        int IS_coin=1;
        int count1=0;
        int count2=0;
        int randomcheck =(int) Math.floor(Math.random())%2;
        void count()
        {
            for (int i=1;i<=100;i++){
                if (IS_coin == randomcheck){
                    System.out.print("Head.");
                    count1++;

                }
                else{
                    System.out.print("Tail");
                    count2++;

                }
            }
            System.out.print("Head percentage"+count1);
            System.out.print("Tail percentage"+count2);

        }
    }
class percentage {

        flipcoin ab = new flipcoin();
        ab.count();

    }
}
}
