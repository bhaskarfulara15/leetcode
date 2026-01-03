class Solution(object):
    def rotateRight(self, head, k):
        if not head or not head.next or k==0:
            return head

        length=1
        tail=head
        while tail.next:
            length=length+1
            tail=tail.next

        k%=length
        if k==0:
            return head

        tail.next=head
        step=length-k
        temp=head

        for i in range (step-1):
            temp=temp.next

        new_head=temp.next
        temp.next=None

        return new_head 
