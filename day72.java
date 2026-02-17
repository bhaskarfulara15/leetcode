class MyHashMap {
    class Node{
        int key,value;
        Node next;
        Node(int key,int value){
            this.key=key;
            this.value=value;
        }
    }
    private final int SIZE=10000;
    private Node[] buckets;

    public MyHashMap() {
        buckets=new Node[SIZE];
    }
    private int getHash(int key) {
        return key % SIZE;
    }
    
    public void put(int key, int value) {
        int index=getHash(key);
        if(buckets[index]==null){
            buckets[index] = new Node(-1, -1);
        }
        Node prev = findNode(buckets[index], key);
        if (prev.next == null) {
            prev.next = new Node(key, value);
        } else {
            prev.next.value = value;
        }
    }
    
    public int get(int key) {
        int index = getHash(key);
        if (buckets[index] == null) return -1;
        Node prev = findNode(buckets[index], key);
        return (prev.next == null) ? -1 : prev.next.value;
    }
    
    public void remove(int key) {
        int index = getHash(key);
        if (buckets[index] == null) return;
        Node prev = findNode(buckets[index], key);
        if (prev.next != null) {
            prev.next = prev.next.next;
        }
    }
    private Node findNode(Node bucketHead, int key) {
        Node curr = bucketHead;
        Node prev = null;
        while (curr != null && curr.key != key) {
            prev = curr;
            curr = curr.next;
        }
        return prev;
    }
}
