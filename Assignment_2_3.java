class Assignment_2_3
{
    public static void main(String Args[])
    {
        int i,j,k,l;
        for(i=0;i<5;i++)
        {
            for(j=0;j<5;j++)
            {
                if(((i+j)==2)||((i+j)==4)||((i+j)==6))                      // To print nos. where sum of rows and columns = 2,4,6
                {  
                    if(java.lang.Math.abs(i-j)<3)
                    {
                        if((java.lang.Math.abs(i-j)==0)&&(i==2))            // To categorise these patterns
                    System.out.print("c");
                    else 
                    System.out.print("a");
                    }
                    else 
                    System.out.print(" ");
                }
           else if(((i+j)==3)||(i+j)==5)                                    // To print nos. where sum of rows and columns= 3,5
                {
                 if((java.lang.Math.abs(i-j)<3)&&(java.lang.Math.abs(i-j)>0))
                    System.out.print("b");  
                    else
                    System.out.print(" ");
                }
                
                else                                                       // To. print rest blanks
                System.out.print(" ");
                
            }
        
            System.out.println();
        }
    }
}
