import java.util.Scanner;

public class ReadabilityAnalyzer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the text:");
        String text = scanner.nextLine();
        scanner.close();
        
        int charCount = 0, wordCount = 0, sentenceCount = 0, syllableCount = 0;
        boolean inWord = false;
        boolean prevVowel = false;
        String vowels = "aeiouyAEIOUY";
        
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            
            if (Character.isLetterOrDigit(c)) {
                charCount++;
                if (!inWord) {
                    wordCount++;
                    inWord = true;
                }
                if (vowels.indexOf(c) != -1) {
                    if (!prevVowel) {
                        syllableCount++;
                        prevVowel = true;
                    }
                } else {
                    prevVowel = false;
                }
            } else {
                inWord = false;
                if (c == '.' || c == '!' || c == '?') {
                    sentenceCount++;
                }
            }
        }
        
        double readabilityScore = computeReadability(wordCount, sentenceCount, syllableCount);
        
        System.out.println("Characters: " + charCount);
        System.out.println("Words: " + wordCount);
        System.out.println("Sentences: " + sentenceCount);
        System.out.println("Syllables: " + syllableCount);
        System.out.printf("Flesch-Kincaid Readability Score: %.2f\n", readabilityScore);
        System.out.println("Readability Level: " + categorizeReadability(readabilityScore));
    }
    
    private static double computeReadability(int words, int sentences, int syllables) {
        return 206.835 - (1.015 * words / sentences) - (84.6 * syllables / words);
    }
    
    private static String categorizeReadability(double score) {
        if (score >= 90) return "Very Easy";
        else if (score >= 80) return "Easy";
        else if (score >= 70) return "Fairly Easy";
        else if (score >= 60) return "Standard";
        else if (score >= 50) return "Fairly Difficult";
        else if (score >= 30) return "Difficult";
        else return "Very Confusing";
    }
}
