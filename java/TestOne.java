// command line argument example
class TestOne {

    public static void main(String[] args) {
        findSumFromString();
    }
    public static void findSumFromString() {
        String[] items = {"abc12","def23"};
        int sum = 0;
        for(String item: items){
            String x = item.replaceAll("[a-zA-Z]","");
            sum = sum+Integer.parseInt(x);
        }
        System.out.println(sum);
    }
}
