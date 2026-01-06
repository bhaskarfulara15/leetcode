class Solution(object):
    def reverseList(self, head):
        prev=None
        temp=head

        while temp:
            next=temp.next
            temp.next=prev
            prev=temp
            temp=next

        return prev   
