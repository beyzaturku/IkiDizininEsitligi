package ikidizininesitligi;

public class IkiDizininEsitligi {


    public static void main(String[] args) {
        
        int[] dizi1 = {3,4,7,8,9};
        int[] dizi2 = {3,4,7,8,9};
        
        for(int i=0; i<dizi1.length;i++)
        {
            System.out.print(dizi1[i] + " ");
           
        }
        System.out.println();
        for(int j=0; j<dizi2.length;j++) 
            {
                System.out.print(dizi2[j]+ " ");
            }
        
        int ortak=0;
        for(int i=0; i<dizi1.length;i++)
        {
            for(int j=0; j<dizi2.length;j++)
            {
                if(dizi1[i]==dizi2[j])
                {
                    
                    ortak++;
                    break;
                }
                
                else if(dizi1[i] != dizi2[i])
                {
                    System.out.println();
                    System.out.println("Dizi1 ve Dizi2 birbirine eşit değildir.");
                    break;
                }
                 
            }
        }
        System.out.println();
        if(ortak==5)
        {
            System.out.println("Dizi1 ve Dizi2 birbirine eşittir.");
        }
        else{
            System.out.println("Dizi1 ve Dizi2 birbirine eşit değildir.");
        }
        
      
        
      
            
    
        
            
        
        
      
    }
    
}
