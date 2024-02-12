package extra_tasks_self_practice_week;
/*
Create a class named FrequencyOfAWord. Given the following variables:
			word: contains a single word
			sentence: contains a sentence

	Write a program that calculates the frequency of the word from the given sentence.

			Example:
				word = "java"
				sentence = "Java Java Java JAVA Java"

			Output:
				5
 */

public class FrequencyOfAWord {
    public static void main(String[] args) {
        String word = "java";
        String sentence = "Java Java Java JAVA Java java";
        sentence = sentence.toLowerCase();
        int x = 0;
        while (sentence.contains(word)){
            sentence = sentence.replaceFirst(word,"1234");
            x++;
        }
        System.out.println(x);
    }
}
