class Solution {
    public ListNode sortList(ListNode head) {
        if(head==null || head.next==null){
            return head;
        }
        List<Integer> list=new ArrayList<>();
        ListNode temp=head;
        while(temp!=null){
            list.add(temp.val);
            temp=temp.next;
        }
        Collections.sort(list);

        temp=head;
        int i=0;
        while(temp!=null){
            temp.val=list.get(i);
            i++;
            temp=temp.next;
        }
        return head;
    }
}

//Time Limit Exceed (  T(n) = O(n2)   ).
// class Solution {
//     public ListNode sortList(ListNode head) {
//         if(head==null || head.next==null){
//             return head;
//         }
//         int n=0;
//         ListNode temp=head;
//         while(temp!=null){
//             n++;
//             temp=temp.next;
//         }
        
//         for(int i=0;i<n;i++){
//             ListNode t1=head;
//             ListNode t2=head.next;
//             for(int j=0;j<n-i-1 && t2!=null;j++){
//                 if(t1.val>t2.val){
//                     int tempval=t1.val;
//                     t1.val=t2.val;
//                     t2.val=tempval;
//                 }
//                 t1=t1.next;
//                 t2=t2.next;
//             }
//         }
//         return head;
//     }
// }