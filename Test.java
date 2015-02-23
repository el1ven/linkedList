public class Test {
    public static void main(String[] args){
        
        MyLinkedList list = new MyLinkedList();
        
        //填充数据
        for(int i = 1; i <= 8; i++){
            list.add(String.valueOf(i));
        }
        
        //测试结果
        System.out.println("print linkedlist: " + list);
        System.out.println("print linkedlist size: " + list.getSize());
        System.out.println("get 3rd element: " + list.getDataByIndex(3));
        System.out.println("remove 2nd element: " + list.remove(2));
        System.out.println("get 3rd element: " + list.getDataByIndex(3));
        System.out.println("print linkedlist size: " + list.getSize());
        System.out.println("print linkedlist: " + list);
    }
}
