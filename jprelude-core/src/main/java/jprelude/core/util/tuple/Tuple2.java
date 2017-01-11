package jprelude.core.util.tuple;

public final class Tuple2<T1, T2> {
    public final T1 item1;

    public final T2 item2;

    private Tuple2(final T1 item1, final T2 item2) {
        this.item1 = item1;
        this.item2 = item2;
    }

    @Override
    public String toString() {
        return "(" + this.item1 + ", " + this.item2 + ")";
    }

    public static <t1, t2> Tuple2<t1, t2> of(final t1 item1, final t2 item2) {
        return new Tuple2(item1, item2);
    }
}
