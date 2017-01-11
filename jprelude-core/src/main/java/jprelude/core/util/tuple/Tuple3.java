package jprelude.core.util.tuple;

public final class Tuple3<T1, T2, T3> {
    public final T1 item1;

    public final T2 item2;

    public final T3 item3;

    private Tuple3(final T1 item1, final T2 item2, final T3 item3) {
        this.item1 = item1;
        this.item2 = item2;
        this.item3 = item3;
    }

    @Override
    public String toString() {
        return "(" + this.item1 + ", " + this.item2 + ", " + this.item3 + ")";
    }

    public static <T1, T2, T3> Tuple3<T1, T2, T3> of(final T1 item1, final T2 item2, final T3 item3) {
        return new Tuple3(item1, item2, item3);
    }
}
