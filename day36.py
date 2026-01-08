class Solution(object):
    def isPalindrome(self, head):
        temp=head
        stack=[]

        while temp:
            stack.append(temp.val)
            temp=temp.next
        temp=head

        while temp:
            if temp.val!=stack.pop():
                return False
            temp=temp.next

        return True 
