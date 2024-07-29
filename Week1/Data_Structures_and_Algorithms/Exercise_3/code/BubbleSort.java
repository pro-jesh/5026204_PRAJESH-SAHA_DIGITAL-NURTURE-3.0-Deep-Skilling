package Week1.Data_Structures_and_Algorithms.Exercise_3.code;

public class BubbleSort {
    public static void bubbleSort(Order orders[])
    {
        for(int i=0;i<orders.length-1;i++)
        {
            for(int j=0;j<orders.length-1-i;j++)
            {
                if(orders[j].getTotalPrice()>orders[j+1].getTotalPrice())
                {
                    Order temp;
                    temp=orders[j];
                    orders[j]=orders[j+1];
                    orders[j+1]=temp;
                }
            }
        }

    }
}
