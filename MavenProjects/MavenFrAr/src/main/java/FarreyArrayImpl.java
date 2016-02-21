public class FarreyArrayImpl {

    public FarreyArrayImpl() {
    }

    public RationalNumber[] runFloyd(int n) {

        RationalNumber[] list = new RationalNumber[n * n];

        list[0] = new RationalNumber(0, 1);
        list[1] = new RationalNumber(1, 1);

        for (int i = 2; i < n*n ;i++) {
            list[i] = null;
        }

        int count = 2;

        for (int i = 2; i <= n; i++)
            for (int j = 0; j <= count - 2; j++) {

                if (list[j] != null && list[j+1] != null && list[j].getB()+list[j+1].getB()==i) {
                    count++;
                    RationalNumber mid = new RationalNumber((list[j].getA() + list[j + 1].getA()), (list[j].getB() + list[j + 1].getB()));
                    for (int q = count; q > j ; q--) {
                        list[q] = list[q-1];
                    }
                    list[j + 1] = mid;
                }
            }
        return list;
    }
}