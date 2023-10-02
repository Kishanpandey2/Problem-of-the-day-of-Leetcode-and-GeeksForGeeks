class Solution {
    public boolean winnerOfGame(String colors) {
        int aCnt=0, bCnt=0;
        int aTemp=0, bTemp=0;

        for(int i=0;i<colors.length();i++)
        {
            char c = colors.charAt(i);
            if(c=='A')
            {
                bTemp=0;
                aTemp+=1;
                if(aTemp>=3)
                {
                    aCnt+=1;
                }
            }
            else
            {
                aTemp=0;
                bTemp+=1;
                if(bTemp>=3)
                {
                    bCnt+=1;
                }
            }
        }
        return aCnt>bCnt;
    }
}
