package hipshop.services;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hipshop.models.Card;
import hipshop.models.Member;
import hipshop.repositories.MemberRepository;



@Service
public class MemberService {
	
	@Autowired
	MemberRepository memberRepository;
	
	public ArrayList<Member> getMembers(){
		return (ArrayList<Member>) memberRepository.findAll();
	}
	public Member saveMember(Member user) {
		String firstName = user.getFirstName();
		String lastName = user.getLastName();
		Date dateBirth = user.getDateBirth();
		String address = user.getAddress();
		String email = user.getEmail();
		String password = user.getPassword();
		String phoneNumber = user.getPhoneNumber();
		String aka = user.getAka();
		
		if(email != null && password != null) {
			return memberRepository.save(user);
		}
		
		return user;
	}
	public Optional<Member> getUserById(Long id) {
		return memberRepository.findById(id);
	}
	public boolean deleteUser(Long id) {
		try {
			memberRepository.deleteById(id);
			return true;
		}catch(Exception error){
			return false;
		}
	}
	public ArrayList<Member> getUserByName(String firstName){
		return memberRepository.findByFirstName(firstName);
	}
}
