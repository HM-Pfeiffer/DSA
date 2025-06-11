class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> output = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            StringBuilder str = new StringBuilder();

            if (i % 3 == 0) {
                str.append("Fizz");
            }
            if (i % 5 == 0) {
                str.append("Buzz");
            }
            String result = str.isEmpty() ? Integer.toString(i) : str.toString();
            output.add(result);
        }
        return output;
    }
}