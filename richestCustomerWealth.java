
class richestCustomerWealth {

    public static int richestCustomer(int accounts[][]) {
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < accounts.length; i++) {
            int sum = 0;
            for (int j = 0; j < accounts[i].length; j++) {
                sum += accounts[i][j];
            }
            if (sum > largest) {
                largest = sum;
            }
        }
        return largest;
    }

    public static void main(String[] args) {
        int accounts[][] = {
            {2, 8, 7},
            {7, 1, 3},
            {1, 9, 5}
        };
        System.out.println(richestCustomer(accounts));
    }
}
