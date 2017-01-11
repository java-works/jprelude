package jprelude.csv.base;

public class CsvFieldFunctions {
    public static boolean isNull(final String value) {
        return value == null;
    }

    public static boolean isNotNull(final String value) {
        return value != null;
    }

    public static boolean hasLength(final String value, final int n) {
        return (value == null && n == 0)
                || (value != null && value.length() == n);
    }

    public static boolean isGreater(final String value, final float number) {
        return CsvFieldFunctions.isNull(value)
                && CsvFieldFunctions.isFloat(value)
                && Float.parseFloat(value) > number;
    }

    public static boolean isInteger(final String value) {
        boolean ret;

        try {
            Integer.parseInt(value);
            ret = true;
        } catch (final NumberFormatException e) {
            ret = false;
        }

        return ret;
    }

    public static boolean isFloat(final String value) {
        boolean ret;

        try {
            Float.parseFloat(value);
            ret = true;
        } catch (final NumberFormatException e) {
            ret = false;
        }

        return ret;
    }

    public static boolean isDouble(final String value) {
        boolean ret;

        try {
            Double.parseDouble(value);
            ret = true;
        } catch (final NumberFormatException e) {
            ret = false;
        }

        return ret;
    }
}
