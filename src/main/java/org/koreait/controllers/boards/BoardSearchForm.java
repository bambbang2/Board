package org.koreait.controllers.boards;

import lombok.Data;

@Data
public class BoardSearchForm {
    private int page = 1; // 시작 페이지
    private int limit = 20; // 1페이지당 레코드 갯수

    /**
     * 검색 옵션
     * subject : 제목
     * content : 내용
     * subject_content : 제목 + 내용
     * poster : 작성자 + 아이디
     */
    private String sopt;
    private String skey; // 검색 키워드

    /**
     * 정렬 옵션
     * 기본값은 createdAt_DESC로 최신 등록순으로
     * 정렬 조건  처리시 sort.split("_")로 하여 배열의 0번째는 항목, 1번째는 방향성(DESC, ASC)로 결정하여 구현
     */
    private String sort = "createdAt_DESC"; // 정렬
}
