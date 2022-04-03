/**
 * Purpose  - Mood Analyser
 *
 * @author - Ashvini Kanojia
 * @version - 16.0
 * @since - 01-04-2022
 */
public class MoodAnalyser {

    public static String analyseMood(String mood) {
        if (mood.toLowerCase().contains("happy")) {
            return "Entry Successful";
        } else if (mood.toLowerCase().contains("sad")) {
            return "Entry Failed";
        } else return null;
    }
}
