package dnt.spring.com.services;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class DemoService {

    private static final List<String> names=new ArrayList<>();

    public List<String> getNames(){
        return names;
    }

    public String addName(String name){
        for (String presentName:names){
            if(presentName.trim().toLowerCase().equals(name.trim().toLowerCase()) ){
                return name+" is already present!!!";
            }
        }
        names.add(name.trim());
        return "Added successfully!!!!!!!!!";
    }

    public String updateName(String name,Integer idx){
        for(int i=0;i<names.size();i++){
            if((i+1)==idx){
                names.set(idx-1,name);
                return "Successfully updated!!!!!";
            }
        }
        return "Invalid index="+idx;
    }

    public String removeName(String name){
        int count=0;
        for (String preName:names){
            if(preName.trim().toLowerCase().equals(name.trim().toLowerCase())){
                names.remove(count);
                return "Successfully removed name="+name;
            }
            count++;
        }
        return "Invalid name="+name+", this doesn't exist";
    }

}
