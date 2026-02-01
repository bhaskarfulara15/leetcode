class Solution(object):
    def swapPairs(self, head):
        temp=ListNode(0)
        temp.next=head
        prev=temp

        while prev.next and prev.next.next:
            a=prev.next
            b=a.next

            prev.next=b
            a.next=b.next
            b.next=a

            prev=a
        return temp.next
