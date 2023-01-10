/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    HashMap<Integer,String> hash_map1 = new HashMap<Integer,String>();
	    HashMap <Integer,String> hash_map2 = new HashMap<Integer,String>();
	    hash_map1.put(1,"Pratham");
	    hash_map2.put(2,"panjwani");
	    System.out.println("hashmap2 before insertion"+ hash_map2);
	    hash_map2.putAll(hash_map1);
	    System.out.println(hash_map2);
	    
	    
	    
	    
		
	}
}
