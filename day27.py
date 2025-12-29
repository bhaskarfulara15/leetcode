class Solution(object):
    def hasCycle(self, head):

        temp=prev=head

        while temp and temp.next:
            prev=prev.next
            temp=temp.next.next

            if prev==temp:
                return True

        return False
