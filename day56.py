    def removeNthFromEnd(self, head, n):
        temp=head
        last=head
        count=0
        while last:
            count=count+1
            last =last.next

        if count==n:
            return head.next

        for i in range(count-n-1):
            temp=temp.next

        temp.next=temp.next.next
        return head
