import java.io.FileNotFoundException;
import java.util.HashSet;
/**
 * @author Michael Ades
 * This class implements multiple methods in order to find the best solution
 * in solving a word chain
 */
public class WordLadder
{
	private HashSet<String> dictionary;
	private HashSet<String> foundWords;
	public WordLadder() throws FileNotFoundException
	{
		while(dict.hasNext())
		{
			{
				System.out.println(getPath(in.next(), in.next()));
			}
			/
			*
			* @param word
			/
			{
				Stack<String> tempWords = new Stack();
				for(int i = 0; i < word.length(); i++)
				{
					StringBuilder storeWord = new StringBuilder(word);
					for(char let = 'a'; let <= 'z'; let++)
					{
						storeWord.setCharAt(i, let);
						if(dictionary.contains(storeWord.toString().toUpperCase()) && !storeWord.toString().equals(word) && !foundWords.contains(storeWord.toString()))
						{
							tempWords.push(storeWord.toString());
						}
					}
					{
						Queue<Stack<String>> dupes = new LinkedList();
						int size = nextWord.size();
						{
							Stack<String> temp = new Stack();
							{
								temp.push(nextWord.pop());
								return dupes;
								temp.push(nextWord.pop());
								{
									{
										Stack<String> quick = new Stack<String>();
										return quick;
										Queue<Stack<String>> storeWords = new LinkedList<>();
										boolean checkLength = firstWord.length() == lastWord.length();
										while(!storeWords.isEmpty() && checkLength && dictionary.contains(firstWord.toUpperCase()) && dictionary.contains(lastWord.toUpperCase()))
										{
											storeWords.addAll(getDupes(storeWords.poll(), lastWord));
											{
												System.out.print("Found a ladder! >>> ");
												return storeWords.peek();
											}
											Stack<String> notFound = new Stack<String>();
											return notFound;
										}