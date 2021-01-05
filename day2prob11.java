/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1daycode;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;
import java.util.LinkedList;
import java.util.List;
import java.util.ArrayList;

class TrieNode {
    char data;     
    LinkedList<TrieNode> children; 
    TrieNode parent;
    boolean isEnd;
 
    public TrieNode(char c) {
    	data = c;
        children = new LinkedList<>();
        isEnd = false;        
    }  
    
    public TrieNode getChild(char c) {
        if (children != null)
            for (TrieNode eachChild : children)
                if (eachChild.data == c)
                    return eachChild;
        return null;
    }
    
    protected List<String> getWords() {
       List<String> list = new ArrayList<>();
       if (isEnd) {
    	   list.add(toString());
       }
       
       if (children != null) {
           for (TrieNode child : children) {
               if (child != null) {
                   list.addAll(child.getWords());
               }
           }
       }       
       return list; 
    }
    
	public String toString() {
		if (parent == null) {
		     return "";
		} else {
		     return parent.toString() + new String(new char[] {data});
		}
	}
}
 
class Trie {
    private TrieNode root;
 
    public Trie() {
        root = new TrieNode(' '); 
    }
 
    public void insert(String word) {
        if (search(word))
            return;    
        
        TrieNode current = root; 
        TrieNode pre ;
        for (char ch : word.toCharArray()) {
        	pre = current;
            TrieNode child = current.getChild(ch);
            if (child != null) {
                current = child;
                child.parent = pre;
            } else {
                 current.children.add(new TrieNode(ch));
                 current = current.getChild(ch);
                 current.parent = pre;
            }
        }
        current.isEnd = true;
    }
    
    public boolean search(String word) {
        TrieNode current = root;      
        for (char ch : word.toCharArray()) {
            if (current.getChild(ch) == null)
                return false;
            else {
                current = current.getChild(ch);    
            }
        }
        return current.isEnd;
    }
    
    public List<String> autocomplete(String prefix) {     
       TrieNode lastNode = root;
       for (int i = 0; i< prefix.length(); i++) {
	       lastNode = lastNode.getChild(prefix.charAt(i));
	       if (lastNode == null)
	    	   return new ArrayList<>();
       }
       
       return lastNode.getWords();
    }
}    

/**
 *
 * @author nhatnguyendang
 */
public class day2prob11 {
    
    //Implement an autocomplete system. That is, given a query string s and a set of all possible query strings, 
    //return all strings in the set that have s as a prefix.

    //For example, given the query string de and the set of strings [dog, deer, deal],
    //return [deer, deal].
    
    //Solution 1 : use Trie Data Structure
    
    
    
    private void Solution(String key, ArrayList<String> listItems){
        for (Iterator<String> iterator = listItems.iterator(); iterator.hasNext();) {
            String next = iterator.next();       
            String temp = next.substring(0, key.length());
            if(temp.compareTo(key)==0){
                System.out.println(next);
            }
        }
    }
    public static void main(String[] args) {
        //solution 1: use Trie data structure
         Trie t = new Trie();            
            t.insert("amazon"); 
            t.insert("amazon prime"); 
			t.insert("amazing"); 			 
            t.insert("amazing spider man"); 
            t.insert("amazed");
            t.insert("alibaba");
            t.insert("ali express");
            t.insert("ebay");
            t.insert("walmart");          
			List<String> a= t.autocomplete("ali");
         for (String s : a) {
             System.out.println(s);
         }
	  }
        
        
        //solution 2: not use Trie data structure
        /*ArrayList <String> listItems = new ArrayList<String>();
        listItems.add("chicago");
        listItems.add("colombia");
        listItems.add("vietnam");
        listItems.add("veneuzuela");
        listItems.add("france");
        Collections.sort(listItems);
        Scanner in = new Scanner(System.in);
        String key = in.next();
        day2prob11 prob11 = new day2prob11();
        prob11.Solution(key, listItems);
    }*/
}
