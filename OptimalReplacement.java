// importing packages to use classes in the page replacement program 
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class OptimalReplacement 
{
// creation of the main class to implement Optimal page replacement algorithm 
    public static void main(String[] args) throws IOException 
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int frames, pointer = 0, hit = 0, fault = 0,ref_len;//varaivles to initialize
        boolean isFull = false;
        int buffer[];
        int reference[];
        int mem_layout[][];
        //Entering the number of frames 
        System.out.println("Please enter the number of Frames: ");
        frames = Integer.parseInt(br.readLine());
		
        //Entering the string size of the reference
        System.out.println("Please enter the length of the Reference string: ");
        ref_len = Integer.parseInt(br.readLine());
        
        reference = new int[ref_len];
        mem_layout = new int[ref_len][frames];
        buffer = new int[frames];
        for(int j = 0; j < frames; j++)
                buffer[j] = -1;
			
        //code to enter the reference string to carry out optimal page replacement 
        System.out.println("Please enter the reference string: ");
        for(int i = 0; i < ref_len; i++)
        {
            reference[i] = Integer.parseInt(br.readLine());
        }
        System.out.println();
        for(int i = 0; i < ref_len; i++)
        {
         int search = -1;
         for(int j = 0; j < frames; j++)
         {
          if(buffer[j] == reference[i])
          {
           search = j;
           hit++;
           break;
          } 
         }// code to update the stack checking its capacity
         if(search == -1)
         {
          if(isFull)
          {
           int index[] = new int[frames];
           boolean index_flag[] = new boolean[frames];
           for(int j = i + 1; j < ref_len; j++)
           {
            for(int k = 0; k < frames; k++)
            {
             if((reference[j] == buffer[k]) && (index_flag[k] == false))
             {
              index[k] = j;
              index_flag[k] = true;
              break;
             }
            }
           }
           int max = index[0];
           pointer = 0;
           if(max == 0)
            max = 200;
           for(int j = 0; j < frames; j++)
           {
            if(index[j] == 0)
             index[j] = 200;
            if(index[j] > max)
            {
             max = index[j];
             pointer = j;
            }
           }
          }
		  
		  //updating pointer to the correct memory location after checking capacity 
          buffer[pointer] = reference[i];
          fault++;
          if(!isFull)
          {
           pointer++;
              if(pointer == frames)
              {
               pointer = 0;
               isFull = true;
              }
          }
         }
		 
		 // code to display the number strings 
            for(int j = 0; j < frames; j++)
                mem_layout[i][j] = buffer[j];
        }
        
        for(int i = 0; i < frames; i++)
        {
            for(int j = 0; j < ref_len; j++)
                System.out.printf("%3d ",mem_layout[j][i]);
            System.out.println();
        }
        
        System.out.println("The number of Hits: " + hit);
        System.out.println("Hit Ratio: " + (float)((float)hit/ref_len));
        System.out.println("The number of Faults: " + fault);
    }
    
}