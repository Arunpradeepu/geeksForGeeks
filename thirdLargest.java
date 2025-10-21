class Solution {
    int thirdLargest(int arr[]) {
        if (arr.length < 3) return -1;

        int fir = arr[0], sec = Integer.MIN_VALUE, trd = Integer.MIN_VALUE;

        for (int i = 1; i < arr.length; i++) {
            int num = arr[i];

            if (num > fir) {
                trd = sec;
                sec = fir;
                fir = num;
            } else if (num > sec) {
                trd = sec;
                sec = num;
            } else if (num > trd) {
                trd = num;
            }
        }

        return trd;
    }
}
