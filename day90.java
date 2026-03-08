class Solution {
    public ListNode middleNode(ListNode head) {
        int middle=0;
        int count=0;
        ListNode temp=head;
        while(temp!=null){
            count++;
            temp=temp.next;
        }
        middle=count/2;
        temp=head;
        for(int i=0;i<middle;i++){
            temp=temp.next;
        }
        return temp;
    }
}
