package day0317;

// 게시글을 담을 Board 클래스
public class Board {
    // 1. 필드
    // 게시글 번호
    private int id;
    // 게시글 작성자
    private String writer;
    // 게시글 제목
    private String title;
    // 게시글 내용
    private String content;
    
    // 2. 메소드
    // 겟터/셋터
    // 겟터/셋터 쉽게 만드는 방법
    // 화면 빈칸 오른쪽 클릭 -> source -> generate Getters and Setters
    // -> 겟터/셋터가 필요한 필드 클릭 후 generate
    
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getWriter() {
        return writer;
    }
    public void setWriter(String writer) {
        this.writer = writer;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getContent() {
        return content;
    }
    public void setContent(String content) {
        this.content = content;
    }
    
    // equals()
    public boolean equals(Object o) {
        if(o instanceof Board) {
            Board b = (Board)o;
            if(id == b.id) {
                return true;
            }
        }
        
        return false;
    }
    
    // 글의 내용을 예쁘게 출력해주는 printBoard()
    public void printBoard() {
        System.out.println();
        System.out.println("=================================");
        System.out.printf("글번호: %04d\n", id);
        System.out.printf(" 제목: %s\n", title);
        System.out.printf("작성자: %s\n", writer);
        System.out.println("---------------------------------");
        System.out.println("               내 용              ");
        System.out.println("---------------------------------");
        System.out.println(content);
        System.out.println("=================================");
        System.out.println();
    }
}
