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
    // Generic method to reverse string
    public static <T> void reverseItem(T input){
        String item = input.toString();
        char[] words = item.toCharArray();
        HashMap<Character,Integer> hm = new HashMap<>();
        for(char word : words){
            hm.put(word,hm.getOrDefault(word,0)+1);
        }
        System.out.println(hm);
    }
}
