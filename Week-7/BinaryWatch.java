import java.util.ArrayList;
import java.util.List;

public class BinaryWatch {

    public static List<String> readBinaryWatch(int turnedOn) {

        List<String> result = new ArrayList<>();

        for (int hour = 0; hour < 12; hour++) {

            for (int minute = 0; minute < 60; minute++) {

                int hourBits = Integer.bitCount(hour);
                int minuteBits = Integer.bitCount(minute);

                if (hourBits + minuteBits == turnedOn) {

                    String time = hour + ":";

                    if (minute < 10) {
                        time += "0";
                    }

                    time += minute;

                    result.add(time);
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {

        int turnedOn = 1;

        System.out.println(readBinaryWatch(turnedOn));
    }
}