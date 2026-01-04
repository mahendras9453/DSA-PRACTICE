class arraydiv {
    public int sumFourDivisors(int[] nums) {
       int totalSum = 0;
             for (int num : nums) {
            int sum = 0;
            int count = 0;

            for (int j = 1; j * j <= num; j++) {
                if (num % j == 0) {
                    int d1 = j;
                    int d2 = num / j;

                    if (d1 == d2) { 
                        sum += d1;
                        count++;
                    } else {
                        sum += d1 + d2;
                        count += 2;
                    }
                     if (count > 4) break;
                }
            }

            if (count == 4) {
                totalSum += sum;
            }
        }

        return totalSum;

    }
}