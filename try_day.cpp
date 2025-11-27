/*sum of two numbers in a array = target
example-> nums=[2,3,4] , target =5
so. output is = [0,1](indexes)
*/ 
#include <stdio.h>
#include <stdlib.h>

int* twoSum(int* nums, int numsSize, int target, int* returnSize) {
    *returnSize=2;
    int* ans = (int*)malloc(2 * sizeof(int));

    for (int i=0;i<numsSize-1;i++){
        for (int j=i+1;j<numsSize;j++){
            if(nums[i]+nums[j]==target){
                ans[0]=i;
                ans[1]=j;
                return ans;
            }
        }
    }

    *returnSize=0;
    free(ans);
    return NULL;
}

int main() {
    int n, target;

    printf("Enter number of elements: ");
    scanf("%d", &n);

    int nums[n];
    printf("Enter array values:\n");
    for (int i = 0; i < n; i++) {
        scanf("%d", &nums[i]);
    }

    printf("Enter target value: ");
    scanf("%d",&target);

    int returnSize;
    int* result=twoSum(nums,n,target,&returnSize);

    if(result!= NULL) {
        printf("Indices: [%d, %d]\n",result[0],result[1]);
        free(result);
    }
	else{
        printf("No valid pair found\n");
    }
    return 0;
}

