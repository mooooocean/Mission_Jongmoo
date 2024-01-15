package com.example.Mission_Jongmoo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class MissionJongmooApplication {

	public static void main(String[] args) {
		SpringApplication.run(MissionJongmooApplication.class, args);
	}

	public class Board {
		private String name;
		private List<Post> posts;

		public class Post {
			private String title;
			private String content;
			private List<Comment> comments;

			public class Comment {
				private String content;
				}
			}
		}

	}