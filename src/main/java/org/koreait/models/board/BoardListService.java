package org.koreait.models.board;

import lombok.RequiredArgsConstructor;
import org.koreait.commons.Pagination;
import org.koreait.controllers.boards.BoardSearchForm;
import org.koreait.entities.BoardData;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BoardListService {

    private Pagination<BoardData> pagination;

    /**
     * 1. 게시판별 게시글이므로 bId(게시판 아이디)별 조회로 쿼리빌딩 하여 레코드 구하기
     * 2. 페이징은 범용으로 사용해야 하므로 Pagination 클래스로 정의하여 사용하기
     *
     * @param bId
     * @param searchForm
     * @return
     */
    public Page<BoardData> gets(String bId, BoardSearchForm searchForm) {

        // 1. bId로 게시글 검색 조건 추가 - BooleanBuilder 객체의 and 조건에 추가

        // 2. sopt, skey 검색 조건 처리 - 값이 있을 경우
        String sopt = searchForm.getSopt();
        String skey = searchForm.getSkey();
        if (sopt != null && !sopt.isBlank() && skey != null && !skey.isBlank()) {
            // 코드 구현
        }

        // 3. Pageable 객체 생성하고(PageRequest.of(page - 1, limit)) findAll 매개변수에 넣기
        // 유의할 점 스프링 Data에서 Pageable의 페이징 시작 번호는 0번이므로 -1 처리해야함
        int page = searchForm.getPage();
        page = page <= 0 ? 1 : page;
        int limit = searchForm.getLimit();
        limit = limit <= 0 ? 20 : limit;

        // 4. 정렬 처리 - sort

        /** 쿼리 완료 후 반환받은 Page<BoardData>를 사용하여 페이징 객체 생성하기 */
        // Page<BoarData>가 data 변수에 담겨 있다면 다음과 같이 추가하여 페이징 객체 생성

        //this.pagination = new Pagination<>(data);

        return null;
    }

    /**
     * 게시판별 게시글 조회 gets(...)에서 페이징 데이터가 설정되므로 이를 조회하여 프론트에 출력한다.
     * @return
     */
    public Pagination<BoardData> getPagination() {

        return pagination;
    }
}
