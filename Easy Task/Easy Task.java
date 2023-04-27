class Solution {
      static int segment[][];
    static void bnado(int left,int right,int index,char s[]){
        if(left==right){
            segment[index][s[right]-'a']=1;
            return;
        }
        int mid = (left+right)/2;
        bnado(left,mid,2*index+1,s);
        bnado(mid+1,right,2*index+2,s);
        for(int i=0;i<26;i++){
            segment[index][i]=segment[2*index+1][i]+segment[2*index+2][i];
        }
    }
    static void update(int left,int right,int index,int Uindex,char s[],char c){
        if(Uindex<left || Uindex>right)return;
        segment[index][s[Uindex]-'a']--;
        segment[index][c-'a']++;
        if(left==right)return;
        int mid = (left+right)/2;
        update(left,mid,2*index+1,Uindex,s,c);
        update(mid+1,right,2*index+2,Uindex,s,c);
    }
    static void nikaldo(int left,int right,int index,int s,int e,int temp[]){
        if(s>right || e<left)return;
        if(left>=s && right<=e){
            for(int i=0;i<26;i++){
                temp[i]+=segment[index][i];
            }
            return;
        }
        int mid = (left+right)/2;
        nikaldo(left,mid,2*index+1,s,e,temp);
        nikaldo(mid+1,right,2*index+2,s,e,temp);
    }
    public static ArrayList<Character> easyTask(int n,String s,int q,query queries[])
    {
        ArrayList<Character> ans = new ArrayList<>();
        segment = new int[4*n][26];
        char cc[]=s.toCharArray();
        bnado(0,n-1,0,cc);
        for(int i=0;i<q;i++){
            if(queries[i].type=="1"){
                int Uindex=Integer.parseInt(queries[i].a);
                char c=queries[i].b.charAt(0);
                update(0,n-1,0,Uindex,cc,c);
                cc[Uindex]=c;
            }
            else{
                int temp[] = new int[26];
                int l=Integer.parseInt(queries[i].a);
                int r=Integer.parseInt(queries[i].b);
                int k=Integer.parseInt(queries[i].c);
                nikaldo(0,n-1,0,l,r,temp);
                int j=0;
                for(j=25;j>=0;j--){
                    k-=temp[j];
                    if(k<=0)break;
                }
                ans.add((char)('a'+j));
            }
        }
        return ans;
    }
}
/*In case the query is of type 1.
type=1
c=null
*/

/*In case the query is of type 2.
type=2
c=k
*/

class query
{
    String type;
    String a;
    String b;
    String c;
    public query(String type,String a,String b,String c)
    {
        this.type=type;
        this.a=a;
        this.b=b;
        this.c=c;
    }
}
