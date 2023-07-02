package rtn.frm.map;

import java.util.HashMap;

public class TargetSum {

    static Integer[] getIndies(Integer[] inputArr,Integer target){
        HashMap<Integer,Integer> elementIndicesMap=new HashMap<>();
        Integer[] result=new Integer[2];

        for (Integer i=0;i<inputArr.length;i++){
            elementIndicesMap.put(inputArr[i],i);
            Integer index=elementIndicesMap.get(target-inputArr[i]);
            if(index!=null && 2*inputArr[i]!=target){
                result[0]=index;
                result[1]=i;
                return result;
            }
        }
        return result;
    }
}
