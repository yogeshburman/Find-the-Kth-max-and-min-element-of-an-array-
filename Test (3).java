// Find the "Kth" max and min element of an array ?

class Test {
  public static void main (String []args){
    
    int max=2;
    
    int arr[]={1,5,8,2,0,7,9,5,3,81};
    
    for(int i=0;i<arr.length;i++){
      
      // Sorting elements in decreasing order for maximum element
      for(int j=i+1;j<arr.length;j++){
        
        if(arr[i]<arr[j]){
         
         int temp=arr[i];
         arr[i]=arr[j];
         arr[j]=temp;
          
        }
        
      }
      
      // sorting till kth element 
      if(max-1==i){
        System.out.print("k th largest element " + arr[i]);
        break;
      }
    }
    
    // for minimum elements -------------------------------------------- 
    
    System.out.println();
      int min=3;
      
      for(int i=0;i<arr.length;i++){
      
      // Sorting elements in increasing order for maximum element
      for(int j=i+1;j<arr.length;j++){
        
        if(arr[i]>arr[j]){
         
         int temp=arr[i];
         arr[i]=arr[j];
         arr[j]=temp;
          
        }
        
      }
      
      // sorting till kth element 
      if(min-1==i){
        System.out.print("k th smallest element " + arr[i]);
        break;
      }
    }
    
    
  }
}
