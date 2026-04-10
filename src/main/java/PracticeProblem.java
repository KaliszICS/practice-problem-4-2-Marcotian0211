public class PracticeProblem {

	public static void main(String args[]) {

	}

	public static String repeatLetter(char word,int number){
		String word1="";
		for(int i=0;i<number;i++)
			word1+=word;
         return(word1);
	}
	public static Integer countLetter(String word1,char word){
		int count=0;
		for(int i=0;i<word1.length();i++){
			if(word1.charAt(i)==word){
				count++;
		}
	}
	return count;
		
	}
	public static Integer evenSum(int num,int num1){
		int count=0;
		int min=Math.min(num,num1);
		int max=Math.max(num,num1);
		for(int i=min;i<=max;i++){
			if(i%2==0){
            count+=i;
			}
		}
		return (count);
		}


	}


