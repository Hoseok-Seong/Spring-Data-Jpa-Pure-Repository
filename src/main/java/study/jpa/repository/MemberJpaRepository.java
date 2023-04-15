package study.jpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import study.jpa.entity.Member;

public interface MemberJpaRepository extends JpaRepository<Member, Long> {

}
