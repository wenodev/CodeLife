package SpringBootCommunityWeb;

import SpringBootCommunityWeb.web.domain.Board;
import SpringBootCommunityWeb.web.domain.User;
import SpringBootCommunityWeb.web.domain.enums.BoardType;
import SpringBootCommunityWeb.web.repository.BoardRepository;
import SpringBootCommunityWeb.web.repository.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.LocalDateTime;
import java.util.stream.IntStream;

@SpringBootApplication
public class SpringBootCommunityWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootCommunityWebApplication.class, args);
	}

	@Bean
	public CommandLineRunner runner(UserRepository userRepository, BoardRepository boardRepository){

		return (args -> {

			User user = userRepository.save(User.builder()
					.name("test")
					.password("test")
					.email("test@gamil.com")
					.createdDate(LocalDateTime.now())
					.build());

			IntStream.rangeClosed(1,200).forEach(index -> boardRepository.save(Board.builder()
					.title("게시글"+index)
					.subTitle("순서"+index)
					.content("testContent")
					.boardType(BoardType.free)
					.createdDate(LocalDateTime.now())
					.updatedDate(LocalDateTime.now())
					.user(user)
					.build()));

		});


	}

}
