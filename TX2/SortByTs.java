package QLBV;

import java.util.Comparator;

public class SortByTs implements Comparator<BenhNhan> {
    @Override
    public int compare(BenhNhan o1, BenhNhan o2) {
        return o1.getTienSu().compareTo(o2.getTienSu());
    }
}
