import java.util.Arrays;

class Solution {
    public int numUniqueEmails(String[] emails) {
        String[] normalized=new String[emails.length];
        for (int i=0;i<emails.length;i++){
            String email=emails[i];
            String[] parts=email.split("@");
            String local=parts[0];
            String domain=parts[1];
            int plusIndex=local.indexOf('+');
            if(plusIndex!=-1){
                local=local.substring(0,plusIndex);
            }
            local=local.replace(".","");
            normalized[i]=local+"@"+domain;
        }
        Arrays.sort(normalized);
        int count=1;
        for(int i=1;i<normalized.length;i++){
            if (!normalized[i].equals(normalized[i-1])){
                count++;
            }
        }
        return normalized.length==0?0:count;
    }
}
