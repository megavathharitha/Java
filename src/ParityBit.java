import java.util.Scanner;

public class ParityBit {
    public static void main(String[] args) {
        int bt[]=new int[8];
        int i,count=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("\n \t\t Data transfer from sender to receiver");
        System.out.println("\n select mode to transfer");
        System.out.println("1.Even parity\n 2.odd parity");
        int mo=sc.nextInt();
        if(mo==1){
            System.out.println("Even parity is selected");
            System.out.println("sender:(enter 7 bit binary data)");
            for(i=0;i<7;i++)
                bt[i]=sc.nextInt();
            System.out.println("The data you entered is:");
            for(i=0;i<7;i++)
                System.out.print(""+bt[i]);
            System.out.println("\n press Y to continue or n to cancel");
            char CF=sc.next().charAt(0);
            if(CF=='y'){
                for(i=0;i<7;i++){
                    if(bt[i]==1){
                        count++;
                    }
                }
                if(count%2==0){
                    bt[7]=0;
                }
                else{
                    bt[7]=1;
                }
                System.out.println("The data after checking");
                for(i=0;i<8;i++)
                    System.out.println(" "+bt[i]);
                System.out.println("The received data is");
                for(i=0;i<8;i++)
                    System.out.print(" "+bt[i]);
                System.out.println("The actual data received ");
                for(i=0;i<7;i++)
                    System.out.println(" "+bt[i]);
                System.out.println("\n \t\t the data transferred successfullly completed");


            }
            else {
                System.exit(0);
            }

        }
        else if(mo==2){
            System.out.println("Odd parity is selected");
            System.out.println("enter 7 bit binary data");
            for(i=0;i<7;i++)
                bt[i]=sc.nextInt();
            System.out.println("The data you entered is:");
            for(i=0;i<7;i++)
                System.out.print(""+bt[i]);
            System.out.println("\n press Y to continue or n to cancel");
            char CM=sc.next().charAt(0);
            if(CM=='y'){
                for(i=0;i<7;i++){
                    if(bt[i]==1){
                        count++;
                    }
                }
                if(count%2!=0){
                    bt[7]=1;
                }
                else{
                    bt[7]=0;
                }
                System.out.println("The data after checking");
                for(i=0;i<8;i++)
                    System.out.println(" "+bt[i]);
                System.out.println("The received data is");
                for(i=0;i<8;i++)
                    System.out.print(" "+bt[i]);
                System.out.println("The actual data received ");
                for(i=0;i<7;i++)
                    System.out.println(" "+bt[i]);
                System.out.println("\n \t\t the data transferred successfullly completed");

            }
            else{
                System.exit(0);
            }
        }
        else{
            System.out.println("Wrong entry");
            System.exit(0);
        }
    }
}
