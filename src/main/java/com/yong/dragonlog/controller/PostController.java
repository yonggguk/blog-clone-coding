package com.yong.dragonlog.controller;

import com.yong.dragonlog.request.PostCreate;
import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Slf4j
@RestController
public class PostController {

    // Http Method
    // GET, POST, PUT, PATCH, DELETE, OPTIONS, HEAD, TRACE, CONNECT

    // SSR -> jsp, thymeleaf, mustache, freemarker
      // -> html rendering

    // SPA ->
    //  vue -> vue + SSR = nuxt
    //  react -> react + SSR = next
      // -> javascript + <-> API
    @PostMapping("/posts")
    public Map<String, String> post(@RequestBody @Valid PostCreate params) {
        //데이터를 검증하는 이유
        //1. client 개발자가 깜박할 수 있다. 실수로 값을 안 보낼 수 있다. (휴먼에러)
        //2. client bug로 값이 누락될 수 있다. (휴먼에러)
        //3. 외부에 나쁜 사람이 값을 임의로 조작해서 보낼 수 있다.
        //4. DB에 값을 저장할 때 의도치 않은 오류가 발생할 수 있다.
        //5. 서버 개발자의 편안함을 위해서
        //6. 프로세스의 안정감을 줄 수 있다. 왜냐 검증된 데이터이기 때문에


        // {"title":"타이틀 값이 없습니다."}

        // 응답값에 HashMap -> 응답 클래스를 만들어주는게 좋다.
        // 여러개의 에러처리가 힘들다.
        // 세 번 이상의 반복적인 작업은 피해야한다.
                // - 코드 && 개발에 관한 모든 것
                    // - 자동화 고려

        // 위와 같은 부분을 @ControllAdvise를 통해 개선하고자 한다.

        /*
        String title = params.getTitle();
        if(title == null || title.equals("")){
            // 1. if문을 사용한 검증은 필드가 늘어나면 늘어날수록 힘들다 (노가다)
            // 2. 개발팁 -> 무언가 3번이상 반복작업을 할 때 -> 내가 뭔가 잘못하고 있는건 아닐지 의심한다.
            // 3. 누락가능성
            // 4. 생각보다 검증해야할 것이 많다. (꼼꼼하지 않을 수 있다.) !!!! 가장 유심히 봐야한다.
            // 5. 뭔가 개발자스럽지 않다. -> 간지 x

            //
            throw new Exception("타이틀값이 없어요!");
        }
        String content = params.getContent();
        if(title == null || content.equals("")){
            //error
        }
        이 예외처리같은 경우 post dto에서 @NotBlack annotation을 통해서 null, " ", "" 과 같은 예외를 처리하도록 하였다.
 */
        return Map.of();
    }
}
