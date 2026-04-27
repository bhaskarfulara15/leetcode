class Solution {
    public int calPoints(String[] operations) {
        java.util.Stack<Integer> st=new java.util.Stack<>();
        int sum=0;
        for(String s:operations){
            if(s.equals("+")){
                int a=st.pop();
                int b=st.peek();
                st.push(a);
                int val=a+b;
                st.push(val);
                sum=sum+val;
            }
            else if(s.equals("D")){
                int val=st.peek()*2;
                st.push(val);
                sum=sum+val;
            }else if(s.equals("C")){
                sum=sum-st.pop();
            }else{
                int val=Integer.parseInt(s);
                st.push(val);
                sum=sum+val;
            }
        }
        return sum;
    }
}