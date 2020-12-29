package SpringBootCommunityWeb;

import SpringBootCommunityWeb.web.domain.Board;
import SpringBootCommunityWeb.web.domain.User;
import SpringBootCommunityWeb.web.domain.enums.BoardType;
import SpringBootCommunityWeb.web.repository.BoardRepository;
import SpringBootCommunityWeb.web.repository.UserRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DataJpaTest
public class JpaMappingTest {

    private final String boardTestTitle = "테스트";
    private final String email = "test@gmail.com";

    @Autowired
    UserRepository userRepository;

    @Autowired
    BoardRepository boardRepository;

    @BeforeEach
    public void init(){

        User user = userRepository.save(User.builder()
                .name("weno")
                .password("test")
                .email(email)
                .createdDate(LocalDateTime.now())
                .build());

        boardRepository.save(Board.builder()
                .title(boardTestTitle)
                .subTile("testSubTitle")
                .content("testContent")
                .boardType(BoardType.free)
                .createdDate(LocalDateTime.now())
                .updatedDate(LocalDateTime.now())
                .user(user)
                .build());
    }

    @Test
    public void 제대로_생성됐는지_테스트(){

        User user = userRepository.findByEmail(email);
        assertEquals(user.getName(), "weno");

        Board board = boardRepository.findByUser(user);
        assertEquals(board.getTitle(), boardTestTitle);
        assertEquals(board.getBoardType(), BoardType.free);

    }

}
