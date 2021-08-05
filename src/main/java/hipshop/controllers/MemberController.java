package hipshop.controllers;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import hipshop.models.Member;
import hipshop.services.MemberService;


@RestController
@RequestMapping("/user")
public class MemberController {

	@Autowired
	MemberService memberService;
	
	@GetMapping
	public ArrayList<Member> getUsers(){
		return memberService.getUsers();
	}
	@PostMapping
	public Member saveUser(@RequestBody Member user) {
			return memberService.saveUser(user);
	}
	@GetMapping(path = "/{id}")
	public Optional<Member> getUserById(@PathVariable("id") Long id){
		return memberService.getUserById(id);
	}
	@DeleteMapping(path = "/{id}")
	public String deleteUser(@PathVariable("id")Long id) {
		boolean ok = memberService.deleteUser(id);
		if(ok) {
			return "Se eliminó el usuario";
		}else {
			return "No se pudo eliminar el usuario";
		}
	}
	
	@GetMapping("/query")
	public ArrayList<Member> getUsersByName(@RequestParam(value = "name", defaultValue="")String name){
		return memberService.getUserByName(name); 
	}
	
}
