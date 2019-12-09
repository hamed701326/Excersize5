package question1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;

public class MainClass {
    public static void main(String[] args) {
        List<Integer> arrayList=new ArrayList<>();
        Collections.addAll(arrayList,3,7,9,2,5,5,8,5,6,3,4,7,3,1) ;
        delete(arrayList);
        System.out.println(Arrays.toString(arrayList.toArray()));

    }
    public static void delete(List<Integer> arrayList){
        List<Integer> arrayList2=new ArrayList<>();
        if(arrayList.size()%2!=0) arrayList.remove(arrayList.size()-1);
        for(int i=0;i<arrayList.size();i=i+2){
            int a=arrayList.get(i);
            int b=arrayList.get(i+1);
           if(a<=b){
               Collections.addAll(arrayList2,a,b);
           }
       }
        System.out.println(Arrays.toString(arrayList2.toArray()));
        arrayList= arrayList2;
    }
}
