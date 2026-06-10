



//frequency cunt in range of [0-9]
  /*public class FrequncYCount{
    public static void main(String[] args){
     int [] arr={0,1,3,1,2,3,0,1,3,2,1,0};
     int [] freq=new int[10];
     for(int i =0;i<arr.length;i++){
        freq[arr[i]]++;
     }
     for(int i =0;i<freq.length;i++){
        System.out.print(freq[i]+" ");
     }

    }
  }*/



    //frequency count but range is not fixed
    public class FrequencYCount{
        public static void main(String[] args){
          int[] arr = {1, 2, 3, 2, 1, 3, 1};
          boolean [] visited=new boolean[arr.length];
          for(int i=0;i<arr.length;i++){
            if(visited[i]){
              continue;
            }
            int count=1;
            for(int j=i+1;j<arr.length;j++){
              if(arr[i]==arr[j]){
                visited[j]=true;
                count++;
              }
            }
            System.out.println(arr[i]+" occurs "+count+" times.");

        }
    }}