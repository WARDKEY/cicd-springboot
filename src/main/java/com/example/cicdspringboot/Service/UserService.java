package com.example.cicdspringboot.Service;

import org.springframework.stereotype.Service;

import com.example.cicdspringboot.entity.User;
import com.example.cicdspringboot.repository.UserRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class UserService {

	private final UserRepository userRepository;

	public String save(String name) {
		User user = new User();
		user.setName(name);

		userRepository.save(user);
		return "저장 완료";

	}
}
