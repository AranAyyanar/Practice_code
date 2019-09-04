    
import java.util.*;
class Main {
  static void main_function(){
    String k;
    k="((()))";
    String[] l=k.split("");
    int f=k.indexOf(")"),count=0;
    for(int i=0;i<l.length;i++){
      System.out.println(l[i]);
      if(l[i]=="("){
        System.out.println(l[i]);
        while(f<l.length){
          if(l[f]==")"){
            count=count+1;
            f=f+1;
            break;
          }
          
        }
      }
    }
    System.out.println(count);
  }
  public static void main(String[] args) {
    main_function();
  }
}
