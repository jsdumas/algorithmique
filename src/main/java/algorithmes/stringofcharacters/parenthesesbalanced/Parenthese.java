package algorithme.stringofcharacters.parenthesesbalanced;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Parenthese {
	
	public boolean isBalanced(String isBalenced){
		
		Stack<String> charStack = new Stack<String>();
		String braces ="{}";
		String brackets ="[]";
		String parentheses ="()";
		
//		System.out.println(isBalenced.length());
		
		for(int i=0; i<isBalenced.length(); i++){
			String current = isBalenced.substring(i, i+1);
//			System.out.println("current avant if  "+current);
			
				if(current.equals("{") || current.equals("[") || current.equals("(")){
					charStack.push(current);
//					System.out.println("current "+current);
				} else if(current.equals("}") || current.equals("]") || current.equals(")")){ {
					
					String couple = "";
					if(!charStack.isEmpty()){
						couple = charStack.peek()+current;
					}
//					System.out.println("couple "+couple);
					
					if(charStack.isEmpty() 
							|| (!couple.equals(braces) && !couple.equals(brackets) && !couple.equals(parentheses) ) ){
						return false;
					} else {
						charStack.pop();
					}
					
				}
			}
		}
		return charStack.isEmpty()? true : false;
	}

}
