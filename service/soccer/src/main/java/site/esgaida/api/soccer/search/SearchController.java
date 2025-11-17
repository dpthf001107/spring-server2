package site.esgaida.api.soccer.search;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import site.esgaida.api.soccer.common.Messenger;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@RequestMapping("/search")
public class SearchController {

    @GetMapping("")
    public Messenger search(@RequestParam(required = false) String keyword) {
        System.out.println("========================================");
        System.out.println("🔍 검색 요청 도착!");
        System.out.println("입력한 검색어: [" + (keyword != null ? keyword : "null") + "]");
        System.out.println("========================================");
        
        if (keyword == null || keyword.trim().isEmpty()) {
            System.out.println("⚠️ 검색어가 비어있습니다.");
            return Messenger.builder()
                .code(400)
                .message("검색어를 입력해주세요")
                .data(null)
                .build();
        }
        
        String trimmedKeyword = keyword.trim();
        System.out.println("✅ 검색어 처리 완료: [" + trimmedKeyword + "]");
        System.out.println("========================================");
        
        return Messenger.builder()
            .code(200)
            .message("검색어가 터미널에 출력되었습니다: " + trimmedKeyword)
            .data(trimmedKeyword)
            .build();
    }

}

