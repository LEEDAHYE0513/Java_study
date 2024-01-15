package collection.linkdlist;

public class Node <T>{
    T data;  //// 노드에 저장된 데이터
    Node<T> next = null; // 연결 리스트에서 다음 노드를 가리키는 참조

    // 노드 초기화 생성자
    public Node(T data){
        this.data = data;
    }
}
