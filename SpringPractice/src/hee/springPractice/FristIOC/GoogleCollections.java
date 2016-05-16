package hee.springPractice.FristIOC;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map.Entry;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;

public class GoogleCollections {
	public static final List<String> imlist; //以前实现（方式一）
    public static final List<String> imlist2; //以前实现（方式二）
 
	    static{
	        List<String> list=new ArrayList<String>();
	        list.add("a");
	        list.add("b");
	        list.add("c");
	        imlist=Collections.unmodifiableList(list); //通过这种方式实现不可变的集合,以前实现（方式一）
	        imlist2=Collections.unmodifiableList(Arrays.asList("a","b","c")); //或者，通过这种方式实现不可变的集合,以前实现（方式二）
	    }
	
	    /**
	     * @param args
	     */
	    public static void main(String[] args) 
	    {
	        //常量列表
	        ImmutableList<String> imlist=ImmutableList.of("a", "b", "c");
	        //imlist.add("d"); //注意，编译会报异常
	        for(String s:imlist){
	            System.out.println(s);
	        }
	        
	        //常量Map
	        ImmutableMap<String,String> immap=new ImmutableMap.Builder<String,String>()
	                                            .put("a","1")
	                                            .put("b","2")
	                                            .put("c", "3")
	                                            .build();
	        for(Entry<String,String> e:immap.entrySet()){
	            System.out.println(e.getKey()+"="+e.getValue());
	        }
	        
	        //常量Set
	        ImmutableSet<String> imset=ImmutableSet.of("a","b","c");
	        for(String s:imset){
	            System.out.println(s);
	        }
	    }
}
