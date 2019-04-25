package com.zh.study.april;

/**
 * @auther zh
 * @data 2019/4/25 15:21
 */
class RandomListNode {
    int label;
    RandomListNode next = null;
    RandomListNode random = null;

    RandomListNode(int label) {
        this.label = label;
    }
}
public class Practice21 {
    public RandomListNode Clone(RandomListNode pHead)
    {
        if(pHead == null){
            return null;
        }
        //复制
        //合并
        RandomListNode pcur = pHead;
        RandomListNode pnext;
        RandomListNode nhead = new RandomListNode(-1);
        RandomListNode ncur ;
        while (pcur != null){
          RandomListNode cloneNode = new RandomListNode(pcur.label);
          pnext = pcur.next;
          pcur.next = cloneNode;
          cloneNode.next = pnext;
          pcur = pnext;
        }
        pcur = pHead;
        while (pcur!= null){
            pcur.next.random = pcur.random == null? null:pcur.random.next;
            pcur = pcur.next.next;
        }
        pcur = pHead;
        //拆分
        nhead.next = pHead.next;

        while (pcur != null ){
            ncur = pcur.next;
            pcur.next = ncur.next;
            ncur.next = ncur.next == null ? null : ncur.next.next;
            pcur = pcur.next;
        }
        return nhead.next;
    }
}
