/**
 * Recitation7 is a class for completing
 *  Reciation 7 in Java.
 *
 * @author <You>
 * @version 1.0
 */

public class Recitation7
{
    // define your constants after this comment
    public static String leftRightTriangle(int height)
    {
        StringBuilder str = new StringBuilder();
        for (int row = 0; row < height; row++) str.append("*".repeat(row + 1)).append("\n");
        return str.toString();
    }

    public static String rightRightTriangle(int height)
    {
        StringBuilder str = new StringBuilder();
        for(int row = 0; row < height; row++){
            str.append(" ".repeat(height - row - 1));
            str.append("*".repeat(row +1)).append("\n");
        }
        return str.toString();
    }

    public static String circle(int radius)
    {
        StringBuilder str = new StringBuilder();
        for(int row = radius;  row >= - (radius - 1); row--){
            int verse = (int) Math.sqrt (radius * radius - row * row);
            int fifa = (radius * 2 - (verse * 2));
            if (fifa != radius * 2){
                str.append(" ".repeat(Math.max(0, fifa /2 )));
                for(int y = verse * 2;y *2 > 0; y--) str.append('*');
                str.append("\n");
            }

        }
        return str.toString();
    }
}
















