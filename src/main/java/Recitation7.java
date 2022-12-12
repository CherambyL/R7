/**
 * Recitation7 is a class for completing
 *  Reciation 7 in Java.
 *
 * @author <You>
 * @version 1.0
 */

public class Recitation7
{
    public static void main(String[] args){

    }
    public static String leftRightTriangle(int height)
    {
        StringBuilder str = new StringBuilder();
        for (int row = 0; row <= height; row++){
            str.append("*".repeat(row + 1));
            str.append("\n");
        }
        return str.toString();
    }

    public static String rightRightTriangle(int height)
    {
        StringBuilder str = new StringBuilder();
        for(int row = 0; row <= height; row++){
            str.append(" ".repeat(height - row - 1));
            str.append("*" .repeat(row + 1));
        }
        return str.toString();
    }

    public static String circle(int radius)
    {
        StringBuilder str = new StringBuilder();
        for(int row = radius;  row >= - radius - 1; row--){
            int verse = (int) Math.sqrt (radius * radius - row * row);
            int x = (radius * 2 - (verse * 2));
            if (x != radius * 2){
                str.append(" ".repeat(Math.max(0, x /2 )));
            }

        }
        return str.toString();
    }
}
