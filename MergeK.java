package SDESHEET;

public class MergeK {
        public ListNode mergeKLists(ListNode[] lists) {
              ListNode ans = null;
            for (int i = 0; i < lists.length; i++) {
                
                ans = merge2List(ans, lists[i]);
            }
            return ans;
        }
        public ListNode merge2List(ListNode l1,ListNode l2){
            if(l1==null)
            return l2;
            if(l2==null)
            return l1;
            if(l1.val<l2.val){
                l1.next=merge2List(l1.next,l2);
                return l1;
            }
            else{
                l2.next=merge2List(l1,l2.next);
                return l2;
            }
        }
    
}
