package org.koreait.commons;

import org.springframework.data.domain.Page;

/**
 * 페이지네이션 공용
 *
 */
public class Pagination<T> {
   public Pagination(Page<T> data) {

   }

    /**
     * 페이징 HTML 가져오기
     * @return
     */
   public String getPaging() {
       return null;
   }
}
