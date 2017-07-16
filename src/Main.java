import com.google.common.base.Defaults;

public class Main {

    public static void main(String[] args) {
        System.out.println("Default value of any object type: " + Defaults.defaultValue(ObjectTypes.class));
        System.out.println("Limit of byte value: " + Byte.MIN_VALUE + " to " + Byte.MAX_VALUE);
        System.out.println("Default value of byte type: " + Defaults.defaultValue(Byte.TYPE));
        System.out.println("Limit of short value: " + Short.MIN_VALUE + " to " + Short.MAX_VALUE);
        System.out.println("Default value of short type: " + Defaults.defaultValue(Short.TYPE));
        System.out.println("Limit of int value: " + Integer.MIN_VALUE + " to " + Integer.MAX_VALUE);
        System.out.println("Default value of int type: " + Defaults.defaultValue(Integer.TYPE));
        System.out.println("Limit of long value: " + Long.MIN_VALUE + " to " + Long.MAX_VALUE);
        System.out.println("Default value of long type: " + Defaults.defaultValue(long.class));
        System.out.println("Limit of float value: " + Float.MIN_VALUE + " to " + Float.MIN_VALUE);
        System.out.println("Default value of float type: " + Defaults.defaultValue(float.class));
        System.out.println("Limit of double value = " + Double.MIN_VALUE + " to " + Double.MAX_VALUE);
        System.out.println("Default double of byte type: " + Defaults.defaultValue(double.class));
        System.out.println("Limit of char value = " + Character.MIN_VALUE + " to " + Character.MAX_VALUE);
        System.out.println("Default value of char type: " + Defaults.defaultValue(char.class));
    }
}
