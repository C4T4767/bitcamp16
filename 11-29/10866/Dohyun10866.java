package coding_test.dec_1st;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Dohyun10866 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        DoublyLinkedList list = new DoublyLinkedList();

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            String[] in = br.readLine().split(" ");
            switch (in[0]) {
                case "push_front":
                    list.pushFront(new Node(Integer.parseInt(in[1])));
                    break;
                case "push_back":
                    list.pushBack(new Node(Integer.parseInt(in[1])));
                    break;
                case "pop_front":
                    sb.append(list.popFront()).append("\n");
                    break;
                case "pop_back":
                    sb.append(list.popBack()).append("\n");
                    break;
                case "size":
                    sb.append(list.size).append("\n");
                    break;
                case "empty":
                    if (list.size == 0)
                        sb.append(1).append("\n");
                    else
                        sb.append(0).append("\n");
                    break;
                case "front":
                    if (list.size == 0){
                        sb.append(-1).append("\n");
                    }else{
                        sb.append(list.head.value).append("\n");
                    }
                    break;
                case "back":
                    if (list.size == 0){
                        sb.append(-1).append("\n");
                    }else{
                        sb.append(list.tail.value).append("\n");
                    }
                    break;
            }
        }
        System.out.println(sb);
    }

    static class Node {
        int value;
        Node front;
        Node rear;

        public Node(int value) {
            this.value = value;
        }
    }

    static class DoublyLinkedList {
        Node head;
        Node tail;
        int size;

        public DoublyLinkedList() {
            size = 0;
            head = null;
            tail = null;
        }

        public void pushFront(Node node){
            if(size == 0){
                head = node;
                tail = node;
                size++;
            }else{
                head.front = node;
                node.rear = head;
                head = node;
                size++;
            }
        }

        public void pushBack(Node node){
            if(size == 0){
                head = node;
                tail = node;
                size++;
            }else{
                tail.rear = node;
                node.front = tail;
                tail = node;
                size++;
            }
        }

        public int popFront(){
            int output;
            if(size == 0){
                return -1;
            }else if(size == 1){
                output = head.value;
                head = null;
                tail = null;
                size--;
                return output;
            }else{
                output = head.value;
                head = head.rear;
                head.front = null;
                size--;
                return output;
            }
        }

        public int popBack(){
            int output;
            if(size == 0){
                return -1;
            }else if(size == 1){
                output = tail.value;
                head = null;
                tail = null;
                size--;
                return output;
            }else{
                output = tail.value;
                tail = tail.front;
                tail.rear = null;
                size--;
                return output;
            }
        }
    }
}