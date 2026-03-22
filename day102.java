class Solution {
    public ListNode partition(ListNode head, int x) {
        ListNode BeforeHead=new ListNode(0);
        ListNode AfterHead=new ListNode(0);
        ListNode Before=BeforeHead;
        ListNode After=AfterHead;

        while(head!=null){
            if(head.val<x){
                Before.next=head;
                Before=Before.next;
            }
            else{
                After.next=head;
                After=After.next;
            }
            head=head.next;
        }
        After.next=null;
        Before.next=AfterHead.next;

        return BeforeHead.next;
    }
}
