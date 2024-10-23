class Solution {
    public int calPoints(String[] operations) {
        int result = 0;
        Stack<Integer> a = new Stack<>();
        for (String o : operations) {
            switch(o) {
                case "C" -> {
                    result-=a.pop();
                }
                case "D" -> {
                    result += a.elementAt(a.size()-1)*2;
                    a.push(a.elementAt(a.size()-1)*2);
                }
                case "+" -> {
                    result += a.elementAt(a.size()-1) + a.elementAt(a.size()-2);
                    a.push(a.elementAt(a.size()-1) + a.elementAt(a.size()-2));
                }
                default -> {
                    a.push(Integer.parseInt(o));
                result +=a.elementAt(a.size()-1);
                }
            }
            
        }
return result;
        
    }
}