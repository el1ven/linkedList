public class MyLinkedList {
    
    private Node head;//头指针
    private int listCount;//长度计算
    
    public MyLinkedList(){
        head = new Node(null);
        listCount = 0;
    }
    
    public void add(Object data){
        //在链表的末端加数据
        Node newNode = new Node(data);
        Node current = head;
        while(current.getNext()!=null){
            current = current.getNext();
        }
        current.setNext(newNode);
        listCount++;
    }
    
    public void add(Object data, int index){
        //在指定位置添加数据
        Node newNode = new Node(data);
        Node current = head;
        for(int i = 1; i < index && current.getNext()!=null; i++){
            current = current.getNext();
        }
        newNode.setNext(current.getNext());
        current.setNext(newNode);
        listCount++;
    }
    
    public Object getDataByIndex(int index){
        //返回指定位置的数据域,index从1开始,第一个位置
        if(index <= 0)return null;
        Node current = head;
        for(int i = 0; i < index; i++){
            if(current.getNext() == null)return null;//越界的情况返回空值
            current = current.getNext();
        }
        return current.getData();
    }
    
    public boolean remove(int index){
        //移除指定位置的数据,index从1开始,第一个位置
        if(index <= 0 || index > getSize())return false;
        Node current = head;
        for(int i = 0; i < index; i++){
            if(current.getNext() == null)return false;
            current = current.getNext();
        }
        current.setNext(current.getNext().getNext());
        listCount--;
        return true;
    }
    
    public int getSize(){
        return listCount;
    }
    
    public String toString(){//重写Object的toString方法
        Node current = head.getNext();
        String output = "";
        while(current != null){
            output += "["+current.getData()+"]";
            current = current.getNext();
        }
        return output;
    }
    
    private class Node{//节点类
        
        Node next;//指针域
        Object data;//数据域
        
        public Node(Object dataValue){
            next = null;
            data = dataValue;
        }
        
        public Node(Node nextValue, Object dataValue){
            next = nextValue;
            data = dataValue;
        }
        
        public Node getNext() {
            return next;
        }
        
        public void setNext(Node next) {
            this.next = next;
        }
        
        public Object getData() {
            return data;
        }
        
        public void setData(Object data) {
            this.data = data;
        }
    }
    
}

