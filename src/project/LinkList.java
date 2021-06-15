package project;
/*
연결 리스트를 실제 구현하는 클래스
*/

public class LinkList {
    
    private Link first; // 첫번째 링크 = top
    
    // LinkList 생성자
    public LinkList(){
        first = null; //변수 초기화
    }
    
    public boolean isEmpty(){ // 비어있다면
        return first == null; //첫번째 링크 null
    }
    
    // 데이터 추가
    public void insert(int d1, double d2){
        Link link = new Link(d1,d2);
        link.nextLink = first; //다음 링크에 첫번째 링크 값 넣음 
        first = link; // 첫번째 링크에 새로 추가한 링크 값 넣음 = top
    }
    
    // 데이터 삭제
    public Link delete(){
        Link temp = first; // temp에 첫번쨰 링크값(삭제할값) 넣음
        first = first.nextLink; // 첫번쨰 링크에 다음 링크값 넣음
        return temp; 
    }
    
    public void printList() {
        Link currentLink = first; // 현재 링크에 첫번째 링크값 넣음
        System.out.print("List : ");
        while(currentLink != null){ // 현재 링크가 null이 아니라면 반복 = null이 될때까지 반복
            currentLink.printLink(); // 출력
            currentLink = currentLink.nextLink; //그런다음, 현재 링크에 다음 링크 넣음
        }
        System.out.println("");
    }
}
