package CaseFtTeknoloji.FtTeknolojiCase.dal.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import CaseFtTeknoloji.FtTeknolojiCase.entities.concretes.User;

public interface UserDal extends JpaRepository<User, Integer> {

}
